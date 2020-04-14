/*
 * Luo luokka Elokuva, jolla on oliomuuttujat nimi (String) ja ikaraja (int).
 * Tee luokalle konstruktori public Elokuva(String elokuvanNimi, int elokuvanIkaraja)
 * sekä metodit public String nimi() ja public int ikaraja().
 * Ensimmäinen palauttaa elokuvan nimen ja toinen elokuvan ikärajan.
 *
 */

public class Elokuva {
    private String nimi;
    private int ikaraja;
    
    public Elokuva(String elokuvanNimi, int elokuvanIkaraja) {
        this.nimi = elokuvanNimi;
        this.ikaraja = elokuvanIkaraja;
    }
    
    public String nimi() {
        return nimi;
    }
    
    public int ikaraja() {
        return ikaraja;
    }    
}
