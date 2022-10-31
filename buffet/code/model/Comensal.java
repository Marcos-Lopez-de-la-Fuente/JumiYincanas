package buffet.code.model;

public class Comensal implements Runnable {

    // ! Atributos
    private int platosComidos;
    private int tiempoComiendo;
    private int tiempoTertulia;
    private int tiempoEsperando;
    private ComensalStatus status;
    // TODO: Ns si falten los atributos de cuanto tardará en cada status segun un
    // rango

    // ! Constructor
    public Comensal() {
        this.setPlatosComidos(0);
        this.setTiempoComiendo(0);
        this.setTiempoTertulia(0);
        this.setTiempoEsperando(0);
    }

    // ! Métodos
    public void comer() {
        this.setStatus(ComensalStatus.COMIENDO);
    }

    public void tertulia() {
        this.setStatus(ComensalStatus.HABLANDO);
    }

    public void cogerPlato() {
        this.setStatus(ComensalStatus.COGIENDOPLATO);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }




    // ! Getters y Setters
    /**
     * @return the platosComidos
     */
    public int getPlatosComidos() {
        return platosComidos;
    }

    /**
     * @param platosComidos the platosComidos to set
     */
    public void setPlatosComidos(int platosComidos) {
        this.platosComidos = platosComidos;
    }

    /**
     * @return the tiempoComiendo
     */
    public int getTiempoComiendo() {
        return tiempoComiendo;
    }

    /**
     * @param tiempoComiendo the tiempoComiendo to set
     */
    public void setTiempoComiendo(int tiempoComiendo) {
        this.tiempoComiendo = tiempoComiendo;
    }

    /**
     * @return the tiempoTertulia
     */
    public int getTiempoTertulia() {
        return tiempoTertulia;
    }

    /**
     * @param tiempoTertulia the tiempoTertulia to set
     */
    public void setTiempoTertulia(int tiempoTertulia) {
        this.tiempoTertulia = tiempoTertulia;
    }

    /**
     * @return the tiempoEsperando
     */
    public int getTiempoEsperando() {
        return tiempoEsperando;
    }

    /**
     * @param tiempoEsperando the tiempoEsperando to set
     */
    public void setTiempoEsperando(int tiempoEsperando) {
        this.tiempoEsperando = tiempoEsperando;
    }

    /**
     * @return the status
     */
    public ComensalStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(ComensalStatus status) {
        this.status = status;
    }

}
