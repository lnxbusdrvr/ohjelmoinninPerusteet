/*
 *
 * Luo main-metodissa uusi HashMap<String,String>-olio. i
 * Tallenna luomaasi olioon seuraavien henkilöiden nimet 
 * ja lempinimet niin, että nimi on avain 
 * ja lempinimi on arvo. Käytä pelkkiä pieniä kirjaimia.
 *
 * matin lempinimi on mage
 * mikaelin lempinimi on mixu 
 * arton lempinimi on arppa 
 *
 * Tämän jälkeen hae HashMapistä mikaelin lempinimi ja tulosta se. 
 *
 */

import java.util.HashMap;

public class Lempinimet {

    public static void main(String[] args) {
        // Tee tehtävänannossa pyydetyt operaatiot täällä!
        HashMap<String, String> lempinimi = new HashMap<>();
        
        lempinimi.put("matti", "mage");
        lempinimi.put("mikael", "mixu");
        lempinimi.put("arto", "arppa");
        System.out.println(lempinimi.get("matti"));
    }

}
