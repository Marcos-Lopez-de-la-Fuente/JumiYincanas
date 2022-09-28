import java.util.Random;
import java.util.Scanner;

public class MultiplicarMatices {

    // ! Solicitar la información necesaria al usuario para el ejercicio
    public static int[] solicitarInformacionUsuario() {
        int[] informacionDelUsuario = new int[4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la longitud X de la primer matriz: ");
        informacionDelUsuario[0] = scanner.nextInt();
        System.out.println("Dime la longitud Y de la primer matriz: ");
        informacionDelUsuario[1] = scanner.nextInt();
        System.out.println("Dime la longitud Y de la segunda matriz: ");
        informacionDelUsuario[2] = scanner.nextInt();
        scanner.close();
        System.out.println();

        if (informacionDelUsuario[1] > informacionDelUsuario[2]) {
            informacionDelUsuario[3] = informacionDelUsuario[1];
        } else {
            informacionDelUsuario[3] = informacionDelUsuario[2];
        }

        return informacionDelUsuario;
    }


    // ! Rellenar una matriz con números aleatorios entre el 1 y el 100
    public static void rellenarMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(1,100);
            }
        }
    }


    // ! Imprimir por pantalla una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    // ! Multiplicar 2 matrices
    public static void multiplicarMatrices(int[][] matriz1, int[][] matriz2, int[][] matrizResultante) {
        for (int i = 0; i < matrizResultante.length; i++) {
            for (int j = 0; j < matrizResultante[i].length; j++) {
                int suma = 0;
                for (int j2 = 0; j2 < matriz1[i].length; j2++) {
                    suma = suma + matriz1[i][j2] * matriz2[j2][j];
                }
                matrizResultante[i][j] = suma;
            }
        }
    }



    public static void main(String[] args) {
        // ! Solicitar información al usuario sobre las dimensiones de las matrices
        int[] informacionDelUsuario = solicitarInformacionUsuario();

        // ! Crear las matrices y asignar sus dimensiones correspondientes
        int[][] matriz1 = new int[informacionDelUsuario[0]][informacionDelUsuario[1]];
        int[][] matriz2 = new int[informacionDelUsuario[1]][informacionDelUsuario[2]];
        int[][] matrizResultante = new int[informacionDelUsuario[0]][informacionDelUsuario[3]];


        // ! Rellenar el contenido de las matrices con números aleatorios
        rellenarMatriz(matriz1);
        rellenarMatriz(matriz2);


        // ! Multiplicar las matrices y asignar el resultado de la multiplicación a "matrizResultante"
        multiplicarMatrices(matriz1, matriz2, matrizResultante);


        // ! Imprimir el contenido de las matrices al usuario
        System.out.println("Matriz A:");
        imprimirMatriz(matriz1);

        System.out.println("Matriz B:");
        imprimirMatriz(matriz2);

        System.out.println("Resultado:");
        imprimirMatriz(matrizResultante);
    }
}
