/*
 * Luo luokka Kertoja jolla on:
 *
 *  Konstruktori public Kertoja(int luku).
 *  Metodi public int kerro(int luku)
 *
 * joka palauttaa sille annetun luvun
 * luku kerrottuna konstruktorille annetulla luvulla luku.
 *
 * Tarvinnet tässä myös oliomuuttujan...
 *
 */
 

public class Kertoja {
    private int luku;
    
    // Konstructori
    public Kertoja(int luku) {
        this.luku = luku;
    }
    
    // Metodit
    public int kerro(int luku) {
        return this.luku * luku;
    }
}
