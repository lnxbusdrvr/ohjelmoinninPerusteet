

/**
 *
 * @author lnxbusdrvr
 */
public class Sailio {
    
    private int sisalto = 0;
    
    public Sailio() {
        
    }
    
    public int sisalto() {
        return this.sisalto;
    }
    
    public void lisaa(int maara) {
        if(maara > 0) {
            this.sisalto += maara;
            if(this.sisalto > 0) {
                
            }
            if(this.sisalto > 100) {
                this.sisalto = 100;
            }
        }
    }
         
    public void poista(int maara) {
        if(maara > 0 && maara <= 100) {
            this.sisalto -= maara;
            if(this.sisalto < 0) {
                this.sisalto = 0;
            }
            if(maara < 0) {
                this.sisalto = 0;
            }
        }
    }
    
    public String toString() {
        return this.sisalto+"/100";
    }
    
}