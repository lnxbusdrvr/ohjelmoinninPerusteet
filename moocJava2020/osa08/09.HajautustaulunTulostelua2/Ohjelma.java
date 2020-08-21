
import java.util.HashMap;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        HashMap<String, Kirja> taulu = new HashMap<>();
        taulu.put("tunteet", new Kirja("Järki ja tunteet", 1811, "..."));
        taulu.put("luulot", new Kirja("Ylpeys ja ennakkoluulo", 1813, "...."));

        tulostaArvot(taulu);
        System.out.println("---");
        tulostaArvoJosNimessa(taulu, "ennakko");
    }
    
    public static void tulostaArvot(HashMap<String, Kirja> hajautustaulu) {
        // joka tulostaa parametrina annetun hajautustaulun arvot
        // niiden toString-metodia käyttäen.
        for(Kirja haja : hajautustaulu.values()) {
            System.out.println(haja);
        }
        
    }
    
    public static void tulostaArvoJosNimessa(HashMap<String, Kirja> hajautustaulu, String merkkijono) {
        // joka tulostaa parametrina annetun hajautustaulun arvoista ne, joiden nimessä on parametrina 
        // annettu merkkijono. Nimen saa selville kirjan metodilla getNimi.
        
        //Ei vaikutusta:
        //merkkijono = siistiMerkkijono(merkkijono);
        
        for(Kirja josHaja : hajautustaulu.values()) {
            if(josHaja.getNimi().contains(merkkijono)) {
                System.out.println(josHaja);
            }
        }
        
    }
    
    public static String siistiMerkkijono(String merkkijono) {
        if (merkkijono == null) {
            return "";
        }

        merkkijono = merkkijono.toLowerCase();
        return merkkijono.trim();
    }

}
