package casa;

public class Chalet extends Vivienda {
    private Piscina piscina;
    private Jardin jardin;



    public Chalet(String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor) {
        super(descripcion, direccion, superficie, nro_habitaciones, valor);
    }



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



    public void addPiscina (float volumen, boolean cloracion_salina, Integer valor) {
        this.piscina = new Piscina(volumen, cloracion_salina, valor);
    }

    public void addJardin (float superficie, Integer plantas) {
        this.jardin = new Jardin(superficie, plantas);
    }
}
