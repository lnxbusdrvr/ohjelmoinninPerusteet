/*
 * Kirjoita ohjelma, joka lukee käyttäjältä henkilötietoja.
 * Henkilötiedot sisältävät etunimen ja iän pilkulla eroteltuna.
 * Tietojen lukemista jatketaan kunnes käyttäjä syöttää tyhjän merkkijonon.
 *
 * Kun lukeminen lopetetaan,
 * ohjelma tulostaa vanhimman henkilön iän.
 * Voit olettaa, käyttäjä syöttää aina vähintään yhden henkilön
 * ja että vanhimman henkilön ikä on yksikäsitteinen.
 *
 * Esimerkkitulostus:
 * 
 * leevi,2
 * anton,2
 * lilja,1
 * venla,5
 * gabriel,10
 *
 * Vanhimman ikä: 10
 *
 */
 

import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int suurin = 0;
                
        while(true) {
            String syote = lukija.nextLine();
            if(syote.equals("")) {
                break;
            }
            String[] palat = syote.split(",");
            
            // Miljoonaa tuntiä meni siihen,
            // että unohti, kun nro 2 ei tarkoita
            // toista indexin alkoita
            for(String pala : palat) {
                int palaYks = Integer.parseInt(palat[1]); // eli indexi kaksi
                if(palaYks > suurin) {
                    suurin = palaYks;
                }
            }
            
            /*
            for(int i = 0; i < palat.length; i++) {
                int pala1 = Integer.parseInt(palat[2]); // Facepalm, koska 2 ei ole 2
                if(pala1 > suurin) {
                    suurin = pala1;
                }
            }*/
            
        }
        System.out.println("Vanhimman ikä: " +suurin);
    }
}
