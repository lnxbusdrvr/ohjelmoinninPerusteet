
import java.util.ArrayList;


/**
 *
 * @author lnxbusdrvr
 */
public class YhdenTavaranLaatikko extends Laatikko {
    
    private ArrayList<Tavara> tavarat;
    
    public YhdenTavaranLaatikko() {
        this.tavarat = new ArrayList<>();
    }
    
    @Override
    public void lisaa(Tavara tavara) {
        if(this.tavarat.isEmpty()) {
            this.tavarat.add(tavara);
        }
    }
    
    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
       return this.tavarat.contains(tavara);
    }
    
}
