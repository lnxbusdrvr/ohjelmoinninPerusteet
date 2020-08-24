
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author lnxbusdrvr
 */
public class Ajoneuvorekisteri {
    
    private HashMap<Rekisterinumero, String> omistajat;
    
    public Ajoneuvorekisteri() {
        this.omistajat = new HashMap<>();
    }
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        // lisää parametrina olevaa rekisterinumeroa vastaavalle 
        // autolle parametrina olevan omistajan. Metodi 
        // palauttaa true jos omistajaa ei ollut ennestään; 
        // jos rekisterinumeroa vastaavalla autolla taas oli jo 
        // omistaja, metodi palauttaa false ja ei tee mitään
        if(!this.omistajat.containsKey(rekkari)) {
            this.omistajat.put(rekkari, omistaja);
            return true;
        }        
        return false;
    }
    
    public String hae(Rekisterinumero rekkari) {
        // palauttaa parametrina olevaa 
        // rekisterinumeroa vastaavan auton 
        // omistajan. Jos auto ei ole rekisterissä, 
        // palautetaan null
        for(Rekisterinumero rekNro : this.omistajat.keySet()) {
            if(this.omistajat.containsKey(rekkari)) {
                return this.omistajat.get(rekkari);
            }
        }
        return null;
    }
    
    public boolean poista(Rekisterinumero rekkari) {
        // poistaa parametrina olevaa rekisterinumeroa 
        // vastaavat tiedot, metodi palauttaa true jos 
        // tiedot poistetiin, ja false jos parametria 
        // vastaavia tietoja ei ollut rekisterissä
        if(this.omistajat.containsKey(rekkari)) {
            this.omistajat.remove(rekkari);
            return true;
        }
        return false;
    }
    
    public void tulostaRekisterinumerot() {
        // tulostaa rekisterissä olevat rekisterinumerot.
        for(Rekisterinumero rekNro : this.omistajat.keySet()) {
            System.out.println(rekNro);
        }
        
    }
    
    public void tulostaOmistajat() {
        // tulostaa rekisterissä olevien autojen omistajat. 
        // Kukin nimi tulee tulostaa vain kertaalleen vaikka 
        // omistajalla olisikin useampi auto.
        ArrayList<String> tulostaOmistaja = new ArrayList<>();
        
        //Lisätään listaan omistajat
        for(String omistaja : this.omistajat.values()) {
            if(!tulostaOmistaja.contains(omistaja)) {
                tulostaOmistaja.add(omistaja);
            }
        }
        // Tulostetaan omistajat
        for(String omistajalista : tulostaOmistaja) {
            System.out.println(omistajalista);
        }
    }
    
}
