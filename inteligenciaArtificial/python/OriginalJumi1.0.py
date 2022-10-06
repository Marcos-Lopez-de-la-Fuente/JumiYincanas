#
# Autor: ):-$
# Inspidado en https://blog.adrianistan.eu/generar-frases-cadenas-markov-machine-learning-python
#

import random


def clean(dirty):
    # Eliminar blancos iniciales o finales
    clean = dirty.strip()

    # Eliminar blancos repetidos
    clean = clean.replace("  ", " ")

    # Eliminar saltos de linea
    clean = clean.replace('\n', "")

    # Poner primera letra en mayuscula
    clean = clean.capitalize()

    return clean


def add_sentence(sentences, new_sentence):
    # Dividir en varias frases al encontrar "." intermedios
    # También elimina los "." finales e intermedios
    for simple_sentence in new_sentence.split("."):
        if simple_sentence != "":
            sentences.append(clean(simple_sentence))


def add_word_to_chain(chain, state, word):
    if chain.get(state) == None:
        # Primera palabra que tiene este estado -> Hay que crear la lista
        chain[state] = [word]
    else:
        chain[state].append(word)


def create_initial_state(state_parts):
    intial_state = ""
    for i in range(0, state_parts):
        intial_state += "<<START-SENTENCE>>"

    return intial_state


def create_multipart_state_chain(sentences, state_parts):
    chain = {}

    for sentence in sentences:
        state = create_initial_state(state_parts)  # Inicio frase
        word_list = sentence.split()

        for pos in range(len(word_list)):

            add_word_to_chain(chain, state, word_list[pos])
            state = compose_multipart_state(
                state_parts,
                word_list[max(0, pos-state_parts+1):pos+1])

        add_word_to_chain(chain, state, "<<STOP-SENTENCE>>")

    return chain


def create_sentence(chain, state_parts=2):
    state = create_initial_state(state_parts)
    word = ""
    word_list = []  # Lista de palabras de la nueva frase
    while True:
        word = random.choice(chain[state])
        if word == "<<STOP-SENTENCE>>":
            break

        word_list.append(word)
        state = compose_multipart_state(state_parts, word_list[-state_parts:])

    return " ".join(word_list)


def compose_multipart_state(state_parts, parts_list):
    state = ""

    for i in range(0, state_parts-len(parts_list)):
        state += "<<START-SENTENCE>>"

    for part in parts_list:
        state += "<<"+part+">>"

    return state


def is_new_sentence(sentences, sentence_to_check):
    for sentence in sentences:
        if sentence == sentence_to_check:
            return(False)

    return(True)


def read_sentences_from_a_file(file_name):
    sentences = []
    with open(file_name, 'r') as filehandle:
        for new_sentence in filehandle:
            add_sentence(sentences, new_sentence)

    return (sentences)


###


sentences = read_sentences_from_a_file("C:\\Users\\marco\\Desktop\\Workspace\\DAM\\DAM2\\JumiYincanas\\inteligenciaArtificial\\textos\\star_wars.txt")
chain = create_multipart_state_chain(sentences, 3)
num_new_sentences = 0
new_sentences = []
while num_new_sentences < 20:
    new_sentence = create_sentence(chain, 3)

    if is_new_sentence(sentences, new_sentence):
        if is_new_sentence(new_sentences, new_sentence):
            num_new_sentences += 1
            new_sentences.append(new_sentence)


new_sentences.sort()
for s in new_sentences:
    print("> ", s)
