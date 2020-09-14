 
import java.util.ArrayList;
import java.util.Scanner;
 
public class LukujenKeskiarvo {
 
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
 
        System.out.println("Lukujen keskiarvo: " + luetut.stream().mapToInt(i -> i).average().getAsDouble());
 
    }
}
 
