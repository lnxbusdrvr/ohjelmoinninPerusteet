 
import java.util.Scanner;
 
public class NestesailiotOlioilla {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 
        Sailio ensimmainen = new Sailio();
        Sailio toinen = new Sailio();
 
        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainen);
            System.out.println("Toinen: " + toinen);
            System.out.print("> ");
 
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
 
            String[] osat = luettu.split(" ");
            luettu = osat[0];
            int maara = Integer.valueOf(osat[1]);
 
            if (luettu.equals("lisaa")) {
                ensimmainen.lisaa(maara);
            }
 
            if (luettu.equals("siirra")) {
                if (maara > ensimmainen.sisalto()) {
                    maara = ensimmainen.sisalto();
                }
 
                ensimmainen.poista(maara);
                toinen.lisaa(maara);
            }
 
            if (luettu.equals("poista")) {
                toinen.poista(maara);
            }
 
            System.out.println("");
        }
    }
 
}

