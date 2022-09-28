package casa;

public class Piscina {
    private float volumen;
    private boolean cloracion_salina;
    private Integer valor;


    public Piscina (float volumen, boolean cloracion_salina, Integer valor) {
        this.volumen = volumen;
        this.cloracion_salina = cloracion_salina;
        this.valor = valor;
    }

    public String show() {
        return "Piscina [cloracion_salina=" + cloracion_salina + ", valor=" + valor + ", volumen=" + volumen + "]";
    }

    public Integer get_valor() {
        return this.valor;
    }
}
