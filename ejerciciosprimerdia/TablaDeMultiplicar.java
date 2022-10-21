package ejerciciosprimerdia;

// ! IMPRIMIR LA TABLA DE MULTIPLICAR DESDE EL 1 HASTA EL 15
public class TablaDeMultiplicar {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 15; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
