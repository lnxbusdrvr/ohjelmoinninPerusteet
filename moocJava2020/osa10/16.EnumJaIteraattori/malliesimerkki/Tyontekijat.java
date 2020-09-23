 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
public class Tyontekijat {
 
    private List<Henkilo> henkilot;
 
    public Tyontekijat() {
        henkilot = new ArrayList<>();
    }
 
    public void lisaa(Henkilo lisattava) {
        henkilot.add(lisattava);
    }
 
    public void lisaa(List<Henkilo> lisattavat) {
        lisattavat.stream().forEach(lisattava -> lisaa(lisattava));
    }
 
    public void tulosta() {
        Iterator<Henkilo> iteraattori = henkilot.iterator();
 
        while (iteraattori.hasNext()) {
            System.out.println(iteraattori.next());
        }
 
    }
 
    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = henkilot.iterator();
 
        while (iteraattori.hasNext()) {
            Henkilo hlo = iteraattori.next();
            if (hlo.getKoulutus() == koulutus) {
                System.out.println(hlo);
            }
        }
    }
 
    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = henkilot.iterator();
 
        while (iteraattori.hasNext()) {
            Henkilo hlo = iteraattori.next();
            if (hlo.getKoulutus() == koulutus) {
                iteraattori.remove();
            }
        }
 
    }
}
 
