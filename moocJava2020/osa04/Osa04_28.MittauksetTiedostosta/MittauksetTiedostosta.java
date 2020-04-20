/*
 * Toteuta ohjelma,
 * joka lukee käyttäjältä tiedoston nimen sekä hyväksyttävien lukujen
 * ala- ja ylärajan.
 * Tämän jälkeen ohjelma lukee tiedoston sisältämät luvut 
 * (jokainen luku on omalla rivillään)
 * ja ottaa huomioon vain ne luvut,
 * jotka ovat annetulla lukuvälillä.
 * Lopulta ohjelma tulostaa annetulla lukuvälillä olleiden lukujen lukumäärän.
 *
 * Voit muuntaa tiedostosta luetun merkkijonomuotoisen
 * kokonaisluvun kokonaisluvuksi
 * komennolla Integer.valueOf
 * (täysin samalla tavalla kuin käyttäjän syöttämää tietoa käsiteltäessä).
 *
 * Esimerkkitulostus:
 *
 * Tiedosto? mittaukset-1.txt
 * Alaraja? 15
 * Yläraja? 20
 * Lukuja: 2
 *
 * Esimerkkitulostus:
 *
 * Tiedosto? mittaukset-1.txt
 * Alaraja? 0
 * Yläraja? 300
 * Lukuja: 4
 *
 */
 
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        
        try{
            Scanner tstoLukija = new Scanner(Paths.get(tiedosto));
            
            ArrayList<Integer> lista = new ArrayList<>();
            
            // Lue tiedosto, kunnes rivit loppuu
            while(tstoLukija.hasNextLine()) {
                int rivi = Integer.valueOf(tstoLukija.nextLine());
                // listätään tiedoston syöte listaan
                lista.add(rivi);
            }
            int lkm = 0;
            for(int luvut : lista) {
                if(luvut >= alaraja && luvut <= ylaraja) {
                    lkm++;
                }
            }
            System.out.println("Lukuja: "+lkm);
            
        }catch(Exception e) {
            System.out.println("Virhe: "+e.getMessage());
        }
    }
}
