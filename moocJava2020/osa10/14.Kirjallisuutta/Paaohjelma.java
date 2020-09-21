
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Kirja> kirja = new ArrayList<>();
              
        while(true) {
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa: ");
            String nimi = lukija.nextLine();
            if(nimi.equals("")) {
                break;
            }
            System.out.println("Syötä kirjan pienin kohdeikä: ");
            int ika = Integer.valueOf(lukija.nextLine());
            kirja.add(new Kirja(nimi, ika));
        }
        //System.out.println();
        System.out.println("Yhteensä "+kirja.size()+" kirjaa.");
        System.out.println();
        
        kirja.stream()
                .forEach(k -> System.out.println(k));

    }

}
