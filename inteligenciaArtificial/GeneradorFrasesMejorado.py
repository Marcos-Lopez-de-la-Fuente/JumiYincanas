
# ! IMPORTS
import random





def leerArchivo(file): # ! Leer un archivo pasado por parámetro
    frases = [] # Array de frases que devolverá la función

    with open(file) as archivo: # Se abre el archivo
        for item in archivo: # Se iteran los elementos del archivo
            frases.append(item.strip('\n')) # Se le quitan los saltos de línea

    return frases # Devuelve un Array de frases del archivo





def comprobarFraseRepetida(frases, nuevaFrase): # ! Comprobar si la frase generada ya existe en el documento
    fraseRepetida = False

    for frase in frases:

        if nuevaFrase == frase:
            fraseRepetida = True

    return fraseRepetida





def imprimirArrayStrings(arrayStrings): # ! Imprimir un Array de Strings
    contador = 1
    for texto in arrayStrings:
        print(contador, "-->", texto)
        contador += 1



def comprobarKeyDiccionario(estado, diccionario): # ! Comprueba si el "estado" existe como "key" en el "diccionario", en caso negativo lo crea con un valor "[]"
    if estado not in diccionario.keys(): # Si el estado no se ha almacenado anteriormente como "key"
        diccionario[estado] = [] # Se añade el estado con un Array vacio
    return diccionario



def crearDiccionario(frases): # ! Crea un diccionario recorriendo todas las frases pasadas por parámetro
    diccionario = {"start-start-start": []} # TODO Tengo que preguntar a Jumi si prefiere crear la key "start-start-start" así

    for frase in frases: # Se recorren las diferentes frases del Array
        diccionario["start-start-start"].append(frase.split(" ")[0]) # Se añade la primera palabra de cada frase como valor de la key "start"
        estado = "start-start-start" # Se establece el estado inicial

        for palabra in frase.split(" "): # Se recorren las palabras de la frase

            if estado != "start-start-start": # Si no se está ejecutando el primer ciclo

                diccionario = comprobarKeyDiccionario(estado, diccionario)

                diccionario[estado].append(palabra) # Se añade la "palabra" actual al Array de la "key" "estado"

            estado = palabra  # Se asigna "estado" con el valor de "palabra" para pasar a la siguiente repetición

        diccionario = comprobarKeyDiccionario(estado, diccionario)

        diccionario[estado].append("end-end-end") # Se añade "end-end-end" al Array de la "key" "estado" (Última palabra de la frase)

    return diccionario




def generadorDeFrases(diccionario, frases): # TODO Preguntar a Jumi que partes se pueden acortar
    frasesGeneradasArray = []
    for i in range(1,101): # Se generarán 100 frases

        cierreDelBucle = True
        while cierreDelBucle:
            nuevaFrase = ""
            estado = "start-start-start"
            nuevaPalabra = ""

            while nuevaPalabra != "end-end-end":

                if estado != "start-start-start":
                    nuevaFrase = nuevaFrase + " "

                nuevaFrase = nuevaFrase + nuevaPalabra
                nuevaPalabra = random.choice(diccionario[estado])
                estado = nuevaPalabra

            nuevaFrase = nuevaFrase[1:]

            if not comprobarFraseRepetida(frases, nuevaFrase): # Si la frase no se repite con ninguna del documento original
                cierreDelBucle = False # Al cambiar esta variable se dará por finalizada 1 frase saliendo del bucle

        frasesGeneradasArray.append(nuevaFrase)

    return frasesGeneradasArray










# ! MAIN


archivoLeido = leerArchivo("C:\\Users\\monoq\\Desktop\\Workspace\\DAM\\DAM2\\JumiYincanas\\inteligenciaArtificial\\prueba.txt")


diccionario = crearDiccionario(archivoLeido)


frasesGeneradas = generadorDeFrases(diccionario, archivoLeido)


imprimirArrayStrings(frasesGeneradas)

