
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Kirja> kirja = new ArrayList<>();
              
        while(true) {
            System.out.print("Syötä kirjan nimi, tyhjä lopettaa: ");
            String nimi = lukija.nextLine();
            if(nimi.equals("")) {
                break;
            }
            System.out.print("Syötä kirjan pienin kohdeikä: ");
            int ika = Integer.valueOf(lukija.nextLine());
            kirja.add(new Kirja(nimi, ika));
            
            System.out.println();
        }
        
        System.out.println("Yhteensä "+kirja.size()+" kirjaa.");
        System.out.println();
        
        Comparator<Kirja> vertailu = Comparator
                .comparing(Kirja::getKohdeika)
                .thenComparing(Kirja::getNimi);
        
        Collections.sort(kirja, vertailu);
        
        kirja.stream()
                .forEach(k -> System.out.println(k));

    }

}
