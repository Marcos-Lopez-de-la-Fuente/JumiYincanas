package casa;

public class Apartamento extends Vivienda {
    private boolean balcon;




    public Apartamento(String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor, boolean balcon) {
        super(descripcion, direccion, superficie, nro_habitaciones, valor);
        this.balcon = balcon;
    }




    public String show() {
        return "Apartamento [" + super.show() + ", balcon=" + balcon + "]";
    }
}
