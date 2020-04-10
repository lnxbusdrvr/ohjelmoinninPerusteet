/* Tee ohjelma, joka pyytää käyttäjää kirjoittamaan merkkijonon. Jos käyttäjä kirjoittaa merkkijonon "totta", tulostetaan merkkijono "Oikein meni!", muulloin tulostetaan merkkijono "Koitappa uudelleen!".
 * Esimerkkitulostus
 *
 * Kirjoita merkkijono: totta
 * Oikein meni!
 * Esimerkkitulostus
 *
 * Kirjoita merkkijono: tottapa
 * Koitappa uudelleen!
 */

import java.util.Scanner;

public class OnkoTotta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Kirjoita merkkijono: ");
        String kysymys = lukija.nextLine();
        
        if(kysymys.equals("totta")) {
            System.out.println("Oikein meni!");
        }else{
            System.out.println("Koitappa uudelleen!");
        }

    }
}
 
