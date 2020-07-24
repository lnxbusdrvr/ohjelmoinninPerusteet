
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author lnxbusdrvr
 */
public class Resepti {
    
    private ArrayList<String> resepti;
    
    public Resepti() {
        this.resepti = new ArrayList<>();
    }
    
    public void lisaa(String resepti) {
        this.resepti.add(resepti);
    }
      
    public String getNimi() {
        return this.resepti.get(0);
    }
    
    public String getAika() {
        return this.resepti.get(1);
    }
        
    @Override
    public String toString(){
        return getNimi()+", keittoaika: "+getAika();
    }
}
