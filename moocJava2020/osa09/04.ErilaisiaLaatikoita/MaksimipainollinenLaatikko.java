
import java.util.ArrayList;



/**
 *
 * @author lnxbusdrvr
 */
public class MaksimipainollinenLaatikko extends Laatikko {
    
    private int maksimipaino;
    private ArrayList<Tavara> tavarat;
    
    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }
    
    /**
     *
     * @param tavara
     * @return
     */
    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
       return this.tavarat.contains(tavara);
    }

    @Override
    public void lisaa(Tavara tavara) {
        int paino = 0;
        for(Tavara laatikko : this.tavarat) {
            paino += laatikko.getPaino();            
        }
        
        if((paino + tavara.getPaino() <= this.maksimipaino)) {
            this.tavarat.add(tavara);
        }               
    }
    
}
