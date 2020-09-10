 
public class Kirja implements Talletettava {
 
    private double paino;
    private String kirjoittaja;
    private String nimi;
 
    public Kirja(String kirjoittaja, String nimi, double paino) {
        this.paino = paino;
        this.kirjoittaja = kirjoittaja;
        this.nimi = nimi;
    }
 
    @Override
    public double paino() {
        return this.paino;
    }
 
    @Override
    public String toString() {
        return this.kirjoittaja + ": " + this.nimi;
    }
 
}
 
