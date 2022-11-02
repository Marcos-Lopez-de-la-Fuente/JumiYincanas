package buffet.code.model;


// ! Añadir final a los atributos
public class ParametrosSimulacion {
    public int minTiempoCoccion;
    public int maxTiempoCoccion;
    public int minNumComensal;
    public int maxNumComensal;
    public int minNumChef;
    public int maxNumChef;
    public int minTiempoConsumir;
    public int maxTiempoConsumir;
    public int minTiempoTertulia;
    public int maxTiempoTertulia;
    public int minTiempoDescanso;
    public int maxTiempoDescanso;
    public int minChefParrilla;
    public int maxChefParrilla;
    public int maxPlatosAreaBuffet;
    public int minTiempoCocinando;
    public int maxTiempoCocinando;
    public int limitePlatosEnCola;

    public ParametrosSimulacion(int minTiempoCoccion, int maxTiempoCoccion, int minNumComensal,
            int maxNumComensal, int minNumChef, int maxNumChef, int minTiempoConsumir,
            int maxTiempoConsumir, int minTiempoTertulia, int maxTiempoTertulia,
            int minTiempoDescanso, int maxTiempoDescanso, int minChefParrilla, int maxChefParrilla,
            int maxPlatosAreaBuffet, int minTiempoCocinando, int maxTiempoCocinando,
            int limitePlatosEnCola) {
        this.setMinTiempoCoccion(minTiempoCoccion);
        this.setMaxTiempoCoccion(maxTiempoCoccion);
        this.setMinNumComensal(minNumComensal);
        this.setMaxNumComensal(maxNumComensal);
        this.setMinNumChef(minNumChef);
        this.setMaxNumChef(maxNumChef);
        this.setMinTiempoConsumir(minTiempoConsumir);
        this.setMaxTiempoConsumir(maxTiempoConsumir);
        this.setMinTiempoTertulia(minTiempoTertulia);
        this.setMaxTiempoTertulia(maxTiempoTertulia);
        this.setMinTiempoDescanso(minTiempoDescanso);
        this.setMaxTiempoDescanso(maxTiempoDescanso);
        this.setMinChefParrilla(minChefParrilla);
        this.setMaxChefParrilla(maxChefParrilla);
        this.setMaxPlatosAreaBuffet(maxPlatosAreaBuffet);
        this.setMinTiempoCocinando(minTiempoCocinando);
        this.setMaxTiempoCocinando(maxTiempoCocinando);
        this.setLimitePlatosEnCola(limitePlatosEnCola);
    }

    // ! Getters y Setters
    /**
     * @return the minTiempoCoccion
     */
    public int getMinTiempoCoccion() {
        return minTiempoCoccion;
    }

    /**
     * @param minTiempoCoccion the minTiempoCoccion to set
     */
    public void setMinTiempoCoccion(int minTiempoCoccion) {
        this.minTiempoCoccion = minTiempoCoccion;
    }

    /**
     * @return the maxTiempoCoccion
     */
    public int getMaxTiempoCoccion() {
        return maxTiempoCoccion;
    }

    /**
     * @param maxTiempoCoccion the maxTiempoCoccion to set
     */
    public void setMaxTiempoCoccion(int maxTiempoCoccion) {
        this.maxTiempoCoccion = maxTiempoCoccion;
    }

    /**
     * @return the minNumComensal
     */
    public int getMinNumComensal() {
        return minNumComensal;
    }

    /**
     * @param minNumComensal the minNumComensal to set
     */
    public void setMinNumComensal(int minNumComensal) {
        this.minNumComensal = minNumComensal;
    }

    /**
     * @return the maxNumComensal
     */
    public int getMaxNumComensal() {
        return maxNumComensal;
    }

    /**
     * @param maxNumComensal the maxNumComensal to set
     */
    public void setMaxNumComensal(int maxNumComensal) {
        this.maxNumComensal = maxNumComensal;
    }

    /**
     * @return the minNumChef
     */
    public int getMinNumChef() {
        return minNumChef;
    }

    /**
     * @param minNumChef the minNumChef to set
     */
    public void setMinNumChef(int minNumChef) {
        this.minNumChef = minNumChef;
    }

    /**
     * @return the maxNumChef
     */
    public int getMaxNumChef() {
        return maxNumChef;
    }

    /**
     * @param maxNumChef the maxNumChef to set
     */
    public void setMaxNumChef(int maxNumChef) {
        this.maxNumChef = maxNumChef;
    }

    /**
     * @return the minTiempoConsumir
     */
    public int getMinTiempoConsumir() {
        return minTiempoConsumir;
    }

    /**
     * @param minTiempoConsumir the minTiempoConsumir to set
     */
    public void setMinTiempoConsumir(int minTiempoConsumir) {
        this.minTiempoConsumir = minTiempoConsumir;
    }

    /**
     * @return the maxTiempoConsumir
     */
    public int getMaxTiempoConsumir() {
        return maxTiempoConsumir;
    }

    /**
     * @param maxTiempoConsumir the maxTiempoConsumir to set
     */
    public void setMaxTiempoConsumir(int maxTiempoConsumir) {
        this.maxTiempoConsumir = maxTiempoConsumir;
    }

    /**
     * @return the minTiempoTertulia
     */
    public int getMinTiempoTertulia() {
        return minTiempoTertulia;
    }

    /**
     * @param minTiempoTertulia the minTiempoTertulia to set
     */
    public void setMinTiempoTertulia(int minTiempoTertulia) {
        this.minTiempoTertulia = minTiempoTertulia;
    }

    /**
     * @return the maxTiempoTertulia
     */
    public int getMaxTiempoTertulia() {
        return maxTiempoTertulia;
    }

    /**
     * @param maxTiempoTertulia the maxTiempoTertulia to set
     */
    public void setMaxTiempoTertulia(int maxTiempoTertulia) {
        this.maxTiempoTertulia = maxTiempoTertulia;
    }

    /**
     * @return the minTiempoDescanso
     */
    public int getMinTiempoDescanso() {
        return minTiempoDescanso;
    }

    /**
     * @param minTiempoDescanso the minTiempoDescanso to set
     */
    public void setMinTiempoDescanso(int minTiempoDescanso) {
        this.minTiempoDescanso = minTiempoDescanso;
    }

    /**
     * @return the maxTiempoDescanso
     */
    public int getMaxTiempoDescanso() {
        return maxTiempoDescanso;
    }

    /**
     * @param maxTiempoDescanso the maxTiempoDescanso to set
     */
    public void setMaxTiempoDescanso(int maxTiempoDescanso) {
        this.maxTiempoDescanso = maxTiempoDescanso;
    }

    /**
     * @return the minChefParrilla
     */
    public int getMinChefParrilla() {
        return minChefParrilla;
    }

    /**
     * @param minChefParrilla the minChefParrilla to set
     */
    public void setMinChefParrilla(int minChefParrilla) {
        this.minChefParrilla = minChefParrilla;
    }

    /**
     * @return the maxChefParrilla
     */
    public int getMaxChefParrilla() {
        return maxChefParrilla;
    }

    /**
     * @param maxChefParrilla the maxChefParrilla to set
     */
    public void setMaxChefParrilla(int maxChefParrilla) {
        this.maxChefParrilla = maxChefParrilla;
    }

    /**
     * @return the maxPlatosAreaBuffet
     */
    public int getMaxPlatosAreaBuffet() {
        return maxPlatosAreaBuffet;
    }

    /**
     * @param maxPlatosAreaBuffet the maxPlatosAreaBuffet to set
     */
    public void setMaxPlatosAreaBuffet(int maxPlatosAreaBuffet) {
        this.maxPlatosAreaBuffet = maxPlatosAreaBuffet;
    }

    /**
     * @return the minTiempoCocinando
     */
    public int getMinTiempoCocinando() {
        return minTiempoCocinando;
    }

    /**
     * @param minTiempoCocinando the minTiempoCocinando to set
     */
    public void setMinTiempoCocinando(int minTiempoCocinando) {
        this.minTiempoCocinando = minTiempoCocinando;
    }

    /**
     * @return the maxTiempoCocinando
     */
    public int getMaxTiempoCocinando() {
        return maxTiempoCocinando;
    }

    /**
     * @param maxTiempoCocinando the maxTiempoCocinando to set
     */
    public void setMaxTiempoCocinando(int maxTiempoCocinando) {
        this.maxTiempoCocinando = maxTiempoCocinando;
    }

    /**
     * @return the limitePlatosEnCola
     */
    public int getLimitePlatosEnCola() {
        return limitePlatosEnCola;
    }

    /**
     * @param limitePlatosEnCola the limitePlatosEnCola to set
     */
    public void setLimitePlatosEnCola(int limitePlatosEnCola) {
        this.limitePlatosEnCola = limitePlatosEnCola;
    }

}
