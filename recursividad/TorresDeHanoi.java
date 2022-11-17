package recursividad;

public class TorresDeHanoi {

    public static void torreHanoi(int n, int origen, int auxiliar, int destino) {
        if (n > 0) {
            torreHanoi(n - 1, origen, auxiliar, destino);
            System.out.println("Se mueve anillo desde torre " + origen + " hasta torre " + destino);
            torreHanoi(n - 1, auxiliar, destino, origen);
        }

    }

    public static void main(String[] args) {
        torreHanoi(3, 1, 2, 3);
    }
}
