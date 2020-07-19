/*
 *
 * 07_04.ValmiitJarjestamisalgoritmit
 *
 * Lisää luokkaan Paaohjelma seuraavat luokkametodit:
 * - public static void jarjesta(int[] taulukko) 
 *      järjestää kokonaislukutaulukon.
 * - public static void jarjesta(String[] taulukko)
 *      järjestää merkkijonotaulukon.
 * - public static void jarjestaLuvut(ArrayList<Integer> luvut)
 *      järjestää lukuja sisältävän listan.
 * - public static void jarjestaMerkkijonot(ArrayList<String> merkkijonot)
 *      järjestää merkkijonoja sisältävän listan.
 *
 * Hyödynnä metodien toteutuksessa Javan valmiita kirjastoja.
 *
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
        
    }
    
    public static void jarjesta(int[] taulukko) {
        Arrays.sort(taulukko);
    }
    
    public static void jarjesta(String[] taulukko) {
        Arrays.sort(taulukko);
    }
    
    public static void jarjestaLuvut(ArrayList<Integer> luvut) {
        Collections.sort(luvut);
    }
    
    public static void jarjestaMerkkijonot(ArrayList<String> merkkijonot) {
        Collections.sort(merkkijonot);
    }

}
