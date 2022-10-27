package buffet.code.model;

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
        this.minTiempoCoccion = minTiempoCoccion;
        this.maxTiempoCoccion = maxTiempoCoccion;
        this.minNumComensal = minNumComensal;
        this.maxNumComensal = maxNumComensal;
        this.minNumChef = minNumChef;
        this.maxNumChef = maxNumChef;
        this.minTiempoConsumir = minTiempoConsumir;
        this.maxTiempoConsumir = maxTiempoConsumir;
        this.minTiempoTertulia = minTiempoTertulia;
        this.maxTiempoTertulia = maxTiempoTertulia;
        this.minTiempoDescanso = minTiempoDescanso;
        this.maxTiempoDescanso = maxTiempoDescanso;
        this.minChefParrilla = minChefParrilla;
        this.maxChefParrilla = maxChefParrilla;
        this.maxPlatosAreaBuffet = maxPlatosAreaBuffet;
        this.minTiempoCocinando = minTiempoCocinando;
        this.maxTiempoCocinando = maxTiempoCocinando;
        this.limitePlatosEnCola = limitePlatosEnCola;
    }


}
