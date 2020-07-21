
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        int lukumaara = 0;
        int summa = 0;
        int hyvaksytyt_summa = 0;
        int hyvaksytyt_lkm = 0;
        
        
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");

        while(true) {
            int luku = Integer.valueOf(lukija.nextLine());

            if(luku == -1) {
                break;
            }
            if(luku > 0 && luku <=100) {
                summa = summa + luku;
                lukumaara++;
                if(luku >= 50) {
                    hyvaksytyt_summa = hyvaksytyt_summa + luku;
                    hyvaksytyt_lkm++;
                }
            }
            
        }
        double keskiarvo = (double)summa/lukumaara;
        double hyvaksy_keskiarvo = (double)hyvaksytyt_summa/hyvaksytyt_lkm;
        double hyvks_pros = 100.0*hyvaksytyt_lkm/lukumaara;
        
        System.out.println("Pisteiden keskiarvo (kaikki): "+keskiarvo);
        if(Double.isNaN(hyvaksy_keskiarvo)) {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): -");
        }else{
            System.out.println("Pisteiden keskiarvo (hyväksytyt): "+hyvaksy_keskiarvo);
        }
        if(Double.isNaN(hyvks_pros)) {
            System.out.println("Hyväksymisprosentti: 0.0");
        }else{
            System.out.println("Hyväksymisprosentti: "+hyvks_pros);
        }
    }
}
