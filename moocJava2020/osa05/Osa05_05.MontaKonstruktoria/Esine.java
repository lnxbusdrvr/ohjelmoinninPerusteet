/*
 * Tehtäväpohjassa on luokka Esine,
 * joka kuvaa kaupassa olevaa esinettä.
 * Jokaisella esineellä on nimi, sijainti sekä paino.
 *
 * Lisää luokkaan Esine seuraavat kolme konstruktoria:
 *
 *  public Esine(String nimi) luo esineen annetulla nimellä. Esineen sijainniksi tulee "pientavarahylly" ja painoksi 1.
 *  public Esine(String nimi, String sijainti) luo esineen annetulla nimellä ja sijainnilla. Esineen painoksi tulee 1.
 *  public Esine(String nimi, int paino) luo esineen annetulla nimellä ja painolla. Esineen sijainniksi tulee "varasto".
 *
 * Esimerkkitulostus:
 *
 * Mitta (1 kg) löytyy sijainnista pientavarahylly
 * Laasti (1 kg) löytyy sijainnista remonttitavarat
 * Rengas (5 kg) löytyy sijainnista varasto
 *
 */
 
 
public class Esine {

    private String nimi;
    private String sijainti;
    private int paino;

    public Esine(String nimi, String sijainti, int paino) {
        this.nimi = nimi;
        this.sijainti = sijainti;
        this.paino = paino;
    }

    
    public String getNimi() {
        return nimi;
    }

    public int getPaino() {
        return paino;
    }

    public String getSijainti() {
        return sijainti;
    }

    @Override
    public String toString() {
        return this.nimi + " (" + this.paino + " kg) löytyy sijainnista " + this.sijainti;
    }
}
