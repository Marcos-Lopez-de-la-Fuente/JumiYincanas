package casa;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Propietario propietario1 = new Propietario("123456789K", "Marcos", "Palma");
        Vivienda vivienda1 = new Vivienda("Vivienda muy bonita", "Manacor", 145.32 , 5, 80000);
        

        System.out.println(propietario1.show());
        propietario1.add_vivienda(vivienda1);
        propietario1.add_finca(finca1);
    }
}
