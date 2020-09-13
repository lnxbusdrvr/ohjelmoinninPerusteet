
import java.util.ArrayList;

/**
 *
 * @author lnxbusdrvr
 */
public class Lauma implements Siirrettava {
    
    private ArrayList<Siirrettava> lauma;

    public Lauma() {
        this.lauma = new ArrayList<>();
    }
    
    @Override
    public void siirra(int dx, int dy) {
        // Siirtää oliota parametrina saatujen 
        // arvojen verran. Muuttuja dx sisältää 
        // muutoksen koordinaattiin x, muuttuja 
        // dy sisältää muutoksen koordinaattiin y. 
        // Esimerkiksi jos muuttujan dx arvo on 5, 
        // tulee oliomuuttujan x arvoa kasvattaa viidellä
        for(Siirrettava s : this.lauma) {
            s.siirra(dx, dy);
        }
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava) {
        // Lisää laumaan uuden Siirrettava-rajapinnan 
        // toteuttavan olion
        this.lauma.add(siirrettava);
    }
    
    @Override
    public String toString() {
        // Luo ja palauttaa oliosta 
        // merkkijonoesityksen. 
        // Eliön merkkijonoesityksen tulee olla 
        // seuraavanlainen "x: 3; y: 6". 
        // Huomaa että koordinaatit on 
        // erotettu puolipisteellä (;)
        String apu = "";
        for(Siirrettava s : this.lauma) {
            apu += s+"\n";
        }
        return apu;
    }
    
}
