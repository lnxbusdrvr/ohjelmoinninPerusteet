/*
 * Luo luokka nimeltä Huone.
 * Lisää luokalle oliomuuttujat
 *
 * private String koodi
 * private int istumapaikat
 *
 * Luo tämän jälkeen konstruktori
 * public Huone(String luokanKoodi, int istumapaikkojenMaara)
 *
 * jonka avulla oliomuuttujiin asetetaan arvot.
 *
 * Luokkakaavio:
 *
 * |        Huone        |
 * |---------------------|
 * | -koodi: String      |
 * | -istumapaikat: int  |
 * |---------------------|
 * | +Huone(String, int) |
 *
 */
 

public class Huone {
    private String koodi;
    private int istumapaikat;
    
    // Konstruktori
    public Huone(String koodi, int istumapaikat) {
        this.koodi = koodi;
        this.istumapaikat = istumapaikat;
    }
}
