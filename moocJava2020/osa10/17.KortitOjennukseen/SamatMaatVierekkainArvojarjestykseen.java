
import java.util.Comparator;

/**
 *
 * @author lnxbusdrvr
 */
public class SamatMaatVierekkainArvojarjestykseen implements Comparator<Kortti> {

    @Override
    public int compare(Kortti k1, Kortti k2) {
        return k1.getMaa().ordinal() - k2.getMaa().ordinal()
                +(k1.getArvo() - k2.getArvo());
    }
    
}
