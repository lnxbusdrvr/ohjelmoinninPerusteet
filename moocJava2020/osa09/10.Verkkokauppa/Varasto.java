
import java.util.HashMap;
import java.util.Map;
import java.util.Set;



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
    
    public int saldo(String tuote) {
        // palauttaa parametrina olevan tuotteen 
        // varastosaldon. Jos tuotetta ei ole 
        // varastossa lainkaan, tulee palauttaa 0.
        if(this.saldo.containsKey(tuote)) {
            return this.saldo.get(tuote);
        }
        return 0;
    }
    
    public boolean ota(String tuote) {
        // vähentää parametrina olevan 
        // tuotteen saldoa yhdellä ja 
        // palauttaa true jos tuotetta oli 
        // varastossa. Jos tuotetta ei ole 
        // varastossa, palauttaa metodi false, 
        // tuotteen saldo ei saa laskea alle nollan.
        if(this.saldo.containsKey(tuote)) {
            if(this.saldo.get(tuote) >0) {
                this.saldo.put(tuote, this.saldo.get(tuote) - 1);
                return true;
            }            
        }
        return false;
    }
    
    public Set<String> tuotteet() {
        // palauttaa joukkona varastossa 
        // olevien tuotteiden nimet.
        return this.saldo.keySet();
    }
    
}
