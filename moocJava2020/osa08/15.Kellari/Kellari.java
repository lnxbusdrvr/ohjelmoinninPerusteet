
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


    
}
