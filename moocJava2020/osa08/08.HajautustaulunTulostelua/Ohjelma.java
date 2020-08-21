
import java.util.HashMap;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        /*HashMap<String, String> taulu = new HashMap<>();
        taulu.put("esim.", "esimerkiksi");
        taulu.put("jne.", "ja niin edelleen");
        taulu.put("yms.", "ynnä muuta sellaista");
        
        tulostaAvaimet(taulu);
        System.out.println("---");
        tulostaAvaimetJoissa(taulu, "m");
        System.out.println("---");
        tulostaArvotJosAvaimessa(taulu, "ne");*/
        
        HashMap<String, String> hm = new HashMap<>();
        hm.put("abcd", "jkl");
        hm.put("def", "mno");
        hm.put("ghi", "pqr");
        tulostaArvotJosAvaimessa(hm, "a");
    }
    
    public static void tulostaAvaimet(HashMap<String, String> hajautustaulu) {
        // joka tulostaa parametrina annetun hajautustaulun avaimet.
        for(String haja : hajautustaulu.keySet()) {
            System.out.println(haja);
        }
    }
    
    public static void tulostaAvaimetJoissa(HashMap<String, String> hajautustaulu, String merkkijono) {
        // joka tulostaa parametrina annetun hajautustaulun avaimista ne, 
        // jotka sisältävät parametrina annetun merkkijonon.
        for(String haja : hajautustaulu.keySet()) {
            if(haja.contains(merkkijono)) {
                System.out.println(haja);
            }else{
                continue;
            }
        }
    }
    
    public static void tulostaArvotJosAvaimessa(HashMap<String, String> hajautustaulu, String merkkijono) {
        // Joka tulostaa parametrina annetun hajautustaulun ne (HUOM)arvot, 
        // joihin liittyvät avaimet sisältävät parametrina annetun merkkijonon.
        for(String josHaja : hajautustaulu.keySet()) {
            if(josHaja.contains(merkkijono)) {
                String apu = josHaja;
                System.out.println(hajautustaulu.get(apu));
            }
        }
    } 

}
