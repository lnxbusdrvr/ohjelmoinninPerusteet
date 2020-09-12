/*
 *
 * Tehtävä: 09.SetMetodinParametrina
 * ---------------------------------
 * Toteuta pääohjelmaluokkaan luokkametodi palautaKoko, joka saa 
 * parametrina Set-olion ja palauttaa sen koon kokonaislukuna.
 *
 * Metodin tulee toimia esimerkiksi seuraavasti:
 *
 * Set<String> nimet = new HashSet<>();
 * nimet.add("eka");
 * nimet.add("eka");
 * nimet.add("toka");
 * nimet.add("toka");
 * nimet.add("toka");
 *
 * Esimerkkitulostus:
 *
 * 2
 *
 */

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia

    }

    // toteuta tänne metodi palautaKoko, joka palauttaa parametrina 
    // saamansa set-olion alkioiden lukumäärän
    public static int palautaKoko(Set set) {
        return set.size();
    }

}
