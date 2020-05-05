/*
 * Tehtäväpohjassa on valmiina luokka Joukko, 
 * jota käytetään arvoja sisältävän joukon kuvaamiseen. 
 * Luokalta puuttuu tulostamiseen käytettävä toString-metodi. 
 *
 * Toteuta luokalle i
 * toString-metodi, 
 *
 * jonka avulla tulostus toimii seuraavien esimerkkien kuvaamalla tavalla.
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
    
}
