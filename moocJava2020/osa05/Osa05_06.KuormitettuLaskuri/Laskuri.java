/*
 * Osa 1: Monta konstruktoria
 *
 * Toteuta luokka Laskuri,
 * joka sisältää luvun, jota voi vähentää ja suurentaa.
 * Luokalla tulee olla seuraavat konstruktorit:
 * 
 *  public Laskuri(int alkuarvo) asettaa laskurin alkuarvoksi parametrin alkuarvo arvon.
 *  public Laskuri() laskurin alkuarvoksi tulee 0.
 *
 * ja seuraavat metodit:
 *
 *  public int arvo() palauttaa laskurin tämänhetkisen arvon
 *  public void lisaa() lisää laskurin arvoa yhdellä
 *  public void vahenna() vähentää laskurin arvoa yhdellä
 *
 * Osa2: Vaihtoehtoiset metodit
 *
 * Tee laskurin metodeista lisaa ja vahenna myös yksiparametriset versiot:
 *
 *  public void lisaa(int lisays) 
 *
 * lisää laskurin arvoa parametrina annetun luvun verran.
 * Jos parametrin arvo on negatiivinen, ei laskurin arvo muutu.
 *
 *  public void vahenna(int vahennys)
 *
 * vähentää laskurin arvoa parametrina annetun luvun verran.
 * Jos parametrin arvo on negatiivinen, ei laskurin arvo muutu.
 *
 */


public class Laskuri {
    private int alkuarvo;
    
    public Laskuri(int alkuarvo) {
        this.alkuarvo = alkuarvo;
    }
    
    public Laskuri() {
        this.alkuarvo = 0;
    }
    
    public int arvo() {
        return this.alkuarvo;
    }
    
    public void lisaa() {
        this.alkuarvo = this.alkuarvo + 1;
    }
    
    public void lisaa(int lisays) {
        if(lisays < 0) {
            lisays = 0;
        }
        this.alkuarvo = this.alkuarvo + lisays;
    }
    
    public void vahenna() {
        this.alkuarvo = this.alkuarvo - 1;
    }
    
    public void vahenna(int vahennys) {
        if(vahennys < 0) {
            vahennys = 0;
        }
        this.alkuarvo = this.alkuarvo - vahennys;
    }
}
