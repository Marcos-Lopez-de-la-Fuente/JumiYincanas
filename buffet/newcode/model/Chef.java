package buffet.newcode.model;

import java.util.Random;

public class Chef implements Runnable {

    // ! Atributos
    private int tempsTotalCuinant;
    private int tempsNoDescans;
    private int nombrePlatsCuinats;
    private int horariIniciDescans;
    private int tempsTotalDescans;
    private int tempsEspera;
    private ChefStatus status;

    private RestaurantModel restaurantModel;
    private Rellotge rellotge;
    private AreaBuffet areaBuffet;
    private Grill grill;

    // ! Constructor
    public Chef(RestaurantModel restaurantModel, Rellotge rellotge, AreaBuffet areaBuffet, Grill grill) {
        this.setTempsTotalCuinant(0);
        this.setTempsNoDescans(0);
        this.setNombrePlatsCuinats(0);
        this.setHorariIniciDescans(0);
        this.setTempsTotalDescans(0);
        this.setTempsEspera(0);

        this.setRestaurantModel(restaurantModel);
        this.setRellotge(rellotge);
        this.setAreaBuffet(areaBuffet);
        this.setGrill(grill);
    }


    // ! Métodos
    public void cocinar() {
        this.setStatus(ChefStatus.cuinant);
        this.getGrill().afegirPlat();

        Rango tempsCoccio = this.getRestaurantModel().getParametresSimulacio().tempsCoccio;
        try {
            Thread.sleep(new Random().nextInt(tempsCoccio.min, tempsCoccio.max));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.getGrill().retirarPlat();
    }

    public void descansar() {
        this.setStatus(ChefStatus.descansant);

        Rango tempsDescans = this.getRestaurantModel().getParametresSimulacio().tempsDescans;
        try {
            Thread.sleep(new Random().nextInt(tempsDescans.min, tempsDescans.max));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void entregarPlat() {
        this.setStatus(ChefStatus.entregant);
        this.getAreaBuffet().afegirPlat();
    }


    // ! Run
    @Override
    public void run() {
        
        // TODO Auto-generated method stub
    }





    // ! Getters y Setters
    /**
     * @return the tempsTotalCuinant
     */
    public int getTempsTotalCuinant() {
        return tempsTotalCuinant;
    }

    /**
     * @param tempsTotalCuinant the tempsTotalCuinant to set
     */
    public void setTempsTotalCuinant(int tempsTotalCuinant) {
        this.tempsTotalCuinant = tempsTotalCuinant;
    }

    /**
     * @return the tempsNoDescans
     */
    public int getTempsNoDescans() {
        return tempsNoDescans;
    }

    /**
     * @param tempsNoDescans the tempsNoDescans to set
     */
    public void setTempsNoDescans(int tempsNoDescans) {
        this.tempsNoDescans = tempsNoDescans;
    }

    /**
     * @return the nombrePlatsCuinats
     */
    public int getNombrePlatsCuinats() {
        return nombrePlatsCuinats;
    }

    /**
     * @param nombrePlatsCuinats the nombrePlatsCuinats to set
     */
    public void setNombrePlatsCuinats(int nombrePlatsCuinats) {
        this.nombrePlatsCuinats = nombrePlatsCuinats;
    }

    /**
     * @return the horariIniciDescans
     */
    public int getHorariIniciDescans() {
        return horariIniciDescans;
    }

    /**
     * @param horariIniciDescans the horariIniciDescans to set
     */
    public void setHorariIniciDescans(int horariIniciDescans) {
        this.horariIniciDescans = horariIniciDescans;
    }

    /**
     * @return the tempsTotalDescans
     */
    public int getTempsTotalDescans() {
        return tempsTotalDescans;
    }

    /**
     * @param tempsTotalDescans the tempsTotalDescans to set
     */
    public void setTempsTotalDescans(int tempsTotalDescans) {
        this.tempsTotalDescans = tempsTotalDescans;
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

    /**
     * @return the areaBuffet
     */
    public AreaBuffet getAreaBuffet() {
        return areaBuffet;
    }

    /**
     * @param areaBuffet the areaBuffet to set
     */
    public void setAreaBuffet(AreaBuffet areaBuffet) {
        this.areaBuffet = areaBuffet;
    }

    /**
     * @return the grill
     */
    public Grill getGrill() {
        return grill;
    }

    /**
     * @param grill the grill to set
     */
    public void setGrill(Grill grill) {
        this.grill = grill;
    }

    

}
