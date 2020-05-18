
import java.util.Scanner;

public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja kirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja kirja){
        this.lukija = lukija;
        this.kirja = kirja;
    }
    
    public void kaynnista() {
        int i = 0;
        while(true) {
            String syote = lukija.nextLine();
            
            if(syote.equals("lopeta")) {
                System.out.println("Hei hei!");
                break;
            }if(syote.equals("lisaa")) {
                System.out.print("Sana: ");
                String sana = lukija.nextLine();
                System.out.print("Käännös: ");
                String kaannos = lukija.nextLine();
                this.kirja.lisaa(sana, kaannos);
            }
            System.out.println("Tuntemato komentti");
            i++;
        }
        
    }
}
