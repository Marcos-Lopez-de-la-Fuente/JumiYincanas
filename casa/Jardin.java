package casa;

// ! CLASE JARDIN
public class Jardin implements Valorable {

    // ! Atributos
    private float superficie;
    private Integer plantas;




    // ! Constructor
    public Jardin (float superficie, Integer plantas) {
        this.superficie = superficie;
        this.plantas = plantas;
    }




    // ! El método show() hace la misma función que el típico "toString()" mostrando todos los valores de esta clase
    /** 
     * @return String
     */
    public String show() {
        return "Jardin [plantas=" + plantas + ", superficie=" + superficie + "]";
    }




    // ! El método get_valor() devuelve el valor de Jardin (Hasta que Jumi cambie de idea siempre devolverá 0)
    /** 
     * @return Integer
     */
    public Integer get_valor() {
        return 0;
    }
}
