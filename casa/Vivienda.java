package casa;

public abstract class Vivienda {
    private String descripcion;
    private String direccion;
    private float superficie;
    private Integer nro_habitaciones;
    private Integer valor;


    public Vivienda (String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor) {
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.superficie = superficie;
        this.nro_habitaciones = nro_habitaciones;
        this.valor = valor;
    }

    public String show() {
        return "Vivienda [descripcion=" + descripcion + ", direccion=" + direccion + ", superficie=" + superficie + ", nro_habitaciones=" + nro_habitaciones + ", valor=" + valor + "]";
    }

    public Integer get_valor() {
        return this.valor;
    }
}
