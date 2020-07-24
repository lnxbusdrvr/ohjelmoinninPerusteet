
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
        
    @Override
    public String toString(){
        return getNimi()+", keittoaika: "+getAika();
    }
}
