/*
 * Kirjoita ohjelma,
 * joka lukee käyttäjältä merkkijonoja kunnes käyttäjä syöttää merkkijonon "loppu".
 * Tämän jälkeen ohjelma tulostaa luettujen merkkijonojen lukumäärän.
 * Merkkijonoa "loppu" ei tule huomioida syötettyjen merkkijonojen lukumäärän laskemisessa.
 * Alla muutamia esimerkkejä ohjelman toiminnasta.
 *
 * Esimerkkitulostus:
 *
 * minulla
 * on
 * sellainen
 * olo
 * että
 * olen
 * kirjoittanut
 * jade
 * vun
 * väärin
 * aiemminkin
 * loppu
 * 11
 *
 */
 
 
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int lkm = 1;
        
        while(true) {
            String mjono = lukija.nextLine();
            if(mjono.equals("loppu")) {
                lkm--;
                break;
            }
            lkm++;            
        }
        System.out.println(lkm);
    }
}
