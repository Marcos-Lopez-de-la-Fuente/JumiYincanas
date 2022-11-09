package buffet.newcode.model;

public class Grill extends BuffetPlats {

    // ! Atributos
    private boolean enServei;

    private RestaurantModel restaurantModel;
    private BuffetPlats colaPlatCuinats;

    // ! Constructor
    public Grill(int capacitatMaxima, RestaurantModel restaurantModel) {
        super(capacitatMaxima);
        this.setEnServei(true);

        this.setRestaurantModel(restaurantModel);
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
    public synchronized void setEnServei(boolean enServei) {
        this.enServei = enServei;
    }

    /**
     * @return the colaPlatCuinats
     */
    public BuffetPlats getColaPlatCuinats() {
        return colaPlatCuinats;
    }

    /**
     * @param colaPlatCuinats the colaPlatCuinats to set
     */
    public void setColaPlatCuinats(int capacitatMaxima) {
        this.colaPlatCuinats = new BuffetPlats(capacitatMaxima);
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
