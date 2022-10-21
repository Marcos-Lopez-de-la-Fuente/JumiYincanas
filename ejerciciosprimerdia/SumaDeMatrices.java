package ejerciciosprimerdia;
import java.util.Scanner;

// ! PREGUNTAR AL USUARIO LAS DIMENSIONES DE 2 MATRICES, CREARLAS, SUMARLAS Y CREAR UNA TERCERA MATRIZ
public class SumaDeMatrices {

    // ! Solicitar información necesaria al usuario para el programa
    public static int[] solicitarInformacionUsuario() {
        int[] informacionDelUsuario = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la longitud X de las matrices: ");
        informacionDelUsuario[0] = scanner.nextInt();
        System.out.print("Introduce la longitud Y de las matrices: ");
        informacionDelUsuario[1] = scanner.nextInt();
        scanner.close();
        System.out.println();
        return informacionDelUsuario;
    }



    public static void main(String[] args) {

        // ! Solicitar información al usuario sobre las dimensiones de las matrices
        int[] informacionDelUsuario = solicitarInformacionUsuario();


        // ! Crear las matrices y asignar sus dimensiones correspondientes
        int[][] matriz1 = new int[informacionDelUsuario[1]][informacionDelUsuario[0]];
        int[][] matriz2 = new int[informacionDelUsuario[1]][informacionDelUsuario[0]];
        int[][] matrizSuma = new int[informacionDelUsuario[1]][informacionDelUsuario[0]];


        // ! Rellenar las matrices con números aleatorios entre el 1 y el 100
        MultiplicarMatices.rellenarMatriz(matriz1);
        MultiplicarMatices.rellenarMatriz(matriz2);


        // ! Sumar las 2 matrices y asignarle los valores a la nueva matriz
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[i].length; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }


        // ! Imprimir por pantalla los valores de las 3 matrices
        System.out.println("Matriz 1:");
        MultiplicarMatices.imprimirMatriz(matriz1);

        System.out.println("Matriz 2:");
        MultiplicarMatices.imprimirMatriz(matriz2);
        
        System.out.println("Suma de las 2 matrices:");
        MultiplicarMatices.imprimirMatriz(matrizSuma);
    }
}
