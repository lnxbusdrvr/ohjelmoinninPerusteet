 
import java.util.ArrayList;
import java.util.HashMap;
 
public class Kellari {
 
    private HashMap<String, ArrayList<String>> komerotJaSisallot;
 
    public Kellari() {
        this.komerotJaSisallot = new HashMap();
    }
 
    public void lisaa(String komero, String tavara) {
        this.komerotJaSisallot.putIfAbsent(komero, new ArrayList<>());
        this.komerotJaSisallot.get(komero).add(tavara);
    }
 
    public ArrayList<String> sisalto(String komero) {
        return this.komerotJaSisallot.getOrDefault(komero, new ArrayList<>());
    }
 
    public void poista(String komero, String tavara) {
        if (!this.komerotJaSisallot.containsKey(komero)) {
            return;
        }
 
        this.komerotJaSisallot.get(komero).remove(tavara);
 
        if (this.komerotJaSisallot.get(komero).isEmpty()) {
            this.komerotJaSisallot.remove(komero);
        }
    }
 
    public ArrayList<String> komerot() {
        ArrayList<String> komerot = new ArrayList<>();
        for (String komero : this.komerotJaSisallot.keySet()) {
            komerot.add(komero);
        }
 
        return komerot;
    }
}
 
