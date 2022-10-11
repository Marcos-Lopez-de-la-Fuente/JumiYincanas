package threads.ejercicio;

public class Productor extends Thread {
    private Contador contador;

    public void run() {
        for (int i = 0; i < 1000; i++) {
            this.contador.incrementar();
        }
    }

    public Productor (Contador contador) {
        this.contador = contador;
    }
}
