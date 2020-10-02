package sovellus;

/**
 *
 * @author lnxbusdrvr
 */
public class Vakiosensori implements Sensori {
    
    private int vakisensori;

    public Vakiosensori(int vakisensori) {
        this.vakisensori = vakisensori;
    }

    @Override
    public boolean onPaalla() {
        return true;
    }

    @Override
    public void paalle() {
        
    }

    @Override
    public void poisPaalta() {
        
    }

    @Override
    public int mittaa() {
        return this.vakisensori;
    }
    
}
