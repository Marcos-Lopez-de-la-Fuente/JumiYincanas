package buffet.code.model;

public class AreaBuffet {

    // ! Atributos
    private String descripcion;
    private int numeroMaximo;
    private int numeroPlatos;
    private int platosEnEspera;
    // TODO Creo que falta el atributo "maximosPlatosEnEspera"

    // ! Constructor
    public AreaBuffet(String descripcion, int numeroMaximo) {
        this.setDescripcion(descripcion);
        this.setNumeroMaximo(numeroMaximo);
        this.setNumeroPlatos(0);
        this.setPlatosEnEspera(0);
    }

    // ! Métodos
    public synchronized void addPlato() {

        // Si el buffet está lleno
        while (this.getNumeroMaximo() == this.getNumeroPlatos()) {
            try {

                // El cocinero esperará hasta que se remueva un plato del buffet
                this.addPlatoEspera();
                // TODO: Si se añade el atributo "maximosPlatosEnEspera" es posible que tenga
                // que comprobar aquí si ha llegado al máximo, en cullo caso el atributo
                // "usable" de la clase "Parrilla" se debería cambiar a "false"

                wait();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (this.getPlatosEnEspera() > 0) {
            this.removePlatoEspera();
        }

        this.setNumeroPlatos(this.getNumeroPlatos() + 1);
    }

    public synchronized void servirPlato() {
        this.setNumeroPlatos(this.getNumeroPlatos() - 1);

        // Si hay algún cocinero esperando para añadir un plato, se notificará de ya lo
        // puede añadir
        notifyAll();
    }

    public void addPlatoEspera() {
        this.setPlatosEnEspera(this.getPlatosEnEspera() + 1);
    }

    public void removePlatoEspera() {
        this.setPlatosEnEspera(this.getPlatosEnEspera() - 1);
    }

    // ! Getters y Setters
    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the numeroMaximo
     */
    public int getNumeroMaximo() {
        return numeroMaximo;
    }

    /**
     * @param numeroMaximo the numeroMaximo to set
     */
    public void setNumeroMaximo(int numeroMaximo) {
        this.numeroMaximo = numeroMaximo;
    }

    /**
     * @return the numeroPlatos
     */
    public int getNumeroPlatos() {
        return numeroPlatos;
    }

    /**
     * @param numeroPlatos the numeroPlatos to set
     */
    public void setNumeroPlatos(int numeroPlatos) {
        this.numeroPlatos = numeroPlatos;
    }

    /**
     * @return the platosEnEspera
     */
    public int getPlatosEnEspera() {
        return platosEnEspera;
    }

    /**
     * @param platosEnEspera the platosEnEspera to set
     */
    public void setPlatosEnEspera(int platosEnEspera) {
        this.platosEnEspera = platosEnEspera;
    }

}
