package buffet.newcode.dtos;

public class EstadistiquesChef {

    // ! Atributos
    public int tempsDescansChef;
    public int platsCuinatsChef;
    public int[] chefsPerEstat;

    // ! Constructor
    public EstadistiquesChef() {
        this.tempsDescansChef = 0;
        this.platsCuinatsChef = 0;
        this.chefsPerEstat = new int[3];
    }

}
