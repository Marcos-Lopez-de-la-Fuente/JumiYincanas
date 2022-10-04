package casa;

// ! CLASE PISCINA
public class Piscina implements Valorable {

    // ! Atributos
    private float volumen;
    private boolean cloracion_salina;
    private Integer valor;




    // ! Constructor
    public Piscina (float volumen, boolean cloracion_salina, Integer valor) {
        this.volumen = volumen;
        this.cloracion_salina = cloracion_salina;
        this.valor = valor;
    }




    // ! El método show() hace la misma función que el típico "toString()" mostrando todos los valores de esta clase
    public String show() {
        return "Piscina [cloracion_salina=" + cloracion_salina + ", valor=" + valor + ", volumen=" + volumen + "]";
    }




    // ! El método get_valor() devuelve el valor de Piscina mediante el atributo "valor"
    public Integer get_valor() {
        return this.valor;
    }
}
