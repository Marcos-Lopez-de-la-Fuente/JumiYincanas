package threads.ejercicio;

public class Contador {
    private int contador;


    public Contador () {
        this.contador = 0;
    }


    public void incrementar() {
        this.contador++;
    }

    public void decrementar() {
        this.contador--;
    }

    public int mostrar() {
        return this.contador;
    }

}
