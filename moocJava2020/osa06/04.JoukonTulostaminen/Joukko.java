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
    
    public String toString() {
        String listaTulostus = "";
        if(this.alkiot.isEmpty()) {
            return "Joukko "+this.nimi+" on tyhjä.";
        }if(this.alkiot.size() == 1) {
            String tulostaYks = "Joukossa "
                    +this.nimi+" on "+this.alkiot.size()+
                    " alkio:";
            return tulostaYks+"\n"+this.alkiot.get(0);
        }else{
            String tulostaElse = "Joukossa "
                    +this.nimi+" on "+this.alkiot.size()+
                    " alkiota:";
            for(String lista : this.alkiot) {
                listaTulostus += lista+"\n";
            }
            return tulostaElse+"\n"+listaTulostus;
        }
    }    
}
