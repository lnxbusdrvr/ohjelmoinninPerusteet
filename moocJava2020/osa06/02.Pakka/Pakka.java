/*
 *
 * Osa 1: Pakkaan lisääminen ja tyhjyyden tarkastaminen
 * ----------------------------------------------------
 *
 * Luo luokka Pakka, 
 * jolla on oliomuuttujana merkkijonoja sisältävä listan. 
 * Lisää luokalle seuraavat metodit: 
 *
 * public boolean onTyhja() 
 *
 * palauttaa boolean-tyyppisen arvon (true tai false), 
 * joka kertoo onko pakka tyhjä. 
 *
 * public void lisaa(String arvo) 
 *
 * lisää pakan päälle parametrina annetun arvon.
 *
 * public ArrayList<String> arvot() 
 *
 * palauttaa pakan sisältämän arvot listana.
 *
 * Osa 2: Pakasta ottaminen
 * ------------------------
 *
 * Lisää luokalle Pakka metodi 
 * public String ota(), 
 *
 * joka palauttaa pakan päällimmäisenä olevan arvon 
 * (eli pakkaan viimeisenä lisätyn arvon) 
 * ja poistaa sen pakasta.
 *
 */

import java.util.ArrayList;

public class Pakka {
    private ArrayList<String> pakka;
    
    public Pakka() {
        this.pakka = new ArrayList<>();
    }
    
    public boolean onTyhja() {
        if(this.pakka.isEmpty()) {
            return true;
        }else{
            return false;
        }        
    }
    
    public void lisaa(String arvo) {
        this.pakka.add(arvo);
    }
    
    public ArrayList<String> arvot() {
        return this.pakka;
    }
        
}
