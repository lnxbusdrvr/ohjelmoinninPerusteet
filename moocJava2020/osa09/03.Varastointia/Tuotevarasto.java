

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
    
    public void setNimi(String uusiNimi) {
        // asettaa tuotteelle uuden nimen.
        this.tuotenimi = uusiNimi;
    }
    
    public String toString() {
        // palauttaa olion tilan merkkijonoesityksenä 
        // tyyl2iin Juice: saldo = 64.5, tilaa 123.5
        return this.getNimi()+": "+super.toString();
    }
    
}
