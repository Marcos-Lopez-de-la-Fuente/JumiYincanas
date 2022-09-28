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
    }


    public String show () {
        String respuesta = "Finca [nombre=" + nombre + ", tipo=" + tipo + ", direccion=" + direccion + ", superficie" + superficie + ", valor=" + valor;

        if (this.vivienda != null) {
            respuesta += ", vivienda=" + vivienda.show();
        }
        if (this.huerto != null) {
            respuesta += ", huerto=" + huerto.show();
        }
        if (this.piscina != null) {
            respuesta += ", piscina=" + piscina.show();
        }
        if (this.jardin != null) {
            respuesta += ", jardin=" + jardin.show();
        }
        respuesta += "]";

        return respuesta;
    }

    public Integer get_valor () {
        Integer sumaValores = this.valor;
        if (this.vivienda != null) {
            sumaValores += this.vivienda.get_valor();
        }
        if (this.huerto != null) {
            sumaValores += this.huerto.get_valor();
        }
        if (this.piscina != null) {
            sumaValores += this.piscina.get_valor();
        }
        if (this.jardin != null) {
            sumaValores += this.jardin.get_valor();
        }
        return sumaValores;
    }



    public void addChalet (String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor) {
        this.vivienda = new Chalet(descripcion, direccion, superficie, nro_habitaciones, valor);
    }

    public void addAdosado (String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor, float superficieAdosado, Integer plantasAdosado) {
        this.vivienda = new Adosado(descripcion, direccion, superficie, nro_habitaciones, valor, superficieAdosado, plantasAdosado);
    }

    public void addApartamento (String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor, boolean balcon) {
        this.vivienda = new Apartamento(descripcion, direccion, superficie, nro_habitaciones, valor, balcon);
    }




    public void addHuerto (float superficie, Boolean riego_por_goteo) {
        this.huerto = new Huerto(superficie, riego_por_goteo);
    }

    public void addPiscina (float volumen, boolean cloracion_salina, Integer valor) {
        this.piscina = new Piscina(volumen, cloracion_salina, valor);
    }

    public void addJardin (float superficie, Integer plantas) {
        this.jardin = new Jardin(superficie, plantas);
    }
}
