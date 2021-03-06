/*
 * Luo luokka nimeltä Pilli.
 * Lisää luokalle oliomuuttuja
 *
 * private String aani
 *
 * Luo tämän jälkeen konstruktori
 *
 * public Pilli(String pillinAani)
 *
 * jonka avulla luodaan uusi pilli, jolle annetaan ääni.
 *
 * Lisää pillille vielä metodi
 *
 * public void soi()
 *
 * joka tulostaa pillin äänen.
 *
 *
 * Pillin tulee toimia seuraavasti:
 *
 * Pilli sorsapilli = new Pilli("Kvaak");
 * Pilli kukkopilli = new Pilli("Peef");
 *
 * sorsapilli.soi();
 * kukkopilli.soi();
 * sorsapilli.soi();
 *
 * Esimerkkitulostus:
 *
 * Kvaak
 * Peef
 * Kvaak
 *
 */


public class Pilli {
    private String aani;
    
    // Konstruktori
    public Pilli(String pillinAani) {
        this.aani = pillinAani;
    }
    
    public void soi() {
        System.out.println(aani);
    }
}
