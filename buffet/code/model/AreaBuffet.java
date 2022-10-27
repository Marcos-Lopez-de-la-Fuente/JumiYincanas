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
        this.descripcion = descripcion;
        this.numeroMaximo = numeroMaximo;
        this.numeroPlatos = 0;
        this.platosEnEspera = 0;
    }



    // ! Métodos
    public synchronized void addPlato() {

        // Si el buffet está lleno
        while (this.numeroMaximo == this.numeroPlatos) {
            try {

                // El cocinero esperará hasta que se remueva un plato del buffet
                this.addPlatoEspera();
                // TODO: Si se añade el atributo "maximosPlatosEnEspera" es posible que tenga que
                // comprobar aquí si ha llegado al máximo, en cullo caso el atributo "usable" de la
                // clase "Parrilla" se debería cambiar a "false"

                wait();
                this.removePlatoEspera();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

        this.numeroPlatos++;
    }

    public synchronized void servirPlato() {
        this.numeroPlatos--;

        // Si hay algún cocinero esperando para añadir un plato, se notificará de ya lo puede añadir
        notifyAll();
    }

    public void addPlatoEspera() {
        this.platosEnEspera++;
    }

    public void removePlatoEspera() {
        this.platosEnEspera--;
    }

}
