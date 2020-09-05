

/**
 *
 * @author vadenn
 */
public class MuistavaTuotevarasto extends Tuotevarasto {
    
    private Muutoshistoria muutoshistoria;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        this.muutoshistoria = new Muutoshistoria();
        this.muutoshistoria.lisaa(alkuSaldo);
        // Kutsu Varasto-luokasta
        super.lisaaVarastoon(alkuSaldo);
    }
    
    public String historia() {
        // palauttaa tuotehistorian tyyliin [0.0, 119.2, 21.2]. Käytä 
        // Muutoshistoria-olion merkkiesitystä sellaisenaan.
        return this.muutoshistoria.toString();
    }
    
}
