package buffet.code.model;

public class Parrilla {

    // ! Atributos
    private int capacidadMaxima;
    private int numeroDeAlimentos;
    private boolean usable;

    // ! Constructor
    public Parrilla(int capacidadMaxima) {
        this.setCapacidadMaxima(capacidadMaxima);
        this.setNumeroDeAlimentos(0);
        this.setUsable(true);
    }

    // ! Métodos
    public synchronized void addPlato() {

        // Si la parrilla está llena
        while (this.getCapacidadMaxima() == this.getNumeroDeAlimentos()) {
            try {
                // El cocinero esperará hasta que se remueva un plato de la parrilla
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.setNumeroDeAlimentos(this.getNumeroDeAlimentos() + 1);
    }

    public synchronized void removePlato() {
        this.setNumeroDeAlimentos(this.getNumeroDeAlimentos() - 1);

        // Si hay algún cocinero esperando para añadir un plato, se notificará de ya lo
        // puede añadir
        notifyAll();
    }

    // ! Getters y Setters
    /**
     * @return the capacidadMaxima
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * @param capacidadMaxima the capacidadMaxima to set
     */
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * @return the numeroDeAlimentos
     */
    public int getNumeroDeAlimentos() {
        return numeroDeAlimentos;
    }

    /**
     * @param numeroDeAlimentos the numeroDeAlimentos to set
     */
    public void setNumeroDeAlimentos(int numeroDeAlimentos) {
        this.numeroDeAlimentos = numeroDeAlimentos;
    }

    /**
     * @return the usable
     */
    public boolean isUsable() {
        return usable;
    }

    /**
     * @param usable the usable to set
     */
    public void setUsable(boolean usable) {
        this.usable = usable;
    }

}
