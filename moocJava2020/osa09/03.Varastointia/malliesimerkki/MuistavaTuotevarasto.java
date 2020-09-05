 
public class MuistavaTuotevarasto extends Tuotevarasto {
 
    private Muutoshistoria historia;
 
    public MuistavaTuotevarasto(String nimi, double tilavuus, double alkusaldo) {
        super(nimi, tilavuus);
        historia = new Muutoshistoria();
        lisaaVarastoon(alkusaldo);
    }
 
    public String historia() {
        return historia.toString();
    }
 
    public void tulostaAnalyysi() {
        System.out.println("Tuote: " + getNimi());
        System.out.println("Historia: " + historia());
        System.out.println("Suurin tuotemäärä: " + historia.maxArvo());
        System.out.println("Pienin tuotemäärä: " + historia.minArvo());
        System.out.println("Keskiarvo: " + historia.keskiarvo());
    }
 
    @Override
    public void lisaaVarastoon(double maara) {
        super.lisaaVarastoon(maara);
        historia.lisaa(getSaldo());
    }
 
    @Override
    public double otaVarastosta(double maara) {
        double saatiin = super.otaVarastosta(maara);
        historia.lisaa(getSaldo());
        return saatiin;
    }
}
 
