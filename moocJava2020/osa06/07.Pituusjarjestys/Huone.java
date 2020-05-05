
import java.util.ArrayList;

public class Huone {
    private ArrayList<Henkilo> henkilot;
    
    public Huone() {
        this.henkilot = new ArrayList<>();
    }
    
    public void lisaa(Henkilo henkilo) {
        this.henkilot.add(henkilo);
    }
    
    public boolean onTyhja() {
        if(this.henkilot.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Henkilo> getHenkilot() {        
        return this.henkilot;
    }
}
