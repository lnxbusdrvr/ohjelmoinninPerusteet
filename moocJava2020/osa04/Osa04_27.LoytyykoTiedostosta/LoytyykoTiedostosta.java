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
import java.util.ArrayList;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
                  
        try{
            Scanner lukija = new Scanner(System.in);
            
            // Alustetaan lista
            ArrayList<String> lista = new ArrayList<>();

            System.out.println("Minkä niminen tiedosto luetaan? ");
            String tiedosto = lukija.nextLine();

            System.out.println("Mitä etsitään?");
            String etsittava = lukija.nextLine();
            
            Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto));
            
            // Käy tiedosto läpi, kunnes rivit loppuu.
            while(tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                
                // Lisätään jokainen rivi listaan
                lista.add(rivi);
            }
            // Jos löytyy etsittävä sana
            if(lista.contains(etsittava)) {
                System.out.println("Löytyi!");
            }
            // Jos ei löydy etsittävää sana
            if(!lista.contains(etsittava)) {
                System.out.println("Ei löytynyt.");
            }
        }catch(Exception e) {
            System.out.println("Tiedoston "+e.getMessage()+" lukeminen epäonnistui.");
        }
    }
}
