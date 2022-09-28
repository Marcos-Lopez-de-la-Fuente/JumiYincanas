package casa;

public class Adosado extends Vivienda {
    private Jardin jardin;


    public Adosado(String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor, float superficieJardin, Integer plantasJardin) {
        super(descripcion, direccion, superficie, nro_habitaciones, valor);
        this.jardin = new Jardin(superficieJardin, plantasJardin);
    }



    public String show() {
        String respuesta = "Adosado [" + super.show();

        if (this.jardin != null) {
            respuesta += ", jardin=" + jardin.show();
        }
        respuesta += "]";

        return respuesta;
    }

    public Integer get_valor() {
        return super.get_valor() + jardin.get_valor();
    }
}
