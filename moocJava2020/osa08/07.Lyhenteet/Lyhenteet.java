
import java.util.HashMap;

/**
 *
 * @author lnxbusdrvr
 */
public class Lyhenteet {
    HashMap<String, String> hajautustaulu;
    
    public Lyhenteet() {
        this.hajautustaulu = new HashMap<>();
    }
    
    public void lisaaLyhenne(String lyhenne, String selite)  {
        this.hajautustaulu.put(lyhenne, selite);
    }
    
    public boolean onkoLyhennetta(String lyhenne) {
        if(this.hajautustaulu.containsKey(lyhenne)) {
            return true;
        }else{
            return false;
        }
    }
    
    public String haeLyhenne(String lyhenne) {
            String lyh = this.hajautustaulu.get(lyhenne);
            return lyh;
    }
    
}
