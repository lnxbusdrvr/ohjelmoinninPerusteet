 
public class Sivari implements Palvelusvelvollinen {
 
    private int paivia;
 
    public Sivari() {
        this.paivia = 362;
    }
 
    @Override
    public int paiviaJaljella() {
        return paivia;
    }
 
    @Override
    public void palvele() {
        if (paivia <= 0) {
            return;
        }
 
        paivia--;
    }
}
 
