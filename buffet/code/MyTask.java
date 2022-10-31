package buffet.code;

import buffet.code.model.ParametrosSimulacion;
import buffet.code.model.RestauranteModelo;

public class MyTask {
    static public int minTiempoCoccion = 4;
    static public int maxTiempoCoccion = 8;
    static public int minNumComensal = 12;
    static public int maxNumComensal = 36;
    static public int minNumChef = 3;
    static public int maxNumChef = 9;
    static public int minTiempoConsumir = 8;
    static public int maxTiempoConsumir = 16;
    static public int minTiempoTertulia = 5;
    static public int maxTiempoTertulia = 15;
    static public int minTiempoDescanso = 2;
    static public int maxTiempoDescanso = 12;
    static public int minChefParrilla = 1;
    static public int maxChefParrilla = 3;
    static public int maxPlatosAreaBuffet = 6;
    static public int minTiempoCocinando = 60;
    static public int maxTiempoCocinando = 120;
    static public int limitePlatosEnCola = 3;

    ///////////////////////////////////////////////////

    static public int multiplicadorDeTiempo = 1;
    static public int cantidadDeBuffets = 3;
    static public int cantidadDeParrillas = 3;
    static public int maxPlatosParrilla = 3;

    public static void main(String[] args) {

        // ! Creo el objeto restauranteModelo y le paso los parámetros de la simulación
        RestauranteModelo restauranteModelo = new RestauranteModelo(multiplicadorDeTiempo);

        restauranteModelo.setParametrosSimulacion(minTiempoCoccion, maxTiempoCoccion,
                minNumComensal, maxNumComensal, minNumChef, maxNumChef, minTiempoConsumir, maxTiempoConsumir,
                minTiempoTertulia, maxTiempoTertulia, minTiempoDescanso, maxTiempoDescanso, minChefParrilla,
                maxChefParrilla, maxPlatosAreaBuffet, minTiempoCocinando, maxTiempoCocinando, limitePlatosEnCola);

        // ! Crear los ArrayList del restaurante
        restauranteModelo.addAreaBuffets("Carne", restauranteModelo.getParametrosSimulacion().maxPlatosAreaBuffet);

        restauranteModelo.addParrilla(cantidadDeParrillas, maxPlatosParrilla);

        restauranteModelo.addComensales();

    }
}
