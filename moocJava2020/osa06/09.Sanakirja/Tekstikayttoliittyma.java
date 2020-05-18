
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
            System.out.print("Komento: ");
            String syote = lukija.nextLine();
            
            if(syote.equals("lopeta")) {                
                break;
            }if(syote.equals("lisaa")) {
                System.out.print("Sana: ");
                String sana = lukija.nextLine();
                System.out.print("Käännös: ");
                String kaannos = lukija.nextLine();
                this.kirja.lisaa(sana, kaannos);
                continue;
            }if(syote.equals("hae")) {
                System.out.print("Haettava: ");
                String hae = lukija.nextLine();
                if(this.kirja.kaanna(hae) == null) {
                    System.out.println("Sanaa "+hae+" ei löydy");
                    continue;
                }else{
                    System.out.println("Käännös: "+this.kirja.kaanna(hae));
                    continue;
                }                
            }else{
                System.out.println("Tuntematon komento");
                i++;
            }                  
        }
        System.out.println("Hei hei!");
    }
}
