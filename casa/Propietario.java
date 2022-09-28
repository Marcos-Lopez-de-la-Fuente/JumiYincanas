package casa;

import java.util.ArrayList;

public class Propietario {
    private String nif;
    private String nombre;
    private String direccion;
    private ArrayList<Finca> fincas;
    private ArrayList<Vivienda> viviendas;

    public Propietario(String nif, String nombre, String direccion) {
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
    }




    public void add_vivienda(Vivienda vivienda) {
        this.viviendas.add(vivienda);
    }

    public void add_finca(Finca finca) {
        this.fincas.add(finca);
    }

    public String show() {
        return "Propietario [direccion=" + direccion + ", fincas=" + fincas + ", nif=" + nif + ", nombre=" + nombre
                + ", viviendas=" + viviendas + "]";
    }


    public void get_valor() {
        
    }
}
