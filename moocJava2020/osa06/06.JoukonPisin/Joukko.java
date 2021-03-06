/*
 * Tehtäväpohjassa on mukana aiemmasta tehtävästä tuttu luokka Joukko. 
 * Toteuta luokkaan metodi 
 * public String pisin(), 
 *
 * joka palauttaa joukon pisimmän merkkijonon. 
 * Mikäli joukko on tyhjä, metodin tulee palauttaa null-viite.
 *
 */
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }
    
    public String pisin() {
        if(this.alkiot.isEmpty()) {
            return null;
        }
        //Luo palautettava oliomuuttuja
        String palautettava = this.alkiot.get(0);
        
        // Käy lista läpi
        for(String joukko : this.alkiot) {
            if(palautettava.length() < joukko.length()) {
                palautettava = joukko;
            }
        }
        return palautettava;
    }

}
