
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // alla sama esimerkkiohjelma mikä 9.1:n tehtävämääritelmästä löytyy
        /*
        Rekisterinumero rek1 = new Rekisterinumero("FI", "ABC-123");
        Rekisterinumero rek2 = new Rekisterinumero("FI", "UXE-465");
        Rekisterinumero rek3 = new Rekisterinumero("D", "B WQ-431");

        ArrayList<Rekisterinumero> suomalaiset = new ArrayList<>();
        suomalaiset.add(rek1);
        suomalaiset.add(rek2);

        Rekisterinumero uusi = new Rekisterinumero("FI", "ABC-123");
        if (!suomalaiset.contains(uusi)) {
            suomalaiset.add(uusi);
        }
        System.out.println("suomalaiset: " + suomalaiset);
        // jos equals-metodia ei ole ylikirjoitettu, menee sama rekisterinumero toistamiseen listalle

        HashMap<Rekisterinumero, String> omistajat = new HashMap<>();
        omistajat.put(rek1, "Arto");
        omistajat.put(rek3, "Jürgen");

        System.out.println("omistajat:");
        System.out.println(omistajat.get(new Rekisterinumero("FI", "ABC-123")));
        System.out.println(omistajat.get(new Rekisterinumero("D", "B WQ-431")));
        // jos hashCode ei ole ylikirjoitettu, eivät omistajat löydy
*/
        // Osa 2 lisaa
        Ajoneuvorekisteri ar = new Ajoneuvorekisteri(); 
        ar.lisaa( new Rekisterinumero("FI", "AAA-111"), "Arto");
        ar.lisaa( new Rekisterinumero("FI", "AAA-111"), "Arto");
        
        // Osa 2 hae
        ar.hae(new Rekisterinumero("FI", "AAA-111"));
        
        // Osa 2 poista
        ar.poista( new Rekisterinumero("FI", "AAA-111"));
    }
}
