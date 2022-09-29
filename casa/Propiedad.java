package casa;

// ! CLASE PROPIEDAD ABSTRACTA 
public abstract class Propiedad {

    // ! Aunque nunca se vayan a usar estos métodos debido a que lo sobreescribirán las clases Hijas, será necesario ponerlo también en esta para que desde la clase Propietario se puedan ejecutar estos 2 métodos sin que salten errores
    public String show() {
        return null;
    }
    public Integer get_valor() {
        return null;
    }
}
