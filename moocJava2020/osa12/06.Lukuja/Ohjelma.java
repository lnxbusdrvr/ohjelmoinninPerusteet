
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Montako satunnaislukua tulostetaan?");
        int maara = Integer.valueOf(lukija.nextLine());

        for(int i = 0; i < maara;i++) {
          System.out.println(heita());
        }
    }

    public static int heita() {
        Random satu = new Random();
        return satu.nextInt(11);
    }

}
