package threads.ejercicio;

public class Contador {
    private int contador;

    public Contador() {
        this.contador = 0;
    }

    public synchronized void incrementar() {
        this.comprobarNegativo();

        this.contador++;
        notifyAll();
    }

    public synchronized void decrementar() {

        while (this.contador < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.contador--;
        this.comprobarNegativo();
    }

    public int mostrar() {
        return this.contador;
    }

    public void comprobarNegativo() {
        if (this.contador < 0) {
            System.out.println(this.contador);
            System.err.println("ERROR, contador negativo");
        }
    }
}
