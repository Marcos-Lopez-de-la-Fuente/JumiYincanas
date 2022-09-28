package casa;

import java.util.ArrayList;

public class Propietario {
    private String nif;
    private String nombre;
    private String direccion;
    private ArrayList<Finca> fincas = new ArrayList<>();
    private ArrayList<Vivienda> viviendas = new ArrayList<>();

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
        String resultado = ", fincas=";

        for (int i = 0; i < this.fincas.size(); i++) {
            resultado += this.fincas.get(i).show();
            if (i < this.fincas.size() - 1) {
                resultado += ", ";
            }
        }
        resultado += ", viviendas=";
        for (int i = 0; i < this.viviendas.size(); i++) {
            resultado += this.viviendas.get(i).show();
            if (i < this.viviendas.size() - 1) {
                resultado += ", ";
            }
        }


        return "Propietario [direccion=" + direccion + ", nombre=" + nombre + ", nif=" + nif + resultado + "]";
    }


    public Integer get_valor () {
        Integer sumaValores = 0;
        for (int i = 0; i < this.fincas.size(); i++) {
            sumaValores += this.fincas.get(i).get_valor();
        }
        for (int i = 0; i < this.viviendas.size(); i++) {
            sumaValores += this.viviendas.get(i).get_valor();
        }
        return sumaValores;
    }
}
