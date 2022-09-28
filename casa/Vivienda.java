package casa;

public class Vivienda {
    private String descripcion;
    private String direccion;
    private float superficie;
    private Integer nro_habitaciones;
    private Integer valor;


    public Vivienda (String descripcion, String direccion, double d, Integer nro_habitaciones, Integer valor) {
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.superficie = d;
        this.nro_habitaciones = nro_habitaciones;
        this.valor = valor;
    }

    public void show() {
        
    }

    public void get_valor() {
        
    }
}
