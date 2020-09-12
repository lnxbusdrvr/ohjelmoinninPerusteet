

/**
 *
 * @author lnxbusdrvr
 */
public class Ostos {
    
    private String tuote;
    private int kpl;
    private int yksikkohinta;
    
    public Ostos(String tuote, int kpl, int yksikkohinta) {
        this.tuote = tuote;
        this.kpl = kpl;
        this.yksikkohinta = yksikkohinta;
    }
    
    public int hinta() {
        // palauttaa ostoksen hinnan. 
        // Hinta saadaan kertomalla 
        // kappalemäärä yksikköhinnalla
        return this.kpl * this.yksikkohinta;
    }
    
    public void kasvataMaaraa() {
        // kasvattaa ostoksen kappalemäärää yhdellä
        this.kpl++;
    }
    
    @Override
    public String toString() {
        // palauttaa ostoksen 
        // merkkijonomuodossa, joka on 
        // alla olevan esimerkin mukainen
        return this.tuote+": "+this.kpl;
        
    }
    
}
