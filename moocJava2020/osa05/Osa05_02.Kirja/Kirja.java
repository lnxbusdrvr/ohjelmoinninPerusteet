/*
 * Luo kirjaa esittävä luokka Kirja.
 * Jokaisella kirjalla on kirjailija,
 * nimi ja sivujen lukumäärä.
 *
 * Tee luokalle:
 *
 * Konstruktori public Kirja(String kirjailija, String nimi, int sivuja)
 * Metodi public String getKirjailija() joka palauttaa kirjan kirjailijan nimen.
 * Metodi public String getNimi() joka palauttaa kirjan nimen.
 * Metodi public int getSivuja() joka palauttaa kirjan sivujen lukumäärän.
 *
 * Tee kirjalle lisäksi public String toString()-metodi,
 * jota käytetään kirja-olion tulostamiseen.
 * Metodin kutsun tulee tuottaa esimerkiksi seuraavanlainen tulostus:
 *
 * Esimerkkitulostus:
 *
 * J. K. Rowling, Harry Potter ja viisasten kivi, 223 sivua
 *
 */


public class Kirja {
    private String kirjailija;
    private String nimi;
    private int sivuja;
    
    // Konstruktori
    public Kirja(String kirjailija, String nimi, int sivuja) {
        this.kirjailija = kirjailija;
        this.nimi = nimi;
        this.sivuja = sivuja;
    }
    
    // Getters
    public String getKirjailija() {
        return this.kirjailija;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getSivuja() {
        return this.sivuja;
    }
    
    public String toString() {
        return this.kirjailija+", "+this.nimi+", "+this.sivuja+" sivua";
    }
}
