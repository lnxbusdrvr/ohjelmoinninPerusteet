/*
 * Toteuta tässä kuvattu ohjelma luokkaan Henkilotiedot.
 * Huom! Älä muuta luokkaa Henkilotieto.
 *
 * Kirjoita ohjelma, joka lukee käyttäjältä henkilötietoja.
 *
 * Käyttäjä syöttää etunimen, sukunimen, ja henkilötunnuksen.
 *
 * Mikäli etunimi on tyhjä, lopeta lukeminen.
 * Mikäli etunimi ei ole tyhjä, lue loput tiedot ja luo käyttäjän syöttämistä tiedoista olio,
 * jonka lisäät henkilotiedot-listalle.
 *
 * Kun käyttäjä on lopettanut tietojen syöttämisen (käyttäjä syöttää tyhjän etunimen),
 * poistu toistolauseesta.
 *
 * Tulosta tämän jälkeen henkilötiedot siten,
 * että jokaisesta syötetystä oliosta tulostetaan etunimi
 * ja sukunimi välilyönnillä erotettuna (henkilötunnusta ei tulosteta!).
 * Alla esimerkki ohjelman suorituksesta.
 *
 * Esimerkkitulostus:
 *
 * Etunimi: Jean
 * Sukunimi: Bartik
 * Henkilötunnus: 271224
 * Etunimi: Betty
 * Sukunimi: Holberton
 * Henkilötunnus: 070317
 * Etunimi:
 *
 * Jean Bartik
 * Betty Holberton
 *
 */
 
 

import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        
        
        while(true) {
            System.out.print("Etunimi: ");
            String etunimi = lukija.nextLine();
            
            //Mikäli tyhjä. Lopetetaan looppi
            if(etunimi.isEmpty()) {
                break;
            }
            
            System.out.print("Sukunimi: ");
            String sukunimi = lukija.nextLine();
            
            System.out.print("Henkilötunnus: ");
            String hetu = lukija.nextLine();
            
            // Lisätään tiedot listaan
            henkilotiedot.add(new Henkilotieto(etunimi, sukunimi, hetu));                                  
        }
        for(Henkilotieto henk : henkilotiedot) {
            System.out.println("\n"+henk.getEtunimi()+" "+henk.getSukunimi());
        }               
    }
}
//
