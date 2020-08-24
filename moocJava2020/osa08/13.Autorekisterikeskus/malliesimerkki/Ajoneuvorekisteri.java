 
import java.util.ArrayList;
import java.util.HashMap;
 
public class Ajoneuvorekisteri {
 
    private HashMap<Rekisterinumero, String> omistajat;
 
    public Ajoneuvorekisteri() {
        omistajat = new HashMap<>();
    }
 
    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if (omistajat.containsKey(rekkari)) {
            return false;
        }
 
        omistajat.put(rekkari, omistaja);
 
        return true;
    }
 
    public String hae(Rekisterinumero rekkari) {
        return omistajat.get(rekkari);
    }
 
    public boolean poista(Rekisterinumero rekkari) {
        if (!omistajat.containsKey(rekkari)) {
            return false;
        }
 
        omistajat.remove(rekkari);
 
        return true;
    }
 
    public void tulostaRekisterinumerot() {
        for (Rekisterinumero rekisterinumero : omistajat.keySet()) {
            System.out.println(rekisterinumero);
        }
    }
 
    public void tulostaOmistajat() {
        ArrayList<String> tulostetut = new ArrayList<>();
 
        for (String omistaja : omistajat.values()) {
            if (tulostetut.contains(omistaja)) {
                continue;
            }
 
            System.out.println(omistaja);
            tulostetut.add(omistaja);
        }
    }
}
 
