package casa;

// ! CLASE ABSTRACTA VIVIENDA
public abstract class Vivienda {

    // ! Atributos
    private String descripcion;
    private String direccion;
    private float superficie;
    private Integer nro_habitaciones;
    private Integer valor;




    // ! Constructor
    public Vivienda (String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor) {
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.superficie = superficie;
        this.nro_habitaciones = nro_habitaciones;
        this.valor = valor;
    }




    // ! El método show() hace la misma función que el típico "toString()" mostrando todos los valores de esta clase
    public String show() {
        return "Vivienda [descripcion=" + descripcion + ", direccion=" + direccion + ", superficie=" + superficie + ", nro_habitaciones=" + nro_habitaciones + ", valor=" + valor + "]";
    }




    // ! El método get_valor() devolverá el valor de la Vivienda almacenado en el atributo "valor"
    public Integer get_valor() {
        return this.valor;
    }
}
