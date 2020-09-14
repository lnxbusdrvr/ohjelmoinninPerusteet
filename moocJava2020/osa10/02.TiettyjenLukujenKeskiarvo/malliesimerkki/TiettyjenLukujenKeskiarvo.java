 
import java.util.ArrayList;
import java.util.Scanner;
 
public class TiettyjenLukujenKeskiarvo {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
 
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        ArrayList<Integer> luetut = new ArrayList<>();
 
        while (true) {
            String luettu = lukija.nextLine();
 
            if (luettu.equals("loppu")) {
                break;
            }
 
            luetut.add(Integer.valueOf(luettu));
        }
 
        System.out.println("");
 
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        String valinta = lukija.nextLine();
        if (valinta.equals("n")) {
            System.out.println("Negatiivisten lukujen keskiarvo: " + luetut.stream().filter(l -> l < 0).mapToInt(i -> i).average().getAsDouble());
        } else {
            System.out.println("Positiivisten lukujen keskiarvo: " + luetut.stream().filter(l -> l > 0).mapToInt(i -> i).average().getAsDouble());
        }
 
    }
}
 
