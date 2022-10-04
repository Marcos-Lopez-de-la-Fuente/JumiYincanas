package casa;

// ! CLASE FINCA
public class Finca extends Propiedad {

    // ! Atributos
    private String nombre;
    private Tipo tipo;
    private String direccion;
    private float superficie;
    private Integer valor;
    private Vivienda vivienda;
    private Huerto huerto;
    private Piscina piscina;
    private Jardin jardin;




    // ! Constructor
    public Finca(String nombre, Tipo tipo, String direccion, float superficie, Integer valor) {
        super(direccion, valor);
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.superficie = superficie;
    }




    // ! El método show() hace la misma función que el típico "toString()" mostrando todos los valores de esta clase
    /** 
     * @return String
     */
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




    // ! El método get_valor() retornará el valor de este objeto y el de sus atributos sumado
    /** 
     * @return Integer
     */
    public Integer get_valor () {
        Integer sumaValores = super.get_valor();
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




    // ! Métodos para añadir una Vivienda mediante los constructors Chalet(), Adosado() y Apartamento()
    /** 
     * @param descripcion
     * @param direccion
     * @param superficie
     * @param nro_habitaciones
     * @param valor
     */
    public void addChalet (String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor) {
        this.vivienda = new Chalet(descripcion, direccion, superficie, nro_habitaciones, valor);
    }

    /** 
     * @param descripcion
     * @param direccion
     * @param superficie
     * @param nro_habitaciones
     * @param valor
     * @param superficieAdosado
     * @param plantasAdosado
     */
    public void addAdosado (String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor, float superficieAdosado, Integer plantasAdosado) {
        this.vivienda = new Adosado(descripcion, direccion, superficie, nro_habitaciones, valor, superficieAdosado, plantasAdosado);
    }

    /** 
     * @param descripcion
     * @param direccion
     * @param superficie
     * @param nro_habitaciones
     * @param valor
     * @param balcon
     */
    public void addApartamento (String descripcion, String direccion, float superficie, Integer nro_habitaciones, Integer valor, boolean balcon) {
        this.vivienda = new Apartamento(descripcion, direccion, superficie, nro_habitaciones, valor, balcon);
    }




    // ! Método para crear un Huerto en la Finca
    /** 
     * @param superficie
     * @param riego_por_goteo
     */
    public void addHuerto (float superficie, Boolean riego_por_goteo) {
        this.huerto = new Huerto(superficie, riego_por_goteo);
    }


    // ! Método para crear una Piscina en la Finca
    /** 
     * @param volumen
     * @param cloracion_salina
     * @param valor
     */
    public void addPiscina (float volumen, boolean cloracion_salina, Integer valor) {
        this.piscina = new Piscina(volumen, cloracion_salina, valor);
    }


    // ! Método para crear un Jardin en la Finca [NECESARIO PREGUNTAR A JUMI SOBRE LA POSICIÓN DE PROPIEDADES CON FINCA, VIVIENDA, ADOSADO, JARDIN]
    /** 
     * @param superficie
     * @param plantas
     */
    public void addJardin (float superficie, Integer plantas) {
        this.jardin = new Jardin(superficie, plantas);
    }

}
