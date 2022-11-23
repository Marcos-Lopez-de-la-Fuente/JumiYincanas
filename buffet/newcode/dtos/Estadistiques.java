package buffet.newcode.dtos;

public class Estadistiques {

    // ! Atributos
    public EstadistiquesChef chef;
    public EstadistiquesComensals comensal;
    public EstadistiquesBuffets areaBuffet;

    // ! Constructor
    public Estadistiques() {
        this.chef = new EstadistiquesChef();
        this.comensal = new EstadistiquesComensals();
        this.areaBuffet = new EstadistiquesBuffets();
    }

}
