 
import java.util.HashMap;
import java.util.Map;
 
public class Ostoskori {
 
    private Map<String, Ostos> ostokset;
 
    public Ostoskori() {
        this.ostokset = new HashMap<>();
    }
 
    public int hinta() {
        int summa = 0;
        for (Ostos ostos : this.ostokset.values()) {
            summa = summa + ostos.hinta();
        }
        return summa;
    }
 
    public void lisaa(String tuote, int hinta) {
        this.ostokset.putIfAbsent(tuote, new Ostos(tuote, 0, hinta));
        this.ostokset.get(tuote).kasvataMaaraa();
    }
 
    public void tulosta() {
        for (Ostos ostos : this.ostokset.values()) {
            System.out.println(ostos);
        }
    }
}
 
