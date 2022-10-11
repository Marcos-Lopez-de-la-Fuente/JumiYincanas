package threads.ejercicio;

public class Consumidor extends Thread {
    private Contador contador;

    public void run() {
        for (int i = 0; i < 1000; i++) {
            this.contador.decrementar();
        }
    }

    public Consumidor (Contador contador) {
        this.contador = contador;
    }

}
