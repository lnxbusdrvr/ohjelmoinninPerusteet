 
public class Ostos {
 
    private String tuote;
    private int kpl;
    private int yksikkohinta;
 
    public Ostos(String tuote, int kpl, int yksikkohinta) {
        this.tuote = tuote;
        this.kpl = kpl;
        this.yksikkohinta = yksikkohinta;
    }
 
    public int hinta() {
        return this.kpl * this.yksikkohinta;
    }
 
    public void kasvataMaaraa() {
        this.kpl = this.kpl + 1;
    }
 
    @Override
    public String toString() {
        return this.tuote + ": " + this.kpl;
    }
}
 
