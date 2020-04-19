/*
 * Tehtäväpohjassa on valmiina toiminnallisuus vieraslistaohjelmaan,
 * missä käyttäjän syöttämien nimien olemassaolo tarkistetaan vieraslistalta.
 * Ohjelmasta puuttuu kuitenkin toiminnallisuus vieraslistan lukemiseen.
 * Muokkaa ohjelmaa siten, että vieraslistan nimet luetaan tiedostosta.
 *
 * Esimerkkitulostus:
 *
 * Minkä niminen tiedosto luetaan?
 * vieraslista.txt
 *
 * Syötä nimiä, tyhjä rivi lopettaa.
 * Chuck Norris
 * Nimi ei ole listalla.
 * Jack Baluer
 * Nimi ei ole listalla.
 * Jack Bauer
 * Nimi on listalla.
 * Jack Bower
 * Nimi on listalla.
 *
 * Kiitos!
 *
 */
 

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class VieraslistaTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        ArrayList<String> lista = new ArrayList<>();
        
        try{
            Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto));
            while(tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                lista.add(rivi);
            }
            
            // toteuta tiedoston lukeminen tässä.
            System.out.println("");

            System.out.println("Syötä nimiä, tyhjä rivi lopettaa.");
            while (true) {
                String nimi = lukija.nextLine();
                if (nimi.isEmpty()) {
                    break;
                }

                if (lista.contains(nimi)) {
                    System.out.println("Nimi on listalla.");
                } else {
                    System.out.println("Nimi ei ole listalla.");
                }
            }

            System.out.println("Kiitos!");
        }catch(Exception e) {
            System.out.println("Virhe: " +e.getMessage());
        }
    }
}
