/*
 * Tee ohjelma, joka tunnistaa seuraavat käyttäjät:
 * tunnus	salasana
 * aleksi	tappara
 * elina	kissa
 *
 * Ohjelma näyttää käyttäjälle henkilökohtaisen viestin tai ilmoittaa, jos tunnus tai salasana on väärin.
 *
 * Esimerkkitulostus:
 *
 * Anna tunnus: aleksi
 * Anna salasana: tappara
 * Olet kirjautunut järjestelmään
 * Esimerkkitulostus
 
 * Anna tunnus: elina
 * Anna salasana: kissa
 * Olet kirjautunut järjestelmään
 * Esimerkkitulostus
 *
 * Anna tunnus: aleksi
 * Anna salasana: jokerit
 * Virheellinen tunnus tai salasana!
 */

import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.print("Anna salasana: ");
        String salasana = lukija.nextLine();
        
        /*
         * aleksi	tappara
         * elina	kissa
         */
        String tunnusYks = "aleksi";
        String tunnusKaks = "elina";
        String salasanaYks = "tappara";
        String salasanaKaks = "kissa";
        
        if(tunnus.equals(tunnusYks) && salasana.equals(salasanaYks) 
        || tunnus.equals(tunnusKaks) && salasana.equals(salasanaKaks)) {
            System.out.println("Olet kirjautunut järjestelmään");
        }else{
            System.out.println("Virheellinen tunnus tai salasana!");
        }
    }
} 
