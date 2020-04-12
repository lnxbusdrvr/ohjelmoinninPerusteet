/*
 * Kirjoita ohjelma, joka lukee käyttäjältä henkilötietoja.
 * Henkilötiedot sisältävät etunimen ja iän pilkulla eroteltuna.
 * Tietojen lukemista jatketaan kunnes käyttäjä syöttää tyhjän merkkijonon.
 *
 * Kun lukeminen lopetetaan, ohjelma tulostaa vanhimman henkilön nimen.
 * Voit olettaa, että vanhimman henkilön ikä on yksikäsitteinen.
 *
 * Esimerkkitulostus
 *
 * leevi,2
 * anton,2
 * lilja,1
 * venla,5
 * gabriel,10
 *
 * Vanhimman nimi: gabriel
 *
 */
 
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // Lainaus edelisestä tehtävästä
        int suurin = 0;
        String vanhinNimi = null;
                
        while(true) {
            String syote = lukija.nextLine();
            if(syote.equals("")) {
                break;
            }
            String[] palat = syote.split(",");
            
            for(String pala : palat) {
                int palaYks = Integer.parseInt(palat[1]); // eli indexi kaksi
                String nimi = palat[0];
                if(palaYks > suurin) {
                    suurin = palaYks;
                    vanhinNimi = nimi;
                }
            }
        }
        System.out.println("Vanhimman ikä: " +vanhinNimi);
    }
}
