
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Varasto> esineet = new ArrayList<>();
        
        while(true) {
            System.out.println("Syötä esineen tunnus, tyhjä lopettaa.");
            String tunnus = lukija.nextLine();
            if(tunnus.equals("")) {
                break;
            }
            
            System.out.println("Syötä esineen nimi, tyhjä lopettaa.");
            String nimi = lukija.nextLine();
            if(nimi.equals("")) {
                break;
            }
            Varasto esine = new Varasto(tunnus, nimi);
            
            if(esineet.contains(esine)) {
            }else{
                esineet.add(esine);
            }
        }
        System.out.println("==Esineet==");
        for(Varasto i : esineet) {
            System.out.println(i);            
        }
    }
}
