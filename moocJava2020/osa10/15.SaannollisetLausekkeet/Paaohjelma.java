
import java.util.Scanner;



public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia josta kutsut ohjelmoitavia metodeja
        Scanner lukija = new Scanner(System.in);

        

        Tarkistin tarkistin = new Tarkistin();
        System.out.println("Anna merkkijono:");
        String merkkijono = lukija.nextLine();
        
        System.out.println(tarkistin.kaikkiVokaaleja(merkkijono));
        //tarkistin.onViikonpaiva(merkkijono);
        //tarkistin.kaikkiVokaaleja(merkkijono);
        //tarkistin.kellonaika(merkkijono);
    }
}
