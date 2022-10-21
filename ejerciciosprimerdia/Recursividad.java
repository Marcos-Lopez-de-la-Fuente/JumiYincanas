package ejerciciosprimerdia;
import java.util.Scanner;

// ! PEDIR AL USUARIO 1 NÚMERO Y SUMAR CADA NÚMERO DESDE ESTE HASTA 1 [5 --> 5+4+3+2+1 = 15]
public class Recursividad {

    // ! Método principal para conseguir la recursividad
    public static int recursividad(int numero) {
        if (numero == 1) { // Cuando haya pasado por todos los números hasta "1", se cerrará la recursividad
            return numero;
        }
        // Mientras que "numero" no sea "1" se ejecutará otra vez un método dentro de otro siendo el siguiente "numero - 1"
        return recursividad(numero - 1) + numero;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime un número: ");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.print("Resultado: " + recursividad(numero));
    }
}
