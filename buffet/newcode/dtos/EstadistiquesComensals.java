package buffet.newcode.dtos;

public class EstadistiquesComensals {

    // ! Atributos
    public int tempsMenjantComensals;
    public int tempsTertuliaComensals;
    public int tempsEsperantComensals;
    public int[] comensalsPerEstat;

    // ! Constructor
    public EstadistiquesComensals() {
        this.tempsMenjantComensals = 0;
        this.tempsTertuliaComensals = 0;
        this.tempsEsperantComensals = 0;
        this.comensalsPerEstat = new int[3];
    }
}
