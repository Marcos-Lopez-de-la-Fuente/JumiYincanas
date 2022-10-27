package buffet.code.model;

public class Comensal implements Runnable {

    // ! Atributos
    private int platosComidos;
    private int tiempoComiendo;
    private int tiempoTertulia;
    private int tiempoEsperando;
    private ComensalStatus status;
    // TODO: Ns si falten los atributos de cuanto tardará en cada status segun un rango


    // ! Constructor
    public Comensal() {
        this.platosComidos = 0;
        this.tiempoComiendo = 0;
        this.tiempoTertulia = 0;
        this.tiempoEsperando = 0;
    }



    // ! Métodos
    public void comer() {
        this.status = ComensalStatus.COMIENDO;
    }

    public void tertulia() {
        this.status = ComensalStatus.HABLANDO;
    }

    public void cogerPlato() {
        this.status = ComensalStatus.COGIENDOPLATO;
    }



    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

}
