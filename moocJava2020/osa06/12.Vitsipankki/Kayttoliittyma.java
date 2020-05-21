
import java.util.Scanner;

public class Kayttoliittyma {
    private Vitsipankki vitsit;
    private Scanner lukija;
    
    public Kayttoliittyma(Vitsipankki vitsit, Scanner lukija) {
        this.vitsit = vitsit;
        this.lukija = lukija;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.println("Komennot:");
            System.out.println(" 1 - lisää vitsi");
            System.out.println(" 2 - arvo vitsi");
            System.out.println(" 3 - listaa vitsit");
            System.out.println(" X - lopeta");
            String komento = lukija.nextLine();
            if (komento.equals("X")) {
                break;
            }
            if (komento.equals("1")) {
                System.out.println("Kirjoita lisättävä vitsi:");
                String vitsi = lukija.nextLine();
                this.vitsit.lisaaVitsi(vitsi);
            } else if (komento.equals("2")) {
                System.out.println("Arvotaan vitsi.");
                this.vitsit.arvoVitsi();
            } else if (komento.equals("3")) {
                this.vitsit.tulostaVitsit();
            }
        }
    }
}
