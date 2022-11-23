package buffet.newcode.model;

import java.util.ArrayList;
import java.util.Random;

import buffet.newcode.dtos.Estadistiques;
import buffet.newcode.dtos.EstadistiquesBuffets;

public class RestaurantModel {

    // ! Atributos
    private Grill[] grills;
    private AreaBuffet[] areaBuffets;
    private Rellotge rellotge;
    private ParametresSimulacio parametresSimulacio;
    private ArrayList<Chef> chefs;
    private ArrayList<Comensal> comensals;

    // ! Constructor
    public RestaurantModel() {
    }

    // ! Métodos
    public void play() {
    }

    public void start() {
    }

    public void stop() {
    }

    public void pause() {
    }

    public Estadistiques getEstadistiques() {
        return new Estadistiques();
    }

    public void setParametresSimulacio(int maxPlatAreaBuffet, int limitPlatsEnCoa, int minTempsConsumir,
            int maxTempsConsumir, int minTempsCoccio, int maxTempsCoccio, int minNumComensal, int maxNumComensal,
            int minTempsTertulia, int maxTempsTertulia, int minTempsDescans, int maxTempsDescans,
            int minNumChefPerGrill, int maxNumChefPerGrill, int minTempsCuinant, int maxTempsCuinant) {

        this.parametresSimulacio = new ParametresSimulacio(maxPlatAreaBuffet, limitPlatsEnCoa, minTempsConsumir,
                maxTempsConsumir, minTempsCoccio, maxTempsCoccio, minNumComensal, maxNumComensal, minTempsTertulia,
                maxTempsTertulia, minTempsDescans, maxTempsDescans, minNumChefPerGrill, maxNumChefPerGrill,
                minTempsCuinant, maxTempsCuinant);
    }



    // ! Getters y Setters
    /**
     * @return the grills
     */
    public Grill[] getGrills() {
        return grills;
    }

    /**
     * @param grills the grills to set
     */
    public void setGrills(int capacitatMaxima) {
        this.grills = new Grill[3];

        for (Grill grill : this.grills) {
            grill = new Grill(capacitatMaxima, this);
        }
    }

    /**
     * @return the areaBuffets
     */
    public AreaBuffet[] getAreaBuffets() {
        return areaBuffets;
    }

    /**
     * @param areaBuffets the areaBuffets to set
     */
    public void setAreaBuffets(int capacitatMaxima, String descripcio, Integer[] platsPerAreaBuffet,
            Integer[] platsEnColaPerAreaBuffet, int capacitatMaximaColaPlatCuinats) {

        this.areaBuffets = new AreaBuffet[3];

        for (AreaBuffet areaBuffet : this.areaBuffets) {
            areaBuffet = new AreaBuffet(capacitatMaxima, descripcio, capacitatMaximaColaPlatCuinats);
        }
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
    public void setRellotge(int multiplicadorTemps) {
        this.rellotge = Rellotge.getInstance(multiplicadorTemps);
    }

    /**
     * @return the parametresSimulacio
     */
    public ParametresSimulacio getParametresSimulacio() {
        return parametresSimulacio;
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
    public void setChefs(Rango numChef) {
        this.chefs = new ArrayList<Chef>();

        int finalNumChef = new Random().nextInt(numChef.min, numChef.max);

        int contadorAreaBuffetYGrill = 0;

        for (int i = 0; i < finalNumChef; i++) {
            this.chefs.add(new Chef(
                    this,
                    this.getRellotge(),
                    this.getAreaBuffets()[contadorAreaBuffetYGrill],
                    this.getGrills()[contadorAreaBuffetYGrill]));

            contadorAreaBuffetYGrill++;
            if (contadorAreaBuffetYGrill > this.getAreaBuffets().length) {
                contadorAreaBuffetYGrill = 0;
            }
        }
    }

    /**
     * @return the comensals
     */
    public ArrayList<Comensal> getComensals() {
        return comensals;
    }

    /**
     * @param comensals the comensals to set
     */
    public void setComensals(Rango numComensal) {
        this.comensals = new ArrayList<Comensal>();

        int finalNumComensal = new Random().nextInt(numComensal.min, numComensal.max);

        for (int i = 0; i < finalNumComensal; i++) {
            this.comensals.add(new Comensal(this, this.getRellotge()));
        }
    }

    public AreaBuffet getRandomBuffete() {

        return new AreaBuffet(0, null, 0);
    }

}
