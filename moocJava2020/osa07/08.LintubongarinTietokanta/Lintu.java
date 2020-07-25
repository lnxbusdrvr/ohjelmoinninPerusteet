
import java.util.ArrayList;

/**
 *
 * @author lnxbusdrvr
 */
public class Lintu {
    
    private String lintu;
    private String kaannos;
    private int havainto;
    
    public Lintu(String lintu, String kaannos) {
        this.lintu = lintu;
        this.kaannos = kaannos;
        this.havainto = 0;
    }
    
    public void lisaaLintu(String uusiLintu) {
        this.lintu = uusiLintu;
    }
    
    public void lisaaKaannos(String kaannos) {
        this.kaannos = kaannos;
    }
    
    public void lisaaHavainto() {
        this.havainto++;
    }
      
    public String getLintu() {
        return this.lintu;
    }
    
    public String getKaannos() {
        return this.kaannos;
    }
    
    public int getHavainto() {
        return this.havainto;
    }
        
    @Override
    public String toString() {
        return getLintu()+" ("+getKaannos()+"): "+getHavainto()+" havaintoa";
    }
}
