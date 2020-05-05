
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
    
    // Osa 2 5min 17sek
    public Henkilo lyhin() {
        if(this.henkilot.isEmpty()) {
            return null;
        }
        Henkilo lyhin = this.henkilot.get(0);
        
        for(Henkilo lista : this.henkilot) {
            if(lyhin.getPituus() > lista.getPituus()) {
                lyhin = lista;
            }
        }
        return lyhin;
    }
    
    // Osa 3 5min 26sek
    public Henkilo ota() {
        try{
            if(this.henkilot.isEmpty()) {
            return null;
            }else{
                return this.lyhin();
            }
        }finally{
            this.henkilot.remove(this.lyhin());
        }        
    }
}
