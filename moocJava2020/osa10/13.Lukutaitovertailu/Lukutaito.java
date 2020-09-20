

/**
 *
 * @author lnxbusdrvr
 */
public class Lukutaito {
    
    // teema, ikäryhmä, sukupuoli, maa, vuosi, lukutaitoprosentti
    private String maa;
    private int vuosi;    
    private String sukupuoli;
    private double prosentti;

    // Haluamme nämä: maa[3], vuosi[4], sukupuoli[2], prosentti[5]
    public Lukutaito(String maa, int vuosi, String sukupuoli, double prosentti) {
        this.maa = maa;
        this.vuosi = vuosi;
        this.sukupuoli = sukupuoli;
        this.prosentti = prosentti;        
    }
    
    public String getMaa() {
        return this.maa;
    }
    
    public int getVuosi() {
        return this.vuosi;
    }
    
    public String getSukupuoli() {
        return this.sukupuoli;
    }
    
    public double getProsentti() {
        return this.prosentti;
    }
    
    @Override
    public String toString() {
        return this.getMaa()+" ("+this.getVuosi()+"), "
                +this.getSukupuoli()+", "+this.getProsentti();
    }
    
}
