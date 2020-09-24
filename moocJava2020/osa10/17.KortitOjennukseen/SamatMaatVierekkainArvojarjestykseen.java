
import java.util.Comparator;

/**
 *
 * @author lnxbusdrvr
 */
public class SamatMaatVierekkainArvojarjestykseen implements Comparator<Kortti> {

    @Override
    public int compare(Kortti k1, Kortti k2) {
        /*return k1.getMaa().ordinal() - k2.getMaa().ordinal()
                +(k1.getArvo() - k2.getArvo());*/
        
        /* returnit eivät toimi, koska molemmissa on eri palautusarvo
        return k1.getArvo() - k2.getArvo()
                +(k1.getMaa().ordinal() - k2.getMaa().ordinal());*/
        // Algoritmi:
        //jos maat ovat samat:
        //      palauta korttien arvojen erotus
        //muuten:
        //      palauta maiden keskenäinen järjestys 
        if(k1.getMaa().ordinal() == k2.getMaa().ordinal()) {
            return k1.getArvo() - k2.getArvo();
        }
        return k1.getMaa().ordinal() - k2.getMaa().ordinal();
    }
    
}
