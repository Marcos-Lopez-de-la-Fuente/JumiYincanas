package inteligenciaArtificial;

import java.util.ArrayList;

import javax.sql.rowset.spi.SyncResolver;

public class prueba {
    public static void main(String[] args) {
        String s = "I want to walk my dog, cat, and tarantula; maybe even my tortoise.";
        String[] words = s.split(" ");
        
        ArrayList<String> resultado1 = new ArrayList<>();
        String palabras = "";
        for (int i = 0; i < words.length; i++) {
            if (i == 0 || i % 2 == 0) {
                palabras = words[i] + " ";
            } else {
                palabras = palabras + words[i];
                resultado1.add(palabras);
            }
        }

        for (int i = 0; i < resultado1.size(); i++) {
            System.out.println(resultado1.get(i));
        }
    }
}
