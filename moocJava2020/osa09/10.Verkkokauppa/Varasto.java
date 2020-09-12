
import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author lnxbusdrvr
 */
public class Varasto {
    
    private Map<String, Integer> hinta;
    private Map<String, Integer> saldo;

    public Varasto() {
        this.hinta = new HashMap<>();
        this.saldo = new HashMap<>();
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo) {
        // lisää varastoon tuotteen jonka hinta ja 
        // varastosaldo ovat parametrina annetut luvut
        this.hinta.put(tuote, hinta);
        this.saldo.put(tuote, saldo);
    }
    
    public int hinta(String tuote) {
        // palauttaa parametrina olevan 
        // tuotteen hinnan, jos tuotetta 
        // ei ole varastossa, palauttaa metodi arvon -99.
        if(this.hinta.containsKey(tuote)) {
            return this.hinta.get(tuote);
        }
        return -99;
    }
    
}
