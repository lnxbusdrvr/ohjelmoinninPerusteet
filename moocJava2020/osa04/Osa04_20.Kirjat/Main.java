
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
        
        while(true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            
            if(nimi.isEmpty()) {
                break;
            }
            System.out.print("Sivuja: ");
            int sivuja = Integer.valueOf(lukija.nextLine());
            
            System.out.print("Julkaisuvuosi: ");
            int vuosi = Integer.valueOf(lukija.nextLine());
            
            kirjat.add(new Kirja(nimi, sivuja, vuosi));
        }
        
        System.out.println("Mitä tulostetaan? ");
        String tuloste = lukija.nextLine();
        
        if(tuloste.equals("nimi")) {
            for(Kirja nimi : kirjat) {
                System.out.println(nimi.getNimi());
            }
        }
        if(tuloste.equals("kaikki")) {
            for(Kirja kaikki : kirjat) {
                System.out.println(kaikki);
            }
        }

    }
}
