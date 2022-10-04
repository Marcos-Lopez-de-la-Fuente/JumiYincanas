package casa;

// ! CLASE ABSTRACTA VIVIENDA
public class Vivienda extends Propiedad {

    // ! Atributos
    private String descripcion;
    private String direccion;
    private float superficie;
    private Integer nro_habitaciones;




    // ! Constructor
    public Vivienda (String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor) {
        super(descripcion, valor);
        this.direccion = direccion;
        this.superficie = superficie;
        this.nro_habitaciones = nro_habitaciones;
    }




    // ! El método show() hace la misma función que el típico "toString()" mostrando todos los valores de esta clase
    public String show() {
        return "Vivienda [descripcion=" + descripcion + ", direccion=" + direccion + ", superficie=" + superficie + ", nro_habitaciones=" + nro_habitaciones + "]";
    }
}
