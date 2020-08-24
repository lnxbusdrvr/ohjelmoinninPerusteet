
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author lnxbusdrvr
 */
public class UseanKaannoksenSanakirja {
    
    private HashMap<String, ArrayList<String>> sanakirja;
    
    public UseanKaannoksenSanakirja() {
        this.sanakirja = new HashMap<>();
    }
    
    public void lisaa(String sana, String kaannos) {
        // lisää käännöksen sanalle säilyttäen vanhat käännökset
        // Alustetaan avaimelle lista, ellei ole jo alustettu
        this.sanakirja.putIfAbsent(sana, new ArrayList<>());
        
        //Lisätään listaan
        this.sanakirja.get(sana).add(kaannos);
    }
        
    
    public ArrayList<String> kaanna(String sana) {
        // palauttaa listan, joka sisältää sanojen käännökset. 
        // Jos sanalle ei ole yhtäkään käännöstä, 
        // metodin tulee palauttaa tyhjä lista.
        if(this.sanakirja.containsKey(sana)) {
            return this.sanakirja.get(sana);
        }else{
            return new ArrayList<>();
        }
    }
  
    
    public void poista(String sana) {
        // poistaa sanan ja sen kaikki käännökset sanakirjasta.
        this.sanakirja.remove(sana);
    }
    
}
