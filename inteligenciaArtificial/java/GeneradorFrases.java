package inteligenciaartificial.java;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Random;

import java.util.Arrays;
import java.util.List;


public class GeneradorFrases {

    public static void main(String[] args) {
        
        try {
            File file1 = new File("C:/Users/marco/Desktop/Workspace/DAM/DAM2/JumiYincanas/inteligenciaArtificial/prueba.txt");
            ArrayList<String> frases = leerBufferTexto(file1);

            HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();




            for (int i = 0; i < frases.size(); i++) {
                List<String> frase = separadorPalabras(frases.get(i), 1);

                // System.out.println(frase);

                if (!hashMap.containsKey("start-start-start")) {
                    ArrayList<String> valueHashMap = new ArrayList<String>();
                    valueHashMap.add(frase.get(0));
                    hashMap.put("start-start-start", valueHashMap);
                }
                else if (hashMap.containsKey("start-start-start")) {
                    hashMap.get("start-start-start").add(frase.get(0));
                }
                for (int j = 0; j < frase.size(); j++) {
                    if (j + 1 < frase.size()) {
                        if (!hashMap.containsKey(frase.get(j))) {
                            ArrayList<String> valueHashMap = new ArrayList<String>();
                            valueHashMap.add(frase.get(j + 1));
                            hashMap.put(frase.get(j), valueHashMap);
                        } else if (hashMap.containsKey(frase.get(j))) {
                            hashMap.get(frase.get(j)).add(frase.get(j + 1));
                        }
                    } else if (j + 1 == frase.size()) {
                        if (!hashMap.containsKey(frase.get(j))) {
                            ArrayList<String> valueHashMap = new ArrayList<String>();
                            valueHashMap.add("end-end-end");
                            hashMap.put(frase.get(j), valueHashMap);
                        } else if (hashMap.containsKey(frase.get(j))) {
                            hashMap.get(frase.get(j)).add("end-end-end");
                        }
                    }
                }
            }


System.out.println(hashMap);

            String nuevaFrase = "";
            for (int i = 1; i <= 100; i++) {
                boolean cierreDelBucle = true;
                while (cierreDelBucle) {
                    nuevaFrase = "";
                    String estado = "start-start-start";
                    String nuevaPalabra = "";
                    while (nuevaPalabra != "end-end-end") {
                        if (estado != "start-start-start") {
                            nuevaFrase = nuevaFrase + " ";
                        }
                        nuevaFrase = nuevaFrase + nuevaPalabra;
                        nuevaPalabra = hashMap.get(estado).get(new Random().nextInt(hashMap.get(estado).size()));
                        estado = nuevaPalabra;
                    }
                    nuevaFrase = nuevaFrase.substring(1, nuevaFrase.length());
                    boolean fraseRepetida = false;
                    for (int j = 0; j < frases.size(); j++) {
                        if (nuevaFrase.equals(frases.get(j))) {
                            fraseRepetida = true;
                        }
                    }
                    if (!fraseRepetida) {
                        cierreDelBucle = false;
                    }
                }
                System.out.println(i + " --> " + nuevaFrase);
            }






        } catch (Exception e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }



        // List<String> a = separadorPalabras("I want to walk my dog, cat, and tarantula; maybe even my tortoise.", 2);

        // System.out.println(a);
    }



    public static ArrayList<String> leerBufferTexto(File file) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        ArrayList<String> resultado = new ArrayList<String>();
        String linea="";
        // Cuando el método "readLine()" no encuentre más líneas, la variable se establecerá en "null" 
        while (linea != null) {
            // Método para asignar la nueva línea a la variable
            linea = bufferedReader.readLine();
            // Con este "if" consegimos que no imprima el valor "null" en el último ciclo
            if (linea !=  null) {
                resultado.add(linea);
            }
        }
        bufferedReader.close();
        return resultado;
    }












    public static List<String> separadorPalabras(String frase, int cadaXPalabras) {
        List<String> porPalabras = new ArrayList<String>(Arrays.asList(frase.split(" ")));
        List<String> respuesta = new ArrayList<String>();
        int contadorPalabras = 0;
        String palabras = "";
            for (int i = 0; i < porPalabras.size(); i++) {
                if (contadorPalabras != 0) {
                    palabras = palabras + " ";
                }
                if (contadorPalabras == 0 && i + 1 == porPalabras.size()) {
                    respuesta.add(porPalabras.get(i));
                    i = porPalabras.size();
                }
                if (contadorPalabras == 0 && i + 2 == porPalabras.size() && cadaXPalabras == 3) {
                    palabras = porPalabras.get(i) + " " + porPalabras.get(i + 1);
                    respuesta.add(palabras);
                    palabras = "";
                    i = porPalabras.size();
                }
                else if (contadorPalabras + 1 < cadaXPalabras) {
                    if (i < porPalabras.size()) {
                        palabras = palabras + porPalabras.get(i);
                        contadorPalabras++;
                    }
                } else {
                    if (i < porPalabras.size()) {
                        palabras = palabras + porPalabras.get(i);
                        respuesta.add(palabras);
                        palabras = "";
                        contadorPalabras = 0;
                    }
                }
            }
        return respuesta;
    }
}