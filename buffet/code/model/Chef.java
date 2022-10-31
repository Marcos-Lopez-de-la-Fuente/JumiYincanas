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
    // TODO: Ns si falten los atributos de cuanto tardará en cada status segun un
    // rango

    // ! Constructor
    public Chef(Parrilla parrilla, AreaBuffet areaBuffet) {
        this.setTiempoTotalCocinando(0);
        this.setTiempoNoDescansado(0);
        this.setNumeroPlatosCocinados(0);
        this.setHorarioInicioDescanso(0);
        this.setTiempoTotalDescanso(0);
        this.setTiempoEspera(0);

        this.setParrilla(parrilla);
        this.setAreaBuffet(areaBuffet);
    }

    // ! Métodos
    public void cocinar() {
        this.setStatus(ChefStatus.COCINANDO);
    }

    public void descansar() {
        this.setStatus(ChefStatus.DESCANSANDO);
    }

    public void entregarPlato() {
        this.setStatus(ChefStatus.ENTREGANDO);
    }

    // ! Getters y Setters
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

    // ! Getters y Setters
    /**
     * @return the tiempoTotalCocinando
     */
    public int getTiempoTotalCocinando() {
        return tiempoTotalCocinando;
    }

    /**
     * @param tiempoTotalCocinando the tiempoTotalCocinando to set
     */
    public void setTiempoTotalCocinando(int tiempoTotalCocinando) {
        this.tiempoTotalCocinando = tiempoTotalCocinando;
    }

    /**
     * @return the tiempoNoDescansado
     */
    public int getTiempoNoDescansado() {
        return tiempoNoDescansado;
    }

    /**
     * @param tiempoNoDescansado the tiempoNoDescansado to set
     */
    public void setTiempoNoDescansado(int tiempoNoDescansado) {
        this.tiempoNoDescansado = tiempoNoDescansado;
    }

    /**
     * @return the numeroPlatosCocinados
     */
    public int getNumeroPlatosCocinados() {
        return numeroPlatosCocinados;
    }

    /**
     * @param numeroPlatosCocinados the numeroPlatosCocinados to set
     */
    public void setNumeroPlatosCocinados(int numeroPlatosCocinados) {
        this.numeroPlatosCocinados = numeroPlatosCocinados;
    }

    /**
     * @return the horarioInicioDescanso
     */
    public int getHorarioInicioDescanso() {
        return horarioInicioDescanso;
    }

    /**
     * @param horarioInicioDescanso the horarioInicioDescanso to set
     */
    public void setHorarioInicioDescanso(int horarioInicioDescanso) {
        this.horarioInicioDescanso = horarioInicioDescanso;
    }

    /**
     * @return the tiempoTotalDescanso
     */
    public int getTiempoTotalDescanso() {
        return tiempoTotalDescanso;
    }

    /**
     * @param tiempoTotalDescanso the tiempoTotalDescanso to set
     */
    public void setTiempoTotalDescanso(int tiempoTotalDescanso) {
        this.tiempoTotalDescanso = tiempoTotalDescanso;
    }

    /**
     * @return the tiempoEspera
     */
    public int getTiempoEspera() {
        return tiempoEspera;
    }

    /**
     * @param tiempoEspera the tiempoEspera to set
     */
    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    /**
     * @return the status
     */
    public ChefStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(ChefStatus status) {
        this.status = status;
    }

    /**
     * @return the parrilla
     */
    public Parrilla getParrilla() {
        return parrilla;
    }

    /**
     * @return the areaBuffet
     */
    public AreaBuffet getAreaBuffet() {
        return areaBuffet;
    }

}
