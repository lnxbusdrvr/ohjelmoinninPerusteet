// Luokan koodausaika 5min 9sek
import java.util.ArrayList;

public class Pakkaus {
    private ArrayList<Lahja> paketti ;
    
    public Pakkaus() {
        this.paketti = new ArrayList<>();
    }
    
    public void lisaaLahja(Lahja lahja) {
        this.paketti.add(lahja);
    }
    
    public int yhteispaino() {
        int kilot = 0;
        for(Lahja lista : this.paketti) {
            kilot += lista.getPaino();
        }
        return kilot;
    }
}
