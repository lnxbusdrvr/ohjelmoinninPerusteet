 
import java.util.Scanner;
 
public class Kayttoliittyma {
 
    private Tehtavalista tehtavalista;
    private Scanner lukija;
 
    public Kayttoliittyma(Tehtavalista tehtavalista, Scanner lukija) {
        this.tehtavalista = tehtavalista;
        this.lukija = lukija;
    }
 
    public void kaynnista() {
 
        while (true) {
            System.out.print("Komento: ");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")) {
                break;
            }
 
            if (komento.equals("lisaa")) {
                String lisattava = lukija.nextLine();
                this.tehtavalista.lisaa(lisattava);
            } else if (komento.equals("listaa")) {
                this.tehtavalista.tulosta();
            } else if (komento.equals("poista")) {
                int poistettava = Integer.valueOf(lukija.nextLine());
                this.tehtavalista.poista(poistettava);
            }
        }
    }
}
 
