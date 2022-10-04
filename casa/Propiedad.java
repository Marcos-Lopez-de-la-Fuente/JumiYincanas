package casa;

// ! CLASE PROPIEDAD ABSTRACTA 
public class Propiedad {
    private String descripcion;
    private Integer valor;


    public Propiedad (String descripcion, Integer valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }


    // ! Aunque nunca se vayan a usar estos métodos debido a que lo sobreescribirán las clases Hijas, será necesario ponerlo también en esta para que desde la clase Propietario se puedan ejecutar estos 2 métodos sin que salten errores
    public String show() {
        return "Propiedad [descripcion=" + descripcion + ", valor=" + valor + "]";
    }
    public Integer get_valor() {
        return this.valor;
    }
}
