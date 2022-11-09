package buffet.newcode.model;

public class AreaBuffet extends BuffetPlats {

    // ! Atributos
    private String descripcio;

    public AreaBuffet(int capacitatMaxima, String descripcio) {
        super(capacitatMaxima);
        this.setDescripcio(descripcio);
    }




    // ! Getters y Setters
    /**
     * @return the descripcio
     */
    public String getDescripcio() {
        return descripcio;
    }

    /**
     * @param descripcio the descripcio to set
     */
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

}
