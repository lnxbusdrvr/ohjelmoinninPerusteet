package sovellus;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 *
 * @author lnxbusdrvr
 */
public class Keskiarvosensori implements Sensori {
    
    private List<Sensori> sensorit;

    public Keskiarvosensori() {
        this.sensorit = new ArrayList<>();
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
        double ka = this.sensorit.stream()
                .mapToInt(s -> s.mittaa())
                .average()
                .getAsDouble();
        return (int)ka;
    }
    
    public void lisaaSensori(Sensori lisattava) {
        this.sensorit.add(lisattava);
    }
    
}
