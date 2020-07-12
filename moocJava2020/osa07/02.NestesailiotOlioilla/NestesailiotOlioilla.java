
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        Sailio eka = new Sailio();
        Sailio toka = new Sailio();


        while (true) {
            //System.out.print("> ");
            
            System.out.println("Ensimmäinen: "+eka);
            System.out.println("Toinen: "+toka);
            
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            
            String[] palat = luettu.split(" ");
            
            System.out.println();
            
            String komento = palat[0];
            int maara = Integer.parseInt(palat[1]);
            
            if(komento.equals("lisaa")) {
                eka.lisaa(maara);
            }
            
            if(komento.equals("siirra")) {
                // Ei negatiivisia lukuja, eikä tyhjää säiliötä
                if(eka.sisalto() > 0) {
                    if(eka.sisalto() <= maara) {
                        toka.lisaa(eka.sisalto());
                        eka.poista(maara);
                    }
                    if(eka.sisalto() > maara) {
                        toka.lisaa(maara);
                        int apu = eka.sisalto() - maara;
                        eka.poista(eka.sisalto());
                        eka.lisaa(apu);
                    }
                }
            }
            
            if(komento.equals("poista")) {
                if(maara > 0) {
                    if(eka.sisalto() >= 1) {
                        toka.poista(maara);
                    }else{
                        eka.poista(maara);
                    }
                }                
            }
            

        }
    }

}
