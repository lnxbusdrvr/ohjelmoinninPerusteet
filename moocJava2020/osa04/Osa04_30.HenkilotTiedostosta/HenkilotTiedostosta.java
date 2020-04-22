/*
 * Tehtävässä käsitellään CSV-muodossa tallennettuja tiedostoja,
 * jotka sisältävät riveittän pilkuilla eroteltuna nimiä ja ikiä.
 * Tiedoston muoto on esimerkiksi seuraava:
 *
 * Esimerkkidata:
 * lilja,3
 * anton,5
 * leevi,4
 * aamu,1
 *
 * Tehtäväpohjassa on valmiina luokka
 * Henkilo
 * sekä luokassa HenkilotTiedostosta
 *
 * oleva runko metodille
 * public static ArrayList<Henkilo> lueHenkilot(String tiedosto)
 *
 * Toteuta metodi lueHenkilot siten,
 * että metodissa luetaan parametrina annetusta tiedostosta henkilöt,
 * jotka lopulta palautetaan metodin palauttamassa listassa.
 *
 * Tehtäväpohjassa on valmiina main-metodi,
 *
 * jossa voit kokeilla ohjelmasi toimintaa.
 * Muokkaa tehtävässä vain metodia lueHenkilot.
 *
 */
  

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();

        ArrayList<Henkilo> henkilot = lueHenkilot(tiedosto);
        System.out.println("Henkilöitä: " + henkilot.size());
        System.out.println("Henkilöt:");
        for (Henkilo henkilo : henkilot) {
            System.out.println(henkilo);

        }
    }

    public static ArrayList<Henkilo> lueHenkilot(String tiedosto) {
        ArrayList<Henkilo> henkilot = new ArrayList<>();

        // toteuta henkilöiden lukeminen ja luominen tänne
        try{
            Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto));
            
            while(tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
            
                String[] taulukko = rivi.split(",");
                String nimi = taulukko[0];
                int ika = Integer.valueOf(taulukko[1]);
            
                henkilot.add(new Henkilo(nimi, ika));
            }
            
        }catch(Exception e) {
            System.out.println("Virhe: "+e.getMessage());
        }
        return henkilot;
    }
}
