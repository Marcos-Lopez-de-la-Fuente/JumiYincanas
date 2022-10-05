import random
frases = open(r"C:\Users\monoq\Desktop\Workspace\DAM\DAM2\JumiYincanas\inteligenciaArtificial\prueba.txt")
markov_chain = {}



for frase in frases:
    frase = frase.strip('\n')
    if "start-start-start" not in markov_chain.keys():
        markov_chain["start-start-start"] = [frase.split(" ")[0]]
    elif "start-start-start" in markov_chain.keys():
        markov_chain["start-start-start"].append(frase.split(" ")[0])
    for index, palabra in enumerate(frase.split(" ")):
        if index + 1 < len(frase.split(" ")):
            if palabra not in markov_chain.keys():
                markov_chain[palabra] = [frase.split(" ")[index + 1]]
            elif palabra in markov_chain.keys():
                markov_chain[palabra].append(frase.split(" ")[index + 1])
        elif index + 1 == len(frase.split(" ")):
            if palabra not in markov_chain.keys():
                markov_chain[palabra] = ["end-end-end"]
            elif palabra in markov_chain.keys():
                markov_chain[palabra].append("end-end-end")




for i in range(100):
    cierreDelBucle = True
    while cierreDelBucle:
        nuevaFrase = ""
        estado = "start-start-start"
        nuevaPalabra = ""
        while nuevaPalabra != "end-end-end":
            if estado != "start-start-start":
                nuevaFrase = nuevaFrase + " "
            nuevaFrase = nuevaFrase + nuevaPalabra
            nuevaPalabra = random.choice(markov_chain[estado])
            estado = nuevaPalabra
        nuevaFrase = nuevaFrase[1:]
        fraseRepetida = False
        frases = open(r"C:\Users\monoq\Desktop\Workspace\DAM\DAM2\JumiYincanas\inteligenciaArtificial\prueba.txt")
        for frase in frases:
            if nuevaFrase == frase.strip('\n'):
                fraseRepetida = True
        if not fraseRepetida:
            cierreDelBucle = False
    print(i,nuevaFrase)

