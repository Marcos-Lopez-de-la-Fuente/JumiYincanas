package ejerciciosprimerdia;
import java.util.Random;

// ! CREAR UN ARRAY CON 100 NÚMEROS ALEATORIOS Y ORDENARLOS
public class ArrayDe100 {

    // ! Rellenar el contenido del array con números del 1 al 100
    public static void rellenarArrays(int[] array) {
        Random random = new Random();
        for (int j = 0; j < array.length; j++) {
            array[j] = random.nextInt(1,100);
        }
    }


    // ! Imprimir por pantalla el contenido de un array
    public static void imprimirArrays(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println("\n");
    }


    // ! Ordenar un Array de menor a mayor
    public static void ordenarArrays(int[] arrayDesordenado) {
        int[] arrayOrdenado = new int[arrayDesordenado.length];
        for (int i = 0; i < arrayDesordenado.length; i++) {
            int numero = 101;
            int posicion = 0;
            for (int j = 0; j < arrayDesordenado.length; j++) {
                if (arrayDesordenado[j] < numero) {
                    numero = arrayDesordenado[j];
                    posicion = j;
                }
            }
            arrayOrdenado[i] = numero;
            arrayDesordenado[posicion] = 101;
        }
        for (int i = 0; i < arrayOrdenado.length; i++) {
            arrayDesordenado[i] = arrayOrdenado[i];
        }
    }



    public static void main(String[] args) {
        // ! Se crea el "array" de 100 posiciones
        int[] array = new int[100];

        // ! Se rellena el contenido del array con números aleatorios
        rellenarArrays(array);

        // ! Se imprime el array desordenado al usuario
        System.out.println("Array sin ordenar:");
        imprimirArrays(array);

        // ! Se ordena el array
        ordenarArrays(array);

        // ! Se imprime el array ordenado al usuario
        System.out.println("Array ordenado:");
        imprimirArrays(array);
    }
}
