/*
 * Kirjoita ohjelma, joka lukee käyttäjältä merkkijonoja.
 * Mikäli syötetty merkkijono on tyhjä, ohjelma ei jatka lukemista
 * ja ohjelman suoritus päättyy. Mikäli merkkijono ei ole tyhjä,
 * ohjelma pilkkoo syötetyn merkkijonon osiksi välilyöntien kohdalta
 * ja tulostaa kunkin pilkotun merkkijonon ensimmäisen osan.
 *
 * Esimerkkitulostus:
 *
 * yksi kaksi kolme neljä
 * yksi
 * viestin purku tässä selvä
 * viestin
 */
 
import java.util.Scanner;

public class EnsimmaisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        String syote = lukija.nextLine();
        
        while(!syote.isEmpty()) {
            String[] paloita = syote.split(" ");
            
            System.out.println(paloita[0]);
            syote = lukija.nextLine();
        }
    }
}
