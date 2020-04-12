/*
 * Kirjoita ohjelma, joka lukee käyttäjältä merkkijonoja.
 * Mikäli syötetty merkkijono on tyhjä, ohjelma ei jatka lukemista
 * ja ohjelman suoritus päättyy. Mikäli merkkijono ei ole tyhjä,
 * ohjelma pilkkoo syötetyn merkkijonon osiksi välilyöntien kohdalta
 * ja tulostaa kunkin pilkotun merkkijonon viimeisen osan.
 *
 * Esimerkkitulostus:
 * 
 * yksi kaksi kolme neljä
 * neljä
 * viestin purku tässä selvä
 * selvä
 *
 */
 
 
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        String syote = lukija.nextLine();
        
        while(!syote.isEmpty()) {
            String[] paloita = syote.split(" ");
            
            int viimeinen = paloita.length - 1;
            System.out.println(paloita[viimeinen]);
            
            syote = lukija.nextLine();
        }
    }
}
