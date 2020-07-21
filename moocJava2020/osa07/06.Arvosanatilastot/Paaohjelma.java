
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        int lukumaara = 0;
        int summa = 0;
        
        
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");

        while(true) {
            int luku = Integer.valueOf(lukija.nextLine());

            if(luku == -1) {
                break;
            }
            if(luku > 0 && luku <=100) {
                summa = summa + luku;
                lukumaara++;
            }/*else{
                lukumaara--;
            }*/
            
        }
        double keskiarvo = (double)summa/lukumaara;
        System.out.println("Pisteiden keskiarvo (kaikki): "+keskiarvo);
    }
}
