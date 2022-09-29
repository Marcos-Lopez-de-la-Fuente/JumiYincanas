package casa;

import java.util.ArrayList;

// ! CLASE PROPIETARIO
public class Propietario {

    // ! Atributos
    private String nif;
    private String nombre;
    private String direccion;
    private ArrayList<Propiedad> propiedades = new ArrayList<>();




    // ! Constructor
    public Propietario(String nif, String nombre, String direccion) {
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
    }




    // ! Añadir una nueva vivienda o finca a sus atributos "ArrayList" correspondientes
    /** 
     * @param propiedad
     */
    public void add_propiedad(Propiedad propiedad) {
        this.propiedades.add(propiedad);
    }




    // ! El método show() hace la misma función que el típico "toString()" mostrando todos los valores de esta clase
    /** 
     * @return String
     */
    public String show() {
        String resultado = ", propiedades=";
        for (int i = 0; i < this.propiedades.size(); i++) {
            resultado += this.propiedades.get(i).show();
            if (i < this.propiedades.size() - 1) {
                resultado += ", ";
            }
        }
        return "Propietario [direccion=" + direccion + ", nombre=" + nombre + ", nif=" + nif + resultado + "]";
    }




    // ! El método get_valor() retornará el valor de todas las propiedades del propietario sumadas
    /** 
     * @return Integer
     */
    public Integer get_valor() {
        Integer sumaValores = 0;
        for (int i = 0; i < this.propiedades.size(); i++) {
            sumaValores += this.propiedades.get(i).get_valor();
        }
        return sumaValores;
    }

}
