

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        
        /* Osa 4
        Ostos ostos = new Ostos("maito", 4, 2);
        System.out.println("ostoksen joka sisältää 4 maitoa yhteishinta on " + ostos.hinta());
        System.out.println(ostos);
        ostos.kasvataMaaraa();
        System.out.println(ostos);
        */
        
        // Osa 5
        Ostoskori kori = new Ostoskori();
        kori.lisaa("maito", 3);
        kori.lisaa("piima", 2);
        kori.lisaa("juusto", 5);
        System.out.println("korin hinta: " + kori.hinta());
        kori.lisaa("tietokone", 899);
        System.out.println("korin hinta: " + kori.hinta());
        
    }
}
