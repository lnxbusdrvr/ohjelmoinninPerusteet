
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi

        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
        System.out.println("Anna lukuja");
        Lukutilasto lue = new Lukutilasto();
        Lukutilasto parilliset = new Lukutilasto();
        Lukutilasto parittomat = new Lukutilasto();
                
        while(true) {
            int luvut = Integer.valueOf(lukija.nextLine());
            
            if(luvut < 0) {
                luvut = luvut +1;
                break;
            }
            
            // Lisätään joka parilliset ja parittomat
            lue.lisaaLuku(luvut);
            
            // Vain parilliset
            if(luvut % 2 == 0) {
                parilliset.lisaaLuku(luvut);
            }
            if(luvut % 2 == 1) {
                // Vain parittomat
                parittomat.lisaaLuku(luvut);
            }             
            
        }
        
        System.out.println("Summa: "+lue.summa());
        System.out.println("Parillisten summa: "+parilliset.summa());
        System.out.println("Parittomien summa: "+parittomat.summa());
    }
}
