 
import java.util.ArrayList;
 
public class Tehtavalista {
 
    private ArrayList<String> tehtavat;
 
    public Tehtavalista() {
        this.tehtavat = new ArrayList<>();
    }
 
    public void lisaa(String tehtava) {
        this.tehtavat.add(tehtava);
    }
 
    public void tulosta() {
        for (int i = 0; i < this.tehtavat.size(); i++) {
            System.out.println((i + 1) + ": " + this.tehtavat.get(i));
        }
    }
 
    public void poista(int numero) {
        int indeksi = numero - 1;
        if (indeksi < 0 || indeksi >= this.tehtavat.size()) {
            return;
        }
 
        this.tehtavat.remove(indeksi);
    }
 
}
 
