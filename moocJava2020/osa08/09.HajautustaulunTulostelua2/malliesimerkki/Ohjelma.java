 
import java.util.HashMap;
 
public class Ohjelma {
 
    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
    }
 
    public static void tulostaArvot(HashMap<String, Kirja> hajautustaulu) {
        for (Kirja arvo : hajautustaulu.values()) {
            System.out.println(arvo);
        }
    }
 
    public static void tulostaArvoJosNimessa(HashMap<String, Kirja> hajautustaulu, String merkkijono) {
        for (Kirja arvo : hajautustaulu.values()) {
            if (arvo.getNimi().contains(merkkijono)) {
                System.out.println(arvo);
            }
        }
    }
}
 
