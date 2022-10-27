package buffet.code.model;

public class Chef implements Runnable {

    // ! Atributos
    private int tiempoTotalCocinando;
    private int tiempoNoDescansado;
    private int numeroPlatosCocinados;
    private int horarioInicioDescanso;
    private int tiempoTotalDescanso;
    private int tiempoEspera;
    private ChefStatus status;

    private Parrilla parrilla;
    private AreaBuffet areaBuffet;
    // TODO: Ns si falten los atributos de cuanto tardará en cada status segun un rango



    // ! Constructor
    public Chef(Parrilla parrilla, AreaBuffet areaBuffet) {
        this.tiempoTotalCocinando = 0;
        this.tiempoNoDescansado = 0;
        this.numeroPlatosCocinados = 0;
        this.horarioInicioDescanso = 0;
        this.tiempoTotalDescanso = 0;
        this.tiempoEspera = 0;
        this.setParrilla(parrilla);
        this.setAreaBuffet(areaBuffet);
    }



    // ! Métodos
    public void cocinar() {
        this.status = ChefStatus.COCINANDO;
    }

    public void descansar() {
        this.status = ChefStatus.DESCANSANDO;
    }

    public void entregarPlato() {
        this.status = ChefStatus.ENTREGANDO;
    }

    public void setParrilla(Parrilla parrilla) {
        this.parrilla = parrilla;
    }

    public void setAreaBuffet(AreaBuffet areaBuffet) {
        this.areaBuffet = areaBuffet;
    }



    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

}
