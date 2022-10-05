import random

archivo = open(r"C:\Users\marco\Desktop\Workspace\DAM\DAM2\JumiYincanas\inteligenciaArtificial\star_wars.txt")
markov_chain = {}
markov_chain["start-start-start"] = []


frases = []
for items in archivo:
    frases.__add__



for frase in frases:
    frase = frase.strip('\n')
    markov_chain["start-start-start"].append(frase.split(" ")[0])
    estado = "start-start-start"

    for palabra in frase.split(" "):

        if estado != "start-start-start":

            if estado not in markov_chain.keys():
                markov_chain[estado] = []

            markov_chain[estado].append(palabra)

        estado = palabra

    if estado not in markov_chain.keys():
        markov_chain[estado] = []

    markov_chain[estado].append("end-end-end")




print(frases.readline())

for frase in frases:
    print(frase)



# for i in range(1,101):

#     cierreDelBucle = True
#     while cierreDelBucle:
#         nuevaFrase = ""
#         estado = "start-start-start"
#         nuevaPalabra = ""

#         while nuevaPalabra != "end-end-end":

#             if estado != "start-start-start":
#                 nuevaFrase = nuevaFrase + " "
#             nuevaFrase = nuevaFrase + nuevaPalabra
#             nuevaPalabra = random.choice(markov_chain[estado])
#             estado = nuevaPalabra

#         nuevaFrase = nuevaFrase[1:]
#         fraseRepetida = False
#         frases = open(r"C:\Users\marco\Desktop\Workspace\DAM\DAM2\JumiYincanas\inteligenciaArtificial\star_wars.txt")

#         for frase in frases:

#             if nuevaFrase == frase.strip('\n'):
#                 fraseRepetida = True

#         if not fraseRepetida:
#             cierreDelBucle = False

#     print(i, "-->", nuevaFrase)





# def add_to_chain(estado, ):
#     if estado not in markov_chain.keys():
#         markov_chain[estado] = []

#     markov_chain[estado].append(palabra)