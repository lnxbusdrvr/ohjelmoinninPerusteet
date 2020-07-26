  
import java.util.Scanner;
 
public class Kuutiot {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("loppu")) {
                break;
            }
 
            int luku = Integer.valueOf(luettu);
            System.out.println(luku * luku * luku);
        }
    }
}
 
