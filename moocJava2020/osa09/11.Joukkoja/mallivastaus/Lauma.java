 
import java.util.ArrayList;
import java.util.List;
 
public class Lauma implements Siirrettava {
 
    private List<Siirrettava> lauma;
 
    public Lauma() {
        this.lauma = new ArrayList<>();
    }
 
    public void lisaaLaumaan(Siirrettava s) {
        this.lauma.add(s);
    }
 
    @Override
    public void siirra(int dx, int dy) {
        for (Siirrettava siirrettava : this.lauma) {
            siirrettava.siirra(dx, dy);
        }
    }
 
    @Override
    public String toString() {
        String s = "";
 
        for (Siirrettava siirrettava : this.lauma) {
            s = s + siirrettava.toString() + "\n";
        }
 
        return s;
    }
}
 
