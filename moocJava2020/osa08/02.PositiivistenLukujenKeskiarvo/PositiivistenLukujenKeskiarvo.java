/*
 *
 * Kirjoita ohjelma, 
 * joka lukee käyttäjältä kokonaislukuja 
 * kunnes käyttäjä syöttää luvun 0. 
 * Tämän jälkeen ohjelma tulostaa 
 * syötteessä esiintyneiden 
 * positiivisten (eli nollaa suurempien lukujen) keskiarvon.
 * 
 * Mikäli ohjelmassa ei syötetä yhtäkään positiivista lukua, 
 * ohjelman tulee 
 * tulostaa "keskiarvon laskeminen ei ole mahdollista".
 *
 * Esimerkkitulostus:
 *
 *  3 
 *  5 
 *  1 
 * -3 
 *  0 
 *  3.0
 *
 */

import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int lkm = 0;
        int summa = 0;
        double keskiarvo = 0;
        
        while(true) {
            int luku = Integer.parseInt(lukija.nextLine());
            
            if(luku == 0) {
                break;
            }
            if(luku > 0) {
                lkm++;
                summa += luku;
            }
        }
        
        if(lkm == 0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        }else{
            // ilman double-käännöstä
            // luku pyöristyy
            keskiarvo = (double)summa / lkm;
            // Debug
            //System.out.println("Summa: "+summa);
            //System.out.println("Lkm: "+lkm);
            System.out.println(keskiarvo);
        }

    }
}
