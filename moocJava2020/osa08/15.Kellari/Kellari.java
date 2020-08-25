
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author lnxbusdrvr
 */
public class Kellari {
    
    private HashMap<String, ArrayList<String>> kellari;
    
    public Kellari() {
        this.kellari = new HashMap<>();
    }
    
    public void lisaa(String komero, String tavara) {
        // lisää parametrina annettuun komeroon 
        //parametrina annetun tavaran.
        this.kellari.putIfAbsent(komero, new ArrayList<>());
        
        this.kellari.get(komero).add(tavara);
    }
        
    public ArrayList<String> sisalto(String komero) {
        // palauttaa listan, joka sisältää parametrina 
        //annetun komeron sisältämät tavarat. Mikäli 
        // komeroa ei ole tai komerossa ei ole yhtäkään 
        // tavaraa, metodin tulee palauttaa tyhjä lista.
        return this.kellari.getOrDefault(komero, new ArrayList<>());
    }

    
    public void poista(String komero, String tavara) {
        // poistaa parametrina annetusta komerosta parametrina 
        // annetun tavaran. Huom! Poistaa vain yhden kappaleen 
        // mikäli samannimisiä tavaroita on useita, loput jäävät 
        // vielä jäljelle. Mikäli komero jäisi poiston jälkeen tyhjäksi, 
        // metodi poistaa myös komeron.
        if(this.kellari.get(komero).contains(tavara)) {
            this.kellari.get(komero).remove(tavara);
        }
    }
    public ArrayList<String> komerot() {
        // palauttaa listana kellarikomeroiden nimet. 
        // Huom! Listassa vain ne komerot, joissa on tavaraa.
        ArrayList<String> tulostukset = new ArrayList<>();
        
        for(String komero : this.kellari.keySet()) {
            if(!this.kellari.get(komero).isEmpty()) {
                tulostukset.add(komero);
            }
        }
        return tulostukset;
    }

    
}
