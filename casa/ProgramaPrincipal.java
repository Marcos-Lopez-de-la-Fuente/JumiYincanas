package casa;

// ! TENGO QUE PREGUNTAR A JUMI SOBRE EL FALLO CON LA CLASE "JARDIN" DEBIDO A QUE PUEDE SER ATRIBUTO DE "FINCA" Y DE ESA PROPIA "FINCA-->VIVIENDA-->ADOSADO"

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // ! CREACIÓN DE OBJETOS
        // PROPIETARIOS
        Propietario propietario1 = new Propietario("123456789K", "Marcos", "Palma");


        // FINCAS
        Finca finca1 = new Finca("NombreDeFinca", Tipo.rustico, "Manacor", 134, 80000);
        Finca finca2 = new Finca("NombreDeFinca2", Tipo.urbano, "Madrid", 159, 500000);


        // CHALETS
        Chalet chalet1 = new Chalet("DescripcionChalet", "Mallorca", 253, 5, 10000);
        Adosado adosado1 = new Adosado("DescripcionAdosado", "Menorca", 100, 3, 90000, 10, 3);
        Apartamento apartamento1 = new Apartamento("DescripcionApartamento", "Ibiza", 40, 2, 300000, true);




        // ! AÑADIR LAS FINCAS A SUS PROPIETARIOS
        propietario1.add_finca(finca1);
        propietario1.add_finca(finca2);




        // ! AÑADIR LOS ATRIBUTOS DE LAS FINCAS
        finca1.addHuerto(20, true);
        finca1.addPiscina(500, true, 5000);
        finca1.addJardin(30, 10);


        finca2.addHuerto(20, true);
        finca2.addPiscina(800, true, 20000);
        finca2.addJardin(30, 2);

        finca2.addChalet("DescripcionChalet2", "Sevilla", 140, 6, 20000);
        finca2.addAdosado("DescripcionAdosado2", "Valencia", 512, 23, 800000, 82, 54);
        finca2.addApartamento("DescripcionApartamento2", "Galicia", 241, 8, 10004, false);




        // ! AÑADIR LAS VIVIENDAS A SUS PROPIETARIOS
        propietario1.add_vivienda(chalet1);
        propietario1.add_vivienda(adosado1);
        propietario1.add_vivienda(apartamento1);




        // ! AÑADIR LOS ATRIBUTOS DE LAS VIVIENDAS (SOLO SE PUEDEN CHALETS)
        chalet1.addPiscina(300, false, 8000);
        chalet1.addJardin(25, 1);





        // ! IMPRESIONES
        System.out.println(propietario1.show());
        System.out.println(propietario1.get_valor());


    }
}
