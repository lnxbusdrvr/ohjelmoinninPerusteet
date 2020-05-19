
import java.util.Scanner;

public class Kayttoliittyma {
    private Tehtavalista lista;
    private Scanner lukija;
    
    public Kayttoliittyma(Tehtavalista lista, Scanner lukija) {
        this.lista = lista;
        this.lukija = lukija;
    }
    
    public void kaynnista() {
        while(true) {
            System.out.print("Komento: ");
            String syote = lukija.nextLine();
            if(syote.equals("lopeta")) {
                break;
            }
            
            kasitteleKomento(syote);
        }
        System.out.println("Hei hei!");
    }
    
    public void kasitteleKomento(String syote) {
        if(syote.equals("lisaa")) {
            lisaa();
        }if(syote.equals("listaa")) {
            listaa();
        }if(syote.equals("poista")) {
            poista();
        }
    }
    
    public void lisaa() {
        System.out.print("Lisättävä: ");
        String tehtava = lukija.nextLine();
        this.lista.lisaa(tehtava);
    }
    
    public void listaa() {
        this.lista.tulosta();
    }
    
    public void poista() {
        System.out.print("Mikä poistetaan? ");
        int poista = Integer.valueOf(lukija.nextLine());
        // Pienennetään lukua 1 verran
        // Koska pääohjelma olettaa lukujen alkavan 1:sta
        //poista++;
        this.lista.poista(poista);
    }
}
