

/**
 *
 * @author vadenn
 */
public class MuistavaTuotevarasto extends Tuotevarasto {
    
    private Muutoshistoria muutoshistoria;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        // Kutsu Varasto-luokasta
        super.lisaaVarastoon(alkuSaldo);
        this.muutoshistoria = new Muutoshistoria();
        this.muutoshistoria.lisaa(alkuSaldo);
    }
    
    public String historia() {
        // palauttaa tuotehistorian tyyliin [0.0, 119.2, 21.2]. Käytä 
        // Muutoshistoria-olion merkkiesitystä sellaisenaan.
        return this.muutoshistoria.toString();
    }
    
    @Override
    public void lisaaVarastoon(double maara) {
        // toimii kuin Varasto-luokan metodi, 
        // mutta muuttunut tilanne kirjataan 
        // historiaan.Huom: 
        // historiaan tulee kirjata lisäyksen jälkeinen varastosaldo, 
        // ei lisättävää määrää!
        super.lisaaVarastoon(maara);
        this.muutoshistoria.lisaa(super.getSaldo());
    }
    
    @Override
    public double otaVarastosta(double maara) {
        // toimii kuin Varasto-luokan metodi, mutta muuttunut tilanne 
        // kirjataan historiaan. Huom: historiaan tulee kirjata poiston 
        // jälkeine varastosaldo, ei poistettavaa määrää!
        if(maara > super.getSaldo()) {
            return super.getSaldo();
        }
        super.otaVarastosta(maara);
        this.muutoshistoria.lisaa(super.getSaldo());
        return super.getSaldo();
    }
    
    public void tulostaAnalyysi() {
        // joka tulostaa tuotteeseen 
        // liittyviä historiatietoja esimerkin esittämään tapaan.
        System.out.println("Tuote: "+super.getNimi());
        System.out.println("Historia: "+this.historia());
        System.out.println("Suurin tuotemäärä: "+this.muutoshistoria.maxArvo());
        System.out.println("Pienin tuotemäärä: "+this.muutoshistoria.minArvo());
        System.out.println("Keskiarvo: "+this.muutoshistoria.keskiarvo());
        
    }
    
}
