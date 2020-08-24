 
import java.util.ArrayList;
import java.util.HashMap;
 
public class UseanKaannoksenSanakirja {
 
    private HashMap<String, ArrayList<String>> sanakirja;
 
    public UseanKaannoksenSanakirja() {
        this.sanakirja = new HashMap<>();
    }
 
    public void lisaa(String sana, String kaannos) {
        this.sanakirja.putIfAbsent(sana, new ArrayList<>());
        this.sanakirja.get(sana).add(kaannos);
    }
 
    public ArrayList<String> kaanna(String sana) {
        return sanakirja.getOrDefault(sana, new ArrayList<>());
    }
 
    public void poista(String sana) {
        sanakirja.remove(sana);
    }
}
 
