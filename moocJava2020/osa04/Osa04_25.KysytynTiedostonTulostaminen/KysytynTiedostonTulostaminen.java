/*
 * Kirjoita ohjelma, joka kysyy käyttäjältä merkkijonoa
 * ja tulostaa tämän jälkeen käyttäjän syöttämän nimisen tiedoston sisällön.
 * Voit olettaa, että käyttäjä syöttää tiedoston,
 * joka löytyy ohjelmasta.
 *
 * Tehtäväpohjassa on mukana tiedostot
 * "data.txt"
 * "tieto.txt"
 *
 * joita voit käyttää ohjelman toimintaa testatessasi.
 * Alla on ohjelman tulostus tilanteessa
 * kun käyttäjä syöttää tekstin "tieto.txt".
 * Tulostettava sisältö tulee tiedostosta
 * "tieto.txt"
 *
 * Ohjelman tulee luonnollisesti toimia
 * myös muilla tiedoston nimillä,
 * olettaen että tiedosto löytyy.
 *
 * Esimerkkitulostus:
 *
 * Minkä tiedoston sisältö tulostetaan?
 * tieto.txt
 * No option for duality
 * The old is where we come
 * Clockspeed is fast, but we'll survive
 * The new will overcome
 * We are challengers, not followers
 * We take the ball to build
 * Easy safe services
 * Are here to stay
 *
 * Value for society
 * Value for life
 * For you and me
 * Tieto is here allright!
 *
 */
 
import java.nio.file.Paths;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        try{
            
            System.out.println("Minkä tiedoston sisältö tulostetaan?");
            String lue = lukija.nextLine();
                        
            Scanner tiedostonlukija = new Scanner(Paths.get(lue));
            // Lopetetaan silmukka, kunnes ei ole enää rivejä
            while(tiedostonlukija.hasNextLine()) {
                // Luetaan rivit
                String rivi = tiedostonlukija.nextLine();
                // Tulostetaan rivit
                System.out.println(rivi);
            }            
                        
        }catch(Exception e) {
            System.out.println("Virhe: "+e.getMessage());
        }
    }
}
