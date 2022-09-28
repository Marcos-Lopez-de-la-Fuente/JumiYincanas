
// ! CREAR UNA MATRIZ DE 2 DIMENSIONES CON 10 NÚMEROS EN CADA DIMENSIÓN Y ORDENARLOS
public class OrdenarMatriz {

    // ! Método para ordenar una matriz
    public static void ordenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                ArrayDe100.ordenarArrays(matriz[i]);
            }
        }
    }



    public static void main(String[] args) {
        // ! Crear la matriz y rellenarla de números entre el 1 y el 100
        int[][] matriz = new int[2][10];
        MultiplicarMatices.rellenarMatriz(matriz);


        // ! Imprimir la matriz desordenada al usuario
        System.out.println("Matriz desordenada:");
        MultiplicarMatices.imprimirMatriz(matriz);


        // ! Ordenar la matriz
        ordenarMatriz(matriz);


        // ! Imprimir la matriz ordenada al usuario
        System.out.println("Matriz ordenada:");
        MultiplicarMatices.imprimirMatriz(matriz);
    }
}
