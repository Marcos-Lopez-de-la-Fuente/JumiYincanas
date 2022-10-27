package buffet.code.model;

public class Parrilla {

    // ! Atributos
    private int capacidadMaxima;
    private int numeroDeAlimentos;
    private boolean usable;



    // ! Constructor
    public Parrilla(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.numeroDeAlimentos = 0;
        this.usable = true;
    }



    // ! Métodos
    public synchronized void addPlato() {

        // Si la parrilla está llena
        while (this.capacidadMaxima == this.numeroDeAlimentos) {
            try {
                // El cocinero esperará hasta que se remueva un plato de la parrilla
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.numeroDeAlimentos++;
    }

    public synchronized void removePlato() {
        this.numeroDeAlimentos--;

        // Si hay algún cocinero esperando para añadir un plato, se notificará de ya lo puede añadir
        notifyAll();
    }
}
