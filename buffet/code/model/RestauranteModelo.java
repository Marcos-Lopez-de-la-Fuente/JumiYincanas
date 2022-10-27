package buffet.code.model;

import java.util.ArrayList;

public class RestauranteModelo {

    // ! Atributos
    private Reloj reloj;
    private ArrayList<Parrilla> parrillas;
    private ArrayList<AreaBuffet> areaBuffets;
    private ArrayList<Comensal> comensales;
    private ArrayList<Chef> chefs;



    // ! Constructor
    public RestauranteModelo(int multiplicadorDeTiempo) {
        this.reloj = new Reloj(multiplicadorDeTiempo);
        this.parrillas = new ArrayList<Parrilla>();
        this.areaBuffets = new ArrayList<AreaBuffet>();
        this.comensales = new ArrayList<Comensal>();
        this.chefs = new ArrayList<Chef>();
    }



    // ! Métodos
    public void addParrilla(int capacidadMaxima) {
        this.parrillas.add(new Parrilla(capacidadMaxima));
    }

    public void addAreaBuffets(String descripcion, int numeroMaximo) {
        this.areaBuffets.add(new AreaBuffet(descripcion, numeroMaximo));
    }

    public void addComensales() {
        this.comensales.add(new Comensal());
    }

    public void chefs(Parrilla parrilla, AreaBuffet areaBuffet) {
        this.chefs.add(new Chef(parrilla, areaBuffet));
    }














    public void play() {

    }

    public void stop() {

    }

    public void pause() {

    }

    public void cambiarStatusChef() {

    }

    public void cambiarStatusComensal() {

    }

    public void cambiarStatusAreaBuffet() {

    }

    public void cambiarStatusParrilla() {

    }

}
