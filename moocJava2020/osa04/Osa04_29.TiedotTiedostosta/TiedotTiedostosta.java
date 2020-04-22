/*
 * Tässä tehtävässä käsitellään CSV-muodossa tallennettuja tiedostoja,
 * jotka sisältävät riveittän pilkuilla eroteltuna nimiä ja ikiä.
 * Tiedoston muoto on esimerkiksi seuraava:
 *
 * Esimerkkidata:
 *
 * lilja,3
 * anton,5
 * leevi,4
 * aamu,1
 *
 * Tehtävänäsi on kirjoittaa ohjelma,
 * joka ensin kysyy käyttäjältä luettavan tiedoston nimen.
 * Tämän jälkeen ohjelma tulostaa tiedoston muotoiltuna
 * seuraavalla tavalla (alla oletetaan,
 * että tulostus tulee ylläolevasta tiedostosta):
 *
 * Esimerkkitulostus:
 *
 * Mikä tiedosto luetaan?
 * data.txt
 * lilja, ikä: 3 vuotta
 * anton, ikä: 5 vuotta
 * leevi, ikä: 4 vuotta
 * aamu, ikä: 1 vuosi
 *
 */
 

import java.nio.file.Paths;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
                
        try{
            System.out.println("Mikä tiedosto luetaan?");
            String tiedosto = lukija.nextLine();
            
            Scanner tdstoLukija = new Scanner(Paths.get(tiedosto));
            
            while(tdstoLukija.hasNextLine()) {
                String rivi = tdstoLukija.nextLine();
                
                String[] taulukko = rivi.split(",");
                String nimi = taulukko[0];
                int ika = Integer.valueOf(taulukko[1]);
                
                if(ika == 1) {
                    System.out.println(nimi+", ikä: "+ika+" vuosi");
                }else{
                    System.out.println(nimi+", ikä: "+ika+" vuotta");
                }
            }
        }catch(Exception e) {
            System.out.println("Virhe: "+e.getMessage());
        }
    }
}
