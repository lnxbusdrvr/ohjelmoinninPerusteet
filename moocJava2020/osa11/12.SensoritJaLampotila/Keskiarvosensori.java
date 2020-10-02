package sovellus;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 *
 * @author lnxbusdrvr
 */
public class Keskiarvosensori implements Sensori {
    
    private List<Sensori> sensorit;
    private List<Integer> mittaukset;

    public Keskiarvosensori() {
        this.sensorit = new ArrayList<>();
        this.mittaukset = new ArrayList<>();
    }

    @Override
    public boolean onPaalla() {
        if (this.sensorit.stream().anyMatch((s) -> (s.onPaalla() == true))) {
            return true;
        }
        return false;
    }

    @Override
    public void paalle() {
        this.sensorit.forEach((s) -> {
            s.paalle();
        });
    }

    @Override
    public void poisPaalta() {
        this.sensorit.forEach((s) -> {
            s.poisPaalta();
        });
    }

    @Override
    public int mittaa() {
        /*double ka = this.sensorit.stream()
                .mapToInt(s -> s.mittaa())
                .average()
                .getAsDouble();*/
        int summa = 0;
        summa = this.sensorit.stream()
                .map((s) -> s.mittaa())
                .reduce(summa, Integer::sum);
        this.mittaukset.add(summa / this.sensorit.size());
                
        return (int)summa / this.sensorit.size();
    }
    
    public void lisaaSensori(Sensori lisattava) {
        this.sensorit.add(lisattava);
    }
    
    public List<Integer> mittaukset() {
        return this.mittaukset;
    }
    
}
