/*
 * Kirjoita ohjelma, joka tulostaa tiedoston nimeltä "data.txt" sisällön siten,
 * että kukin tiedoston rivi tulee tulostuksessa omalle rivilleen.
 *
 * Mikäli tiedoston sisältö on seuraava:
 *
 * Esimerkkidata:
 *
 * Olipa kerran
 * maailma
 *
 */
 
 

import java.nio.file.Paths;
import java.util.Scanner;

public class TiedostonTulostaminen {

    public static void main(String[] args) {
        try{
            Scanner tiedostoInput = new Scanner(Paths.get("data.txt"));
            
            // Luetaan tiedosto. Lopetetaan, kun tiedoston rivit loppuu
            while(tiedostoInput.hasNextLine()) {
                // Rivi kerrallaan
                String rivi = tiedostoInput.nextLine();
                
                System.out.println(rivi);
            }
        // Mikäli syötevirhe
        }catch(Exception e) {
            System.out.println("Virhe"+e.getMessage());
        }
    }
}
