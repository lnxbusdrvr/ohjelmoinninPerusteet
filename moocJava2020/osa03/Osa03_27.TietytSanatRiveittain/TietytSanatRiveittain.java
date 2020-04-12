/*
 * Kirjoita ohjelma, joka lukee käyttäjältä merkkijonoja.
 * Mikäli syötetty merkkijono on tyhjä, ohjelma lopettaa käyttäjältä lukemisen
 * ja ohjelman suoritus päättyy.
 * Mikäli merkkijono ei ole tyhjä,
 * ohjelma pilkkoo syötetyn merkkijonon osiksi välilyöntien kohdalta
 * ja tulostaa omille riveilleen pilkotusta merkkijonosta
 * ne merkkijonot (merkkijonon osat), joissa esiintyy merkkijono av.
 
 * Esimerkkitulostus:
 * 
 * java on ohjelmointikieli
 * java
 * avaa ovi!
 * avaa
 * 
 * Esimerkkitulostus:
 * 
 * aivot avaavat ovia
 * avaavat
 * tavat sinua kaunistavat
 * tavat
 * kaunistavat
 * was it a cat i saw
 */


import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        String syote = lukija.nextLine();
                                   
        while(true) {
            String[] palat = syote.split(" ");
                       
            for(String i : palat) {
                if(i.contains("av")) {
                    System.out.println(i);
                }
            }
            if(syote.isEmpty()) {
                    break;
                }
            syote = lukija.nextLine();
        }
    }
}
 
 
