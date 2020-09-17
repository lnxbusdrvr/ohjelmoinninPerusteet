/*
 *
 * Tehtävä: 06.RajatutLuvut
 * ------------------------
 * Kirjoita ohjelma, joka lukee käyttäjältä lukuja. 
 * Kun käyttäjä syöttää negatiivisen luvun, 
 * lukeminen lopetetaan. Tulosta tämän jälkeen ne luvut, 
 * jotka ovat välillä 1-5.
 *
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> numerot = new ArrayList<>();
        
        while(true) {
            int syote = Integer.valueOf(lukija.nextLine());
            
            if(syote < 0) {
                break;
            }
            numerot.add(syote);
        }
        
        numerot.stream()
                .filter(n -> n >= 1 && n <= 5)
                .forEach(n -> System.out.println(n));

    }
}
