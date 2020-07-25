
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author lnxbusdrvr
 */
public class Kayttoliittyma {
    
    private ArrayList<Lintu> lintutk;
    private Scanner lukija;
    
    public Kayttoliittyma(Scanner lukija, ArrayList linnut) {
        this.lukija = lukija;
        this.lintutk = new ArrayList<>();
    }
    
    public void kaynnista() {
        while(true) {
            System.out.print("? ");
            String komento = this.lukija.nextLine();
            
            if(komento.equals("Lopeta")) {
                break;
            }
            // Lisää
            if(komento.equals("Lisaa")) {
                lisaa();
            }
            // Havainto
            if(komento.equals("Havainto")) {
                havainto();
            }
            // Tilasto
            if(komento.equals("Tilasto")) {
                tilasto();
            }
            // Näytö
            if(komento.equals("Nayta")) {
                nayta();
            }
        }            
    }
    
    public void lisaa() {
        System.out.print("Nimi: ");
        String nimi = this.lukija.nextLine();
        System.out.print("Latinankielinen nimi: ");
        String latNimi = this.lukija.nextLine();
        
        // Lisätään listaan
        this.lintutk.add(new Lintu(nimi, latNimi));
    }
        
    public void havainto() {
        System.out.print("Mikä havainto? ");
        String havaittuLintu = this.lukija.nextLine();
        
        for(Lintu lintu : this.lintutk) {
            if(lintu.getLintu().equals(havaittuLintu)) {
                lintu.lisaaHavainto();
            }else{
                System.out.println("Ei ole lintu!");
        }
        }
    }
    
    public void tilasto() {
        for(Lintu kaikLinnut : this.lintutk) {
            System.out.println(kaikLinnut);
        }
    }
        
    public void nayta() {
        System.out.print("Mikä? ");
        String nimi = this.lukija.nextLine();
        
        for(Lintu haettavaLintu : this.lintutk) {
            if(haettavaLintu.getLintu().contains(nimi)) {
                System.out.println(haettavaLintu);
            }
        }
    }
    
}
