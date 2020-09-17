 
import java.util.ArrayList;
import java.util.Scanner;
 
public class LuettujenArvojenTulostaminen {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 
        ArrayList<String> luetut = new ArrayList<>();
 
        while (true) {
            String luettu = lukija.nextLine();
 
            if (luettu.isEmpty()) {
                break;
            }
 
            luetut.add(luettu);
        }
 
        luetut.stream().forEach(s -> System.out.println(s));
    }
}
 
