
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int eka = 0;
        int EKA_MAX = 100;
        int toka = 0;
        int TOKA_MAX = 100;

        while (true) {
            //System.out.print("> ");
            
            System.out.println("Ensimmäinen: "+eka+"/"+EKA_MAX);
            System.out.println("Toinen: "+toka+"/"+TOKA_MAX);

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            String[] palat = luettu.split(" ");
            
            System.out.println();
            
            String komento = palat[0];
            int maara = Integer.parseInt(palat[1]);
            
            if(komento.equals("lisaa")) {
                if(maara > 0) {
                    eka += maara;
                    if(eka > 100) {
                        eka = 100;
                    }
                }
            }
            
            if(komento.equals("siirra")) {
                // Ei negatiivisia lukuja, eikä tyhjää säiliötä
                if(maara > 0 && eka != 0) {
                    eka -= maara;
                    toka += maara;
                    if(eka < 0) {
                        // Yhdistetään negaluku + toka:n arvo,
                        // jolloin toka:sta tulee oikea erotus.
                        int apu = eka + toka;
                        toka = apu;
                        eka = 0;
                    }
                    //Ei yli 100
                    if(toka > 100) {
                        toka = 100;
                    }
                }
            }

        }
    }
}
