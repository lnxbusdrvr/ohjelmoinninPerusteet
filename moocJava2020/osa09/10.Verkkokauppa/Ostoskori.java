
import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author lnxbusdrvr
 */
public class Ostoskori {
    
    private Map<String, Ostos> ostoskori;

    public Ostoskori() {
        this.ostoskori = new HashMap<>();
    }
    
    public void lisaa(String tuote, int hinta) {
        // lisää ostoskoriin ostoksen joka vastaa 
        // parametrina olevaa tuotetta ja jolla on 
        // parametrina annettu hinta.
        //this.ostoskori.put(tuote, new Ostos(tuote, 1, hinta));
        
        // Osa 7: Täydennetään siten, että jos korissa on jo tuote 
        // joka sinne lisätään, ei koriin luoda uutta Ostos-olioa 
        // vaan päivitetään jo korissa olevaa tuotetta vastaavaa 
        // ostosolioa kutsumalla sen metodia kasvataMaaraa().
        if(this.ostoskori.containsKey(tuote)) {
            this.ostoskori.get(tuote).kasvataMaaraa();
        }else{
            this.ostoskori.put(tuote, new Ostos(tuote, 1, hinta));

        }
    }
    
    public int hinta() {
        // palauttaa ostoskorin kokonaishinnan
        int summa = 0;
        for(Ostos tuote : this.ostoskori.values()) {
            summa += tuote.hinta();
        }
        return summa;
    }
    
    public void tulosta() {
        // tulostaa korin sisältämät Ostos-oliot
        for(Ostos tuote : this.ostoskori.values()) {
            System.out.println(tuote);
        }
    }
    
    
}
