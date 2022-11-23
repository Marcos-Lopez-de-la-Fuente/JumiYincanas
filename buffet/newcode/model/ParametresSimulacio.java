package buffet.newcode.model;

public class ParametresSimulacio {
    public int maxPlatAreaBuffet;
    public int limitPlatsEnCoa;

    public Rango tempsConsumir;
    public Rango tempsTertulia;
    public Rango tempsDescans;
    public Rango tempsCuinant;
    public Rango numComensal;
    public Rango numChefPerGrill;
    public Rango tempsCoccio;

    public ParametresSimulacio(int maxPlatAreaBuffet, int limitPlatsEnCoa, int minTempsConsumir, int maxTempsConsumir,
            int minTempsCoccio, int maxTempsCoccio, int minNumComensal, int maxNumComensal, int minTempsTertulia,
            int maxTempsTertulia, int minTempsDescans, int maxTempsDescans, int minNumChefPerGrill,
            int maxNumChefPerGrill, int minTempsCuinant, int maxTempsCuinant) {

        this.maxPlatAreaBuffet = maxPlatAreaBuffet;
        this.limitPlatsEnCoa = limitPlatsEnCoa;

        this.tempsConsumir = new Rango(minTempsConsumir, maxTempsConsumir);
        this.tempsTertulia = new Rango(minTempsTertulia, maxTempsTertulia);
        this.tempsDescans = new Rango(minTempsDescans, maxTempsDescans);
        this.tempsCuinant = new Rango(minTempsCuinant, maxTempsCuinant);
        this.numComensal = new Rango(minNumComensal, maxNumComensal);
        this.numChefPerGrill = new Rango(minNumChefPerGrill, maxNumChefPerGrill);
        this.tempsCoccio = new Rango(minTempsCoccio, maxTempsCoccio);

    }
}
