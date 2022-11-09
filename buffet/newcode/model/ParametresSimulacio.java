package buffet.newcode.model;

public class ParametresSimulacio {
    public int maxPlatAreaBuffet;
    public int limitPlatsEnCoa;

    public Rango tempsConsumir;
    public Rango tempsCoccio;
    public Rango numChef;
    public Rango numComensal;
    public Rango tempsTertulia;
    public Rango tempsDescans;
    public Rango numChefPerGrill;
    public Rango tempsCuinant;

    public ParametresSimulacio(int maxPlatAreaBuffet, int limitPlatsEnCoa, int minTempsConsumir, int maxTempsConsumir,
            int minTempsCoccio, int maxTempsCoccio, int minNumChef, int maxNumChef, int minNumComensal,
            int maxNumComensal, int minTempsTertulia, int maxTempsTertulia, int minTempsDescans, int maxTempsDescans,
            int minNumChefPerGrill, int maxNumChefPerGrill, int minTempsCuinant, int maxTempsCuinant) {

        this.maxPlatAreaBuffet = maxPlatAreaBuffet;
        this.limitPlatsEnCoa = limitPlatsEnCoa;

        this.tempsConsumir = new Rango(minTempsConsumir, maxTempsConsumir);
        this.tempsCoccio = new Rango(minTempsCoccio, maxTempsCoccio);
        this.numChef = new Rango(minNumChef, maxNumChef);
        this.numComensal = new Rango(minNumComensal, maxNumComensal);
        this.tempsTertulia = new Rango(minTempsTertulia, maxTempsTertulia);
        this.tempsDescans = new Rango(minTempsDescans, maxTempsDescans);
        this.numChefPerGrill = new Rango(minNumChefPerGrill, maxNumChefPerGrill);
        this.tempsCuinant = new Rango(minTempsCuinant, maxTempsCuinant);
    }
}
