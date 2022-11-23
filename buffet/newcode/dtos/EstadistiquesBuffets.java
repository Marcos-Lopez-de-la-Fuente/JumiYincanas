package buffet.newcode.dtos;

public class EstadistiquesBuffets {

    // ! Atributos
    public int[] platsPerAreaBuffet;
    public int[] platsEnColaPerAreaBuffet;

    // ! Constructor
    public EstadistiquesBuffets() {
        this.platsPerAreaBuffet = new int[3];
        this.platsEnColaPerAreaBuffet = new int[3];
    }

}
