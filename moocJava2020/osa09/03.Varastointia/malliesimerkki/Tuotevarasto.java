 
public class Tuotevarasto extends Varasto {
 
    private String nimi;
 
    public Tuotevarasto(String nimi, double tilavuus) {
        super(tilavuus);
        this.nimi = nimi;
    }
 
    public String getNimi() {
        return this.nimi;
    }
 
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
 
    @Override
    public String toString() {
        return this.nimi + ": " + super.toString();
    }
 
}
 
