
import java.util.ArrayList;


/**
 *
 * @author lnxbusdrvr
 */
public class Muutoshistoria {
    
    private ArrayList<Double> muutoslista;
    
    public Muutoshistoria() {
        this.muutoslista = new ArrayList<>();
    }
    
    public void lisaa(double tilanne) {
        // lisää muutoshistorian viimeisimmäksi 
        // muistettavaksi määräksi parametrina 
        // annetun tilanteen.
        this.muutoslista.add(tilanne);
    }
    
    public void nollaa() {
        // tyhjää muistin.
        this.muutoslista.clear();
    }
    
    @Override
    public String toString() {
        // palauttaa muutoshistorian  merkkijonoesityksen. 
        // ArrayList-luokan antama merkkijonoesitys 
        // kelpaa sellaisenaan.
        return this.muutoslista.toString();
    }
    
}
