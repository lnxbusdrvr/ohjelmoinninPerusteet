/*
 * Osa 1: Henkilöiden punnitseminen
 * --------------------------------
 *
 * Kasvatuslaitoksen luokkarungossa on valmiina runko metodille punnitse:
 * 
 * Metodi saa parametrina henkilön ja metodin on tarkoitus palauttaa 
 * kutsujalleen parametrina olevan henkilön paino. 
 * Paino selviää kutsumalla parametrina olevan 
 * henkilön henkilo sopivaa metodia. Eli täydennä metodin koodi!
 *
 * Osa 2: Syöttäminen
 * ------------------
 *
 * Tee kasvatuslaitokselle metodi public void syota(Henkilo henkilo) 
 * joka kasvattaa parametrina olevan henkilön painoa yhdellä.
 *
 * Osa 3: Punnitusten laskeminen
 * -----------------------------
 *
 * Tee kasvatuslaitokselle metodi public int punnitukset() 
 * joka kertoo kuinka monta punnitusta kasvatuslaitos 
 * on ylipäätään tehnyt. 
 * Huom! Tarvitset uuden oliomuuttujan 
 * punnitusten lukumäärän laskemiseen!
 *
 */
 
public class Kasvatuslaitos {
    private int punnitukset = 0;


    public int punnitse(Henkilo henkilo) {
        // palautetaan parametrina annetun henkilön paino
        this.punnitukset++;
        return henkilo.getPaino();
    }
    
    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino()+1);
    }
    
    public int punnitukset() {
        return this.punnitukset;
    }

}
