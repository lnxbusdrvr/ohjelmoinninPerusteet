package sovellus;

import java.util.Random;

/**
 *
 * @author lnxbusdrvr
 */
public class Lampomittari implements Sensori {
    private boolean lampomittari;

    public Lampomittari() {
        this.lampomittari = false;
    }
    
    

    @Override
    public boolean onPaalla() {
        return this.lampomittari;
    }

    @Override
    public void paalle() {
        this.lampomittari = true;
        
    }

    @Override
    public void poisPaalta() {
        this.lampomittari = false;
        
    }

    @Override
    public int mittaa() {
        if(this.onPaalla() == true) {
            return new Random().nextInt(30 + 30) - 30;
        }
        //throw new IllegalArgumentException("Mittari ei ole päällä");
        throw new IllegalStateException("Mittari ei ole päällä");
    }
    
}
