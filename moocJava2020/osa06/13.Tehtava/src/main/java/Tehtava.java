
public class Tehtava {
    
    private String nimi;
    private boolean tehty;
    
    public Tehtava(String nimi) {
        this.nimi = nimi;
        this.tehty = false;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public boolean setTehty(boolean tehty) {
        return tehty;
    }
    
    public boolean onTehty() {
        return tehty;
    }
}
