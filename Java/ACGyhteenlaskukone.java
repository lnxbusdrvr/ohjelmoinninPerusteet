package harjoituksia;
import java.util.Scanner;

public class ACGyhteenlaskukone {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args){
      int luku1, luku2;
      char vastaus;
      
      do{
        System.out.println("Olen yhteenlaskukone");
        System.out.println("Anna kaksi kokonaislukua");
        System.out.print("Ensimm�inen luku: ");
        luku1 = lukija.nextInt();
        System.out.print("Toinen luku: ");
        luku2 = lukija.nextInt();
        System.out.println("Summa on: " + (luku1+luku2));
        
        System.out.print("\nJatketaanko (k/e): ");
        vastaus = lukija.next().charAt(0);
        if(vastaus !='k') System.out.println("Kiitos ohjelman k�yt�st�!");
        System.out.println();
      }while (vastaus == 'k');
    }
}
