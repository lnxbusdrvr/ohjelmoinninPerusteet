 
import java.util.ArrayList;
import java.util.Scanner;
 
public class RajatutLuvut {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 
        ArrayList<Integer> luetut = new ArrayList<>();
 
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
 
            if (luettu < 0) {
                break;
            }
 
            luetut.add(luettu);
        }
 
        luetut.stream().filter(luku -> luku >= 1 && luku <= 5).forEach(luku -> System.out.println(luku));
    }
}
 
