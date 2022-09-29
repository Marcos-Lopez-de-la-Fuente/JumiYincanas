package casa;

// ! Clase Adosado que hereda de la clase Vivienda
public class Adosado extends Vivienda {

    // ! Atributos
    private Jardin jardin;




    // ! Constructor
    public Adosado(String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor, float superficieJardin, Integer plantasJardin) {
        super(descripcion, direccion, superficie, nro_habitaciones, valor);
        this.jardin = new Jardin(superficieJardin, plantasJardin);
    }




    // ! El método show() hace la misma función que el típico "toString()" mostrando todos los valores de esta clase
    /** 
     * @return String
     */
    public String show() {
        String respuesta = "Adosado [" + super.show();
        if (this.jardin != null) {
            respuesta += ", jardin=" + jardin.show();
        }
        respuesta += "]";
        return respuesta;
    }




    // ! El método get_valor() retornará el valor del Adosado + el valor de su atributo Jardin
    /** 
     * @return Integer
     */
    public Integer get_valor() {
        return super.get_valor() + jardin.get_valor();
    }
}
