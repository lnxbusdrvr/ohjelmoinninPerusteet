/*
 * Kirjoita ohjelma, joka lukee käyttäjältä merkkijonoja.
 * Mikäli syötetty merkkijono on tyhjä, ohjelma lopettaa käyttäjältä lukemisen
 * ja ohjelman suoritus päättyy.
 * Mikäli merkkijono ei ole tyhjä,
 * ohjelma pilkkoo syötetyn merkkijonon osiksi välilyöntien kohdalta
 * ja tulostaa pilkotun merkkijonon osat omille riveilleen.
 *
 * Esimerkkitulostus:
 *
 * olipa kerran
 * olipa
 * kerran
 * pieni ohjelma joka
 * pieni
 * ohjelma
 * joka
 * loppui
 * loppui
 */
 

import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while(true) {
            String syote = lukija.nextLine();
        
            String[] paloita = syote.split(" ");
            
            if(0 == paloita.length -1) {
                System.out.println(paloita[0]);
                break;
            }
            for(String i : paloita) {
                System.out.println(i);
            }
        }
    }
}
