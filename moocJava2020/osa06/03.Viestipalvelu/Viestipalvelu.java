/*
 * Tehtäväpohjassa on valmiina luokka Viesti, 
 * jonka avulla voidaan luoda viestejä kuvaavia olioita. i
 * Jokaisella viestillä on lähettäjä ja sisältö. 
 *
 * Toteuta luokka Viestipalvelu. 
 * Luokalla tulee olla parametriton konstruktori ja sen tulee 
 * sisältää lista Viesti-olioita.
 * Lisää luokalle tämän jälkeen seuraavat kaksi metodia: 
 *
 * public void lisaa(Viesti viesti) 
 *
 * lisää viestipalveluun parametrina annetun viestin mikäli viestin 
 * sisällön pituus on korkeintaan 280 merkkiä. 
 *
 * public ArrayList<Viesti> getViestit() 
 *
 * palauttaa viestipaveluun lisätyt viestit. 
 *
 * Vinkki! Saat merkkijonon pituuden merkkijonoon i
 * liittyvällä length()-metodilla.
 *
 */

import java.util.ArrayList;

public class Viestipalvelu {
    private ArrayList<Viesti> lista;
    
    public Viestipalvelu() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(Viesti viesti) {
        if(viesti.getPituus() <= 280) {
            lista.add(viesti);
        }
    }
    
    public ArrayList<Viesti> getViestit() {
        return this.lista;
    }
}
