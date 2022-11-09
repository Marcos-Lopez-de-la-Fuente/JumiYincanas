package buffet.newcode.model;

public class Comensal implements Runnable {

    // ! Atributos
    private int platsMenjats;
    private int tempsMenjant;
    private int tempsTertulia;
    private int tempsEspera;
    private ComensalStatus status;

    private RestaurantModel restaurantModel;
    private Rellotge rellotge;

    // ! Constructor
    public Comensal(RestaurantModel restaurantModel, Rellotge rellotge) {
        this.setPlatsMenjats(0);
        this.setTempsMenjant(0);
        this.setTempsTertulia(0);
        this.setTempsEspera(0);

        this.setRestaurantModel(restaurantModel);
        this.setRellotge(rellotge);
    }

    // ! Métodos
    public void menjar() {
    }

    public void tertulia() {
    }

    public void agafarPlat() {
    }

    // ! Run
    @Override
    public void run() {
    }

    // ! Getters y Setters
    /**
     * @return the platsMenjats
     */
    public int getPlatsMenjats() {
        return platsMenjats;
    }

    /**
     * @param platsMenjats the platsMenjats to set
     */
    public void setPlatsMenjats(int platsMenjats) {
        this.platsMenjats = platsMenjats;
    }

    /**
     * @return the tempsMenjant
     */
    public int getTempsMenjant() {
        return tempsMenjant;
    }

    /**
     * @param tempsMenjant the tempsMenjant to set
     */
    public void setTempsMenjant(int tempsMenjant) {
        this.tempsMenjant = tempsMenjant;
    }

    /**
     * @return the tempsTertulia
     */
    public int getTempsTertulia() {
        return tempsTertulia;
    }

    /**
     * @param tempsTertulia the tempsTertulia to set
     */
    public void setTempsTertulia(int tempsTertulia) {
        this.tempsTertulia = tempsTertulia;
    }

    /**
     * @return the tempsEspera
     */
    public int getTempsEspera() {
        return tempsEspera;
    }

    /**
     * @param tempsEspera the tempsEspera to set
     */
    public void setTempsEspera(int tempsEspera) {
        this.tempsEspera = tempsEspera;
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

    /**
     * @return the restaurantModel
     */
    public RestaurantModel getRestaurantModel() {
        return restaurantModel;
    }

    /**
     * @param restaurantModel the restaurantModel to set
     */
    public void setRestaurantModel(RestaurantModel restaurantModel) {
        this.restaurantModel = restaurantModel;
    }

    /**
     * @return the rellotge
     */
    public Rellotge getRellotge() {
        return rellotge;
    }

    /**
     * @param rellotge the rellotge to set
     */
    public void setRellotge(Rellotge rellotge) {
        this.rellotge = rellotge;
    }

}
