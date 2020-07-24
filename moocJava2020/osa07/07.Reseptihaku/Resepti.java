
import java.util.ArrayList;

/**
 *
 * @author lnxbusdrvr
 */
public class Resepti {
    
    private ArrayList<String> resepti;
    
    public Resepti() {
        this.resepti = new ArrayList<>();
    }
    
    public void lisaa(String lisattava) {
        this.resepti.add(lisattava);
    }
      
    public String getNimi() {
        return this.resepti.get(0);
    }
    
    public int getAika() {
        return Integer.parseInt(this.resepti.get(1));
    }
    
    public boolean getAinekset(String haettava) {
        // Käy läpi reseptin kaikki rivit
        for(String ainekset : this.resepti) {
            // Jos hakusana ei löydy
            if(ainekset.equals(haettava)) {
                // palauta epätosi
                return true;
            }
        }
        return false;
    }
        
    @Override
    public String toString(){
        return getNimi()+", keittoaika: "+getAika();
    }
}
