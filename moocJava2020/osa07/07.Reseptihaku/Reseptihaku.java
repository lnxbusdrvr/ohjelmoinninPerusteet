
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Resepti> resepti = new ArrayList<>();
        
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(lukija, resepti);
        
        kayttoliittyma.kaynnista();

    }

}
