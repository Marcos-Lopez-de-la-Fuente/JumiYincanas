from bs4 import BeautifulSoup
import random
frases = open(r"C:\Users\monoq\Desktop\Workspace\DAM\DAM2\JumiYincanas\inteligenciaArtificial\prueba.txt")
markov_chain = {}

def add_sentence(frases, nueva_frase):
    print("add_sentence()")


















def scrap_sentences():
    print("scrap_sentences()")

















def split_sentences_in_words(frases):
    print("split_sentences_in_words()")








def add_word_to_chain(chain, state, palabra):
    print("add_word_to_chain()")









def compose_state(word1, word2="", word3=""):
    print("compose_state")










def two_words_markov_chain(frases):







    # El estado inicial es "start-start-start" y el estado final
    # "end-end-end" por decisión arbitraria

    # Creamos la cadena (el diccionario) vacio.
    markov_chain = {}
    
    # Recorrer todas las frases de la lista
    for frase in frases:
        # Inicio frase
        previous_word = actual_word = "start"
        state = "start-start-start"

        # Trocear cada frase en sus palabras
        for word in frase.split():
            # Añadir la palabra actual a la cadena
            add_word_to_chain(markov_chain, state, word)

            # Avazar una palabra en la frase actual
            previous_word = actual_word
            actual_word = word
            state = compose_state(actual_word, previous_word)

        # Fin de la frase -> Indicar que no ha palabra siguiente....
        add_world_to_chain(markov_chain, )



    return markov_chain


def tree_words_markov_chain(frases):
    print("tree_words_markov_chain()")




























def one_word_markov_chain(frases):
    print("one_word_markov_chain")





















def show_dictionary(d):
    print("show_dictionary()")






def create_sentence(markov_chain, number_of_words=2):
    new_sentence = []
    
    # Inicio de frase
    before_the_previoous_word = previous_word = actual_word = "start"
    if number_of_words < 2:
        print("if number_of_words < 2:")

    if number_of_words < 3:
        print("if number_of_words < 3:")

    state = "start-start-start"
    while True:
        new_word = random.choice(markov_chain[state])

        if new_word == "end-end-end":
            print('if new_word == "end-end-end":')


        new_sentence.append(new_word)

        # Cambio de estado
        if number_of_words > 2:
            print("if number_of_words > 2:")
        if number_of_words > 1:
            print("if number_of_words > 1:")

        actual_word = new_word
        state = compose_state(actual_word, previous_word, word3)




















































