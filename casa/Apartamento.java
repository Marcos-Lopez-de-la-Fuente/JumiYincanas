package casa;

// ! CLASE APARTAMENTO QUE HEREDA DE LA CLASE VIVIENDA
public class Apartamento extends Vivienda {

    // ! Atributos
    private boolean balcon;




    // ! Constructor
    public Apartamento(String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor, boolean balcon) {
        super(descripcion, direccion, superficie, nro_habitaciones, valor);
        this.balcon = balcon;
    }




    // ! El método show() hace la misma función que el típico "toString()" retornando todos los valores de esta clase
    /** 
     * @return String
     */
    public String show() {
        return "Apartamento [" + super.show() + ", balcon=" + balcon + "]";
    }
}
