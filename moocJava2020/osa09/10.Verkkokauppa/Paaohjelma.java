

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        
        // Osa 4
        Ostos ostos = new Ostos("maito", 4, 2);
        System.out.println("ostoksen joka sisältää 4 maitoa yhteishinta on " + ostos.hinta());
        System.out.println(ostos);
        ostos.kasvataMaaraa();
        System.out.println(ostos);
    }
}
