/*
 * Tehtäväpohjassa on valmiina televisio-ohjelmaa kuvaava luokka TelevisioOhjelma.
 * Luokalla on oliomuuttujat nimi ja pituus, konstruktori, ja muutamia metodeja.
 *
 * Toteuta ohjelma, joka ensin lukee käyttäjältä televisio-ohjelmia.
 * Kun käyttäjä syöttää tyhjän ohjelman nimen,
 * televisio-ohjelmien lukeminen lopetetaan.
 *
 * Tämän jälkeen käyttäjältä kysytään ohjelman maksimipituutta.
 * Kun käyttäjä on syöttänyt ohjelman maksimipituuden, tulostetaan kaikki ne ohjelmat,
 * joiden pituus on pienempi tai yhtäsuuri kuin haluttu maksimipituus.
 * Esimerkkitulostus:
 *
 * Nimi: Salatut elämät
 * Pituus: 30
 * Nimi: Miehen puolikkaat
 * Pituus: 30
 * Nimi: Remppa vai muutto
 * Pituus: 60
 * Nimi: House
 * Pituus: 60
 *
 * Ohjelman maksimipituus? 30
 * Salatut elämät, 30 minuuttia
 * Miehen puolikkaat, 30 minuuttia
 *
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while(true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            
            // Mikäli nimi tyhjää, lopeta
            if(nimi.isEmpty()) {
                break;
            }
            System.out.print("Nimi: ");
            int pituus = Integer.valueOf(lukija.nextLine());
            
            ohjelmat.add(new TelevisioOhjelma(nimi, pituus));
        }
        System.out.print("Ohjelman maksimipituus? ");
        int maxPituus = Integer.valueOf(lukija.nextLine());
        
        for( TelevisioOhjelma tele : ohjelmat ) {
            if(tele.getPituus() == maxPituus) {
                System.out.println(tele);                
            }
        }
    }
}
