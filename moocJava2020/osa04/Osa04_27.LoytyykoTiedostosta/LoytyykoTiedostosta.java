/*
 * Tehtäväpohjassa tulee kaksi tekstitiedostoa:
 * nimet.txt
 * toiset-nimet.txt
 *
 * Kirjoita ohjelma, joka kysyy ensin käyttäjältä luettavan tiedoston nimeä,
 * jonka jälkeen käyttäjältä kysytään etsittävää merkkijonoa.
 *
 * Tämän jälkeen ohjelma lukee tiedoston ja etsii tiedostosta haluttua merkkijonoa.
 * Jos merkkijono löytyy,
 * ohjelman tulee tulostaa "Löytyi!".
 * Jos merkkijonoa ei löydy,
 * ohjelman tulee tulostaa "Ei löytynyt.".
 *
 * Jos tiedoston lukeminen epäonnistuu (lukeminen päätyy virhetilanteeseen),
 * ohjelman tulee tulostaa viesti "Tiedoston lukeminen epäonnistui.".
 *
 * Esimerkkitulostus:
 *
 * Minkä niminen tiedosto luetaan?
 * nimet.txt
 * Mitä etsitään?
 * Antti
 * Ei löytynyt.
 *
 * Esimerkkitulostus:
 *
 * Minkä niminen tiedosto luetaan?
 * nimet.txtMitä etsitään?
 * ada
 * Löytyi!
 *
 */
 
import java.nio.file.Paths;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();

    }
}
