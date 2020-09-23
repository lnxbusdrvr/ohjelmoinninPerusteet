
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author lnxbusdrvr
 */
public class Tyontekijat {
    private List<Henkilo> tyontekijat;

    public Tyontekijat() {
        this.tyontekijat = new ArrayList<>();
    }
    
    public void lisaa(Henkilo lisattava) {
        this.tyontekijat.add(lisattava);
    }
    
    public void lisaa(List<Henkilo> lisattavat) {
        for(Henkilo hlo : lisattavat) {
            this.tyontekijat.add(hlo);
        }
    }
            
    public void tulosta() {
        Iterator<Henkilo> it = this.tyontekijat.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
            
    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> it = this.tyontekijat.iterator();
        
        while(it.hasNext()) {
            Henkilo apu = it.next();
            if(apu.getKoulutus().equals(koulutus)) {
                System.out.println(apu);
            }
            
        }
    }
    
}
