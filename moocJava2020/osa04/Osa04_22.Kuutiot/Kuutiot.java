/*
 * Kirjoita ohjelma,
 * joka lukee merkkijonoja käyttäjältä kunnes käyttäjä syöttää merkkijonon "loppu".
 * Mikäli syöte ei ole "loppu",
 * ohjelman tulee käsitellä syöte lukuna
 * ja tulostaa syötetyn luvun kuutio (eli luku * luku * luku).
 * Alla on muutamia tulostusesimerkkejä
 *
 * Esimerkkitulostus:
 *
 * 3
 * 27
 * -1
 * -1
 * 11
 * 1331
 * loppu
 *
 * Esimerkkitulostus:
 * loppu
 *
 */


import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while(true) {
            String lue = lukija.nextLine();
            
            if(lue.equals("loppu")) {
                break;
            }
            
            int luku = Integer.valueOf(lue);
            int kuutio = luku * luku * luku;
            
            System.out.println(kuutio);
        }

    }
}
