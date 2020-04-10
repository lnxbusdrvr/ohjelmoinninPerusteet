
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän.
        System.out.print("Mikä tulostetaan? ");
        String sana = lukija.nextLine();
        
        int kerrat = 3;
        
        for(int i=1;i < kerrat;i++) {
            System.out.print(sana);
        }

    }
}
