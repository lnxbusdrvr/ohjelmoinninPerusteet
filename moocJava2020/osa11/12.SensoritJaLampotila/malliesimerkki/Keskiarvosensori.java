package sovellus;
 
import java.util.ArrayList;
import java.util.List;
 
public class Keskiarvosensori implements Sensori {
 
    private List<Sensori> sensorit;
    private List<Integer> mittaukset;
 
    public Keskiarvosensori() {
        sensorit = new ArrayList<>();
        mittaukset = new ArrayList<>();
    }
 
    public void lisaaSensori(Sensori lisattava) {
        sensorit.add(lisattava);
    }
 
    public List<Integer> mittaukset() {
        return mittaukset;
    }
 
    @Override
    public boolean onPaalla() {
        for (Sensori sensori : sensorit) {
            if (sensori.onPaalla()) {
                return true;
            }
        }
 
        return false;
    }
 
    @Override
    public void paalle() {
        for (Sensori sensori : sensorit) {
            sensori.paalle();
        }
    }
 
    @Override
    public void poisPaalta() {
        for (Sensori sensori : sensorit) {
            sensori.poisPaalta();
        }
    }
 
    @Override
    public int mittaa() {
        if (!onPaalla()) {
            throw new IllegalStateException();
        }
 
        int summa = 0;
        for (Sensori sensori : sensorit) {
            summa += sensori.mittaa();
        }
        int mittaus = summa / sensorit.size();
 
        mittaukset.add(mittaus);
 
        return mittaus;
    }
}
 
