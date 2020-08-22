
import java.util.HashMap;

/**
 *
 * @author lnxbusdrvr
 */
public class Velkakirja {
    
    private HashMap<String, Double> velkakirja;
    
    public Velkakirja() {
        this.velkakirja = new HashMap<>();
    }
    
    public void asetaLaina(String kenelle, double maara) {
        // tallettaa velkakirjaan merkinnän lainasta tietylle henkilölle.
        this.velkakirja.put(kenelle, maara);
    }
    
    public double paljonkoVelkaa(String kuka) {
        //  palauttaa velan määrän annetun henkilön nimen 
        // perusteella. Jos henkilöä ei löydy, palautetaan 0.
        return this.velkakirja.getOrDefault(kuka, 0.0);
        
    }
    
}
