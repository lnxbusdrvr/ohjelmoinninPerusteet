
// Haetaan nämä kirjastot testaamista varten
import static org.junit.Assert.*;
import org.junit.Test; // Huom ei static:

public class TehtavienhallintaTest {
    
    // Tässä metodia käytetään tehtävälistan koon
    // tarkastamiseen uuden tehtävälistan luomisen 
    // yhteydessä: uuden listan tulee olla tyhjä.
    @Test
    public void TehtavienhallintaTest() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        // ensimmäinen(nolla) on odotettu arvo ja 
        // toinen on ohjelman palauttama arvo. .
        assertEquals(0, hallinta.tehtavalista().size());
    }
    
    // Testissä määritellään luokalle Tehtavienhallinta metodi lisaa, 
    // joka lisää tehtävälistalle uuden tehtävän. 
    // Tehtävän lisäämisen onnistuminen tarkastetaan tehtavalista-metodin 
    // koon kasvamisen kautta.
    @Test
    public void tehtavanLisaaminenKasvattaaListanKokoaYhdella() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        // Täydennetään testejä siten, että ne vaativat, 
        // että lisätyn tehtävän tulee olla listalla. 
        hallinta.lisaa("Kirjoita testi");
        assertEquals(1, hallinta.tehtavalista().size());
    }
    
    @Test
    public void lisattyTehtavaLoytyyTehtavalistalta() {
        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
        // assertTrue vaatii, että sille parametrina annettu lauseke 
        // saa lopulta arvon true.
        assertTrue(hallinta.tehtavalista().contains("Kirjoita testi"));
    }
    
}

