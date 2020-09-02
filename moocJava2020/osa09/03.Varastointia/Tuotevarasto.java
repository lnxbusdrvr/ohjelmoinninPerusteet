

/**
 *
 * @author vadenn
 */
public class Tuotevarasto extends Varasto {
    
    private String tuotenimi;
    
    public Tuotevarasto(String tuotenimi, double tilavuus) {
        // Luo tyhjän tuotevaraston. 
        // Tuotteen nimi ja varaston 
        // tilavuus annetaan parametrina.
        super(tilavuus = tilavuus);
        this.tuotenimi = tuotenimi;        
    }
    
    public String getNimi() {
        // Palauttaa arvonaan tuotteen nimen.
        return this.tuotenimi;
    }
    
}
