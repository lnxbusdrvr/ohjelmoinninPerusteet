/*
 * Ohjelma toimii, kun sitä kutsutaan esitetyllä tavalla
 * System.out.println() -sisällä
 *
 */
 
 
public class Main {

    public static void main(String[] args) {
        // testaa luokkasi toimintaa täällä!
        
        Paivays muokattava = new Paivays(30, 12, 2011);
        System.out.println(muokattava);        
        System.out.println(muokattava.paivienPaasta(2));
    }
}
