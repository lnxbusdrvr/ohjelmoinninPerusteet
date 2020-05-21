
import java.util.ArrayList;

public class Vitsipankki {
    private ArrayList<String> vitsit;
    
    public Vitsipankki() {
        this.vitsit = new ArrayList<>();
    }
    
    public void lisaaVitsi(String vitsi) {
        this.vitsit.add(vitsi);
    }
    
    public String arvoVitsi() {
        if(this.vitsit.isEmpty()) {
            return "Vitsit vähissä.";
        }
        int satunnainenNro = (int)(Math.random() * this.vitsit.size());
        return this.vitsit.get(satunnainenNro);
    }
    
    public void tulostaVitsit() {
        for(String vitsi : this.vitsit) {
            System.out.println(vitsi);
        }
    }
}
