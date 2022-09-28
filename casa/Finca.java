package casa;

public class Finca {
    private String nombre;
    private Tipo tipo;
    private String direccion;
    private float superficie;
    private Integer valor;

    private Vivienda vivienda;
    private Huerto huerto;
    private Piscina piscina;
    private Jardin jardin;
    



    public Finca(String nombre, Tipo tipo, String direccion, float superficie, Integer valor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.superficie = superficie;
        this.valor = valor;
        
        this.vivienda = new Vivienda();
        this.huerto = new Huerto();
        this.piscina = new Piscina();
        this.jardin = new Jardin();
    }


    public void show() {
        
    }

    public void get_valor() {
        
    }
}
