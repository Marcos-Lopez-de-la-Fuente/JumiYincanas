package buffet.newcode.model;

import buffet.newcode.dtos.EstadistiquesBuffets;

// ? No tengo ni idea de si los métodos "retirarPlat()" y "afegirPlat()" tienen que ser @Override o se refiere a que llamamos al super... Ni idea
public class AreaBuffet extends BufferPlats {

    // ! Atributos
    private static EstadistiquesBuffets estadistiques;

    private String descripcio;

    private BufferPlats colaPlatCuinats;

    // ! Constructor
    public AreaBuffet(int capacitatMaxima, String descripcio, int capacitatMaximaColaPlatCuinats) {
        super(capacitatMaxima);

        this.setDescripcio(descripcio);

        this.setColaPlatCuinats(new BufferPlats(capacitatMaximaColaPlatCuinats));
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

    /**
     * @return the estadistiques
     */
    public static EstadistiquesBuffets getEstadistiques() {
        return estadistiques;
    }

    /**
     * @param estadistiques the estadistiques to set
     */
    public static void setEstadistiques(EstadistiquesBuffets estadistiques) {
        AreaBuffet.estadistiques = estadistiques;
    }

    /**
     * @return the colaPLatCuinats
     */
    public BufferPlats getColaPlatCuinats() {
        return colaPlatCuinats;
    }

    /**
     * @param colaPLatCuinats the colaPLatCuinats to set
     */
    public void setColaPlatCuinats(BufferPlats colaPlatCuinats) {
        this.colaPlatCuinats = colaPlatCuinats;
    }

}
