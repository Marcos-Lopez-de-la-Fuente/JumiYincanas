package buffet.newcode.model;

public class Grill extends BufferPlats {

    // ! Atributos
    private boolean enServei;

    private RestaurantModel restaurantModel;
    private BufferPlats colaPlatCuinats;

    // ! Constructor
    public Grill(int capacitatMaxima, RestaurantModel restaurantModel) {
        super(capacitatMaxima);
        this.setEnServei(true);

        this.setRestaurantModel(restaurantModel);
    }

    public synchronized void posarEnServei() {
        this.setEnServei(true);
    }

    public synchronized void treureDeServei() {
        this.setEnServei(false);
    }



    // ! Getters y Setters
    /**
     * @return the enServei
     */
    public boolean isEnServei() {
        return enServei;
    }

    /**
     * @param enServei the enServei to set
     */
    public void setEnServei(boolean enServei) {
        this.enServei = enServei;
    }

    /**
     * @return the colaPlatCuinats
     */
    public BufferPlats getColaPlatCuinats() {
        return colaPlatCuinats;
    }

    /**
     * @param colaPlatCuinats the colaPlatCuinats to set
     */
    public void setColaPlatCuinats(int capacitatMaxima) {
        this.colaPlatCuinats = new BufferPlats(capacitatMaxima);
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

}
