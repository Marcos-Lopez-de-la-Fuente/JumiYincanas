package buffet.code.model;

import java.util.ArrayList;
import java.util.Random;

public class RestauranteModelo {

    // ! Atributos
    private Reloj reloj;
    private ArrayList<Parrilla> parrillas;
    private ArrayList<AreaBuffet> areaBuffets;
    private ArrayList<Comensal> comensales;
    private ArrayList<Chef> chefs;

    private ParametrosSimulacion parametrosSimulacion;

    // ! Constructor
    public RestauranteModelo(int multiplicadorDeTiempo) {
        this.setReloj(new Reloj(multiplicadorDeTiempo));
        this.setParrillas(new ArrayList<Parrilla>());
        this.setAreaBuffets(new ArrayList<AreaBuffet>());
        this.setComensales(new ArrayList<Comensal>());
        this.setChefs(new ArrayList<Chef>());
    }

    // ! Métodos
    public void addParrilla(int cantidadDeParrillas, int capacidadMaxima) {
        for (int i = 0; i < cantidadDeParrillas; i++) {
            this.getParrillas().add(new Parrilla(capacidadMaxima));
        }
    }

    public void addAreaBuffets(String descripcion, int numeroMaximo) {
        this.getAreaBuffets().add(new AreaBuffet(descripcion, numeroMaximo));
    }

    public void addComensales() {
        int cantidadDeComensales = new Random().nextInt(this.getParametrosSimulacion().minNumComensal,
                this.getParametrosSimulacion().maxNumComensal);

        for (int i = 0; i < cantidadDeComensales; i++) {
            this.getComensales().add(new Comensal());
        }
    }

    // TODO FaLta hacer acabar este método
    public void addChefs(Parrilla parrilla, AreaBuffet areaBuffet) {
        this.getChefs().add(new Chef(parrilla, areaBuffet));
    }

    public void play() {

    }

    public void stop() {

    }

    public void pause() {

    }

    public void cambiarStatusChef() {

    }

    public void cambiarStatusComensal() {

    }

    public void cambiarStatusAreaBuffet() {

    }

    public void cambiarStatusParrilla() {

    }

    // ! Getters y Setters
    /**
     * @return the reloj
     */
    public Reloj getReloj() {
        return reloj;
    }

    /**
     * @param reloj the reloj to set
     */
    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    /**
     * @return the parrillas
     */
    public ArrayList<Parrilla> getParrillas() {
        return parrillas;
    }

    /**
     * @param parrillas the parrillas to set
     */
    public void setParrillas(ArrayList<Parrilla> parrillas) {
        this.parrillas = parrillas;
    }

    /**
     * @return the areaBuffets
     */
    public ArrayList<AreaBuffet> getAreaBuffets() {
        return areaBuffets;
    }

    /**
     * @param areaBuffets the areaBuffets to set
     */
    public void setAreaBuffets(ArrayList<AreaBuffet> areaBuffets) {
        this.areaBuffets = areaBuffets;
    }

    /**
     * @return the comensales
     */
    public ArrayList<Comensal> getComensales() {
        return comensales;
    }

    /**
     * @param comensales the comensales to set
     */
    public void setComensales(ArrayList<Comensal> comensales) {
        this.comensales = comensales;
    }

    /**
     * @return the chefs
     */
    public ArrayList<Chef> getChefs() {
        return chefs;
    }

    /**
     * @param chefs the chefs to set
     */
    public void setChefs(ArrayList<Chef> chefs) {
        this.chefs = chefs;
    }

    /**
     * @return the parametrosSimulacion
     */
    public ParametrosSimulacion getParametrosSimulacion() {
        return parametrosSimulacion;
    }

    /**
     * @param parametrosSimulacion the parametrosSimulacion to set
     */
    public void setParametrosSimulacion(int minTiempoCoccion, int maxTiempoCoccion, int minNumComensal,
            int maxNumComensal, int minNumChef, int maxNumChef, int minTiempoConsumir,
            int maxTiempoConsumir, int minTiempoTertulia, int maxTiempoTertulia,
            int minTiempoDescanso, int maxTiempoDescanso, int minChefParrilla, int maxChefParrilla,
            int maxPlatosAreaBuffet, int minTiempoCocinando, int maxTiempoCocinando,
            int limitePlatosEnCola) {
        this.parametrosSimulacion = new ParametrosSimulacion(minTiempoCoccion, maxTiempoCoccion, minNumComensal,
                maxNumComensal, minNumChef, maxNumChef, minTiempoConsumir, maxTiempoConsumir, minTiempoTertulia,
                maxTiempoTertulia, minTiempoDescanso, maxTiempoDescanso, minChefParrilla, maxChefParrilla,
                maxPlatosAreaBuffet, minTiempoCocinando, maxTiempoCocinando, limitePlatosEnCola);
    }

}
