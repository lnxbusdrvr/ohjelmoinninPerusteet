
//import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;

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
            System.out.println("Vitsi vähissä");
            return "Vitsit vähissä.";
        }else{
            // ei toimi return, edes malliesimerkissa
            // Siksi tämä purkkaviritys
            //int satunnainenNro = (int)(Math.random() * this.vitsit.size());
            //System.out.println(satunnainenNro);
            Random arpa = new Random();
            int satunnainenNro = arpa.nextInt(this.vitsit.size());
            
            System.out.println(this.vitsit.get(satunnainenNro));
            return this.vitsit.get(satunnainenNro);
        }
    }
    
    public void tulostaVitsit() {
        for(String vitsi : this.vitsit) {
            System.out.println(vitsi);
        }
    }
}
