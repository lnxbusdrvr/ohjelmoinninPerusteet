
import java.util.ArrayList;
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> lista = new ArrayList<>();
        
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        while(true) {
            String syote = lukija.nextLine();
            if(syote.equals("loppu")) {
                break;
            }else{
                lista.add(syote);
            }
        }
        
        // Keskiarvo
        double keskiarvo = lista.stream()
              // Myös toimii:
              //.mapToInt(foo -> Integer.valueOf(foo))
              // Ei toimi, koska keskiarvo on jo käytetty:
              //.mapToInt(keskiarvo -> Integer.valueOf(keskiarvo))
              // Järkevin vaihtoehto:
                .mapToInt(k -> Integer.valueOf(k))
                .average()
                .getAsDouble();
        
        System.out.println("Lukujen keskiarvo: "+keskiarvo);

    }
}
