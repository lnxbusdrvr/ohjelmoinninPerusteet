/*
 * Osa6: Monta korttia
 * --------------------
 *
 * Tee luokan Paaohjelma main-metodiin koodi,
 * joka sisältää seuraavan tapahtumasarjan:
 *
 * Luo Pekan kortti. Kortin alkusaldo on 20 euroa
 * Luo Matin kortti. Kortin alkusaldo on 30 euroa
 * Pekka syö maukkaasti
 * Matti syö edullisesti
 * Korttien arvot tulostetaan (molemmat omalle rivilleen, rivin alkuun kortin omistajan nimi)
 * Pekka lataa rahaa 20 euroa
 * Matti syö maukkaasti
 * Korttien arvot tulostetaan (molemmat omalle rivilleen, rivin alkuun kortin omistajan nimi)
 * Pekka syö edullisesti
 * Pekka syö edullisesti
 * Matti lataa rahaa 50 euroa
 * Korttien arvot tulostetaan (molemmat omalle rivilleen, rivin alkuun kortin omistajan nimi)
 *
 */
 
 

public class Paaohjelma {

    public static void main(String[] args) {
        // Scanner lukija = new Scanner(System.in);
        
        // Tee tänne koodia jolla testaat että Maksukortti toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävän viimeisessä osassa!
        Maksukortti pekka = new Maksukortti(20);
        Maksukortti matti = new Maksukortti(30);
        
        pekka.syoMaukkaasti();
        matti.syoEdullisesti();
        
        System.out.println("Pekka "+pekka);
        System.out.println("Matti "+matti);
        
        pekka.lataaRahaa(20);
        matti.syoMaukkaasti();
        
        System.out.println("Pekka "+pekka);
        System.out.println("Matti "+matti);
        
        pekka.syoEdullisesti();
        pekka.syoEdullisesti();
        
        matti.lataaRahaa(50);
        
        System.out.println("Pekka "+pekka);
        System.out.println("Matti "+matti);

    }
}
