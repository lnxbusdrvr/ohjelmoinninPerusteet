//

import java.util.ArrayList;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<Integer> negat = new ArrayList<>();
        ArrayList<Integer> posit = new ArrayList<>();
        
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        while(true) {
            String syote = lukija.nextLine();
            if(syote.equals("loppu")) {
                break;
            }else{
                int io = Integer.valueOf(syote);
                if(io < 0) {
                    negat.add(io);
                }else{
                    posit.add(io);
                }
            }
        }
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        String syote = lukija.nextLine();
        
        if(syote.equals("n")) {
            System.out.println("Negatiivisten lukujen keskiarvo: " + negat.stream().mapToInt(n -> n).average().getAsDouble());
        }else{
            System.out.println("Positiivisten lukujen keskiarvo: " + posit.stream().mapToInt(n -> n).average().getAsDouble());
            
        }
        
    }
}
