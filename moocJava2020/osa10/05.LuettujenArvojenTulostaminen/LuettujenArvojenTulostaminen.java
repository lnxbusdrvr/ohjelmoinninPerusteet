/*
 *
 * Tehtävä: 05.LuettujenArvojenTulostaminen
 * ----------------------------------------
 * Kirjoita ohjelma, joka lukee käyttäjältä merkkijonoja. 
 * Lukeminen tulee lopettaa kun käyttäjä syöttää tyhjän merkkijonon. 
 * Tulosta tämän jälkeen käyttäjän syöttämät merkkijonot.
 *
 * Esimerkkitulostus
 *
 * eka
 * toka
 * kolmas
 *
 * eka
 * toka
 * kolmas
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        
        while(true) {
            String syote = lukija.nextLine();
            if(syote.equals("")) {
                break;
            }
            lista.add(syote);
        }
        
        String sanat = lista.stream()
                .reduce("", (t, bo) -> t+bo+"\n");
        System.out.println(sanat);

    }
}
