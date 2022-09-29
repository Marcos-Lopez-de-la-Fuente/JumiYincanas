package casa;

// ! CLASE HUERTO
public class Huerto {

    // ! Atributos
    private float superficie;
    private Boolean riego_por_goteo;




    // ! Constructor
    public Huerto (float superficie, Boolean riego_por_goteo) {
        this.superficie = superficie;
        this.riego_por_goteo = riego_por_goteo;
    }




    // ! El método show() hace la misma función que el típico "toString()" mostrando todos los valores de esta clase
    /** 
     * @return String
     */
    public String show() {
        return "Huerto [riego_por_goteo=" + riego_por_goteo + ", superficie=" + superficie + "]";
    }




    // ! El método get_valor() devuelve el valor de Huerto (Hasta que Jumi cambie de idea siempre devolverá 0)
    /** 
     * @return Integer
     */
    public Integer get_valor() {
        return 0;
    }
}
