 
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class Varasto {
 
    private Map<String, Integer> hinnat;
    private Map<String, Integer> saldot;
 
    public Varasto() {
        this.hinnat = new HashMap<>();
        this.saldot = new HashMap<>();
    }
 
    public void lisaaTuote(String tuote, int hinta, int saldo) {
        this.hinnat.put(tuote, hinta);
        this.saldot.put(tuote, saldo);
    }
 
    public int hinta(String tuote) {
        return this.hinnat.getOrDefault(tuote, -99);
    }
 
    public int saldo(String tuote) {
        return this.saldot.getOrDefault(tuote, 0);
    }
 
    public boolean ota(String tuote) {
        if (!this.saldot.containsKey(tuote)) {
            return false;
        }
        
        int saldo = this.saldot.get(tuote);
        if (saldo <= 0) {
            return false;
        }
 
        this.saldot.put(tuote, saldo - 1);
        return true;
    }
 
    public Set<String> tuotteet() {
        return this.saldot.keySet();
    }
}
 
