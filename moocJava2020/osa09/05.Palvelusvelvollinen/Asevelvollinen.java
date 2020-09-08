

/**
 *
 * @author lnxbusdrvr
 */
public class Asevelvollinen implements Palvelusvelvollinen {
    
    private int paivia;
    
    public Asevelvollinen(int paivia) {
        this.paivia = paivia;
    }
    
    @Override
    public int paiviaJaljella() {
        return this.paivia;
    }

    @Override
    public void palvele() {
        if(paiviaJaljella() > 0) {
            this.paivia--;
        }
    }
        
}
