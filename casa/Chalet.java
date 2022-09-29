package casa;

// ! CLASE CHALET QUE HEREDA DE LA CLASE VIVIENDA
public class Chalet extends Vivienda {

    // ! Atributos
    private Piscina piscina;
    private Jardin jardin;




    // ! Constructor
    public Chalet(String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor) {
        super(descripcion, direccion, superficie, nro_habitaciones, valor);
    }




    // ! El método show() hace la misma función que el típico "toString()" retornando todos los valores de esta clase
    /** 
     * @return String
     */
    public String show() {
        String respuesta = "Chalet [" + super.show();

        if (this.piscina != null) {
            respuesta += ", piscina=" + piscina.show();
        }
        if (this.jardin != null) {
            respuesta += ", jardin=" + jardin.show();
        }
        respuesta += "]";

        return respuesta;
    }




    // ! El método get_valor() retornará el valor del Chalet + el valor de sus atributos piscina y jardin [SI TIENE ALGUNO DE ESTOS]
    /** 
     * @return Integer
     */
    public Integer get_valor() {
        Integer sumaValores = super.get_valor();
        if (this.piscina != null) {
            sumaValores += this.piscina.get_valor();
        }
        if (this.jardin != null) {
            sumaValores += this.jardin.get_valor();
        }
        return sumaValores;
    }




    // ! Añadir una Piscina o Jardin a sus propiedades correspondientes
    /** 
     * @param volumen
     * @param cloracion_salina
     * @param valor
     */
    public void addPiscina (float volumen, boolean cloracion_salina, Integer valor) {
        this.piscina = new Piscina(volumen, cloracion_salina, valor);
    }

    /** 
     * @param superficie
     * @param plantas
     */
    public void addJardin (float superficie, Integer plantas) {
        this.jardin = new Jardin(superficie, plantas);
    }
}
