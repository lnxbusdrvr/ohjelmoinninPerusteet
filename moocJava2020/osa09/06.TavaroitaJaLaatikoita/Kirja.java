

/**
 *
 * @author vadenn
 */
public class Kirja implements Talletettava {
    String kirjoittaja;
    String teos;
    double paino;
    
    public Kirja(String kirjoittaja, String teos, double paino) {
        this.kirjoittaja = kirjoittaja;
        this.teos = teos;
        this.paino = paino;
    }

    @Override
    public double paino() {
        return this.paino;
    }
    
    @Override
    public String toString() {
        return this.kirjoittaja+": "+this.teos;
    }
    
}
