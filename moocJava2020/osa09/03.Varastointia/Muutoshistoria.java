
import java.util.ArrayList;
import java.util.Collections;


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
    
    
    public double maxArvo() {
        // palauttaa muutoshistorian suurimman arvon. 
        // Jos historia on tyhjä, metodi palauttaa nollan.
        if(this.muutoslista.isEmpty()) {
            return 0;            
        }else{
            return Collections.max(this.muutoslista);
        }
        
    }
    
    public double minArvo() {
        // palauttaa muutoshistorian pienimmän arvon. 
        // Jos historia on tyhjä, metodi palauttaa nollan
        if(this.muutoslista.isEmpty()) {
            return 0;            
        }else{
            return Collections.min(this.muutoslista);
        }
    }
    public double keskiarvo() {
        // palauttaa muutoshistorian arvojen keskiarvon. 
        // Jos historia on tyhjä, metodi palauttaa nollan.
        int lkm = 0;
        double summa = 0;
        for(double lista : this.muutoslista) {
            if(this.muutoslista.isEmpty()) {
                return 0;
            }else{
                lkm++;
                summa += lista;
            }
        }
        double keskiarvo = summa / lkm;
        return keskiarvo;
    }

    
    @Override
    public String toString() {
        // palauttaa muutoshistorian  merkkijonoesityksen. 
        // ArrayList-luokan antama merkkijonoesitys 
        // kelpaa sellaisenaan.
        return this.muutoslista.toString();
    }
    
}
