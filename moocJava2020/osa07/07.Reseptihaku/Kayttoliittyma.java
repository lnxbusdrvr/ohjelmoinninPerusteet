
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author lnxbusdrvr
 */
public class Kayttoliittyma {
    
    private ArrayList<Resepti> resepti;
    private Scanner lukija;
    
    public Kayttoliittyma(Scanner lukija, ArrayList resepti) {
        this.lukija = lukija;
        this.resepti = resepti;
    }
    
    public void kaynnista() {
        try{
            System.out.print("Mistä luetaan? ");
            String tiedosto = this.lukija.nextLine();
            
            tiedostonLukeminen(tiedosto);
            menu();
        }catch(Exception e) {
            System.out.println("Virhe käynnistyksessä: "+e.getMessage());
        }
    }
    
    public void tiedostonLukeminen(String tiedosto) {
        try{
            Resepti reseptit = new Resepti();
            Scanner tiedostonlukija = new Scanner(Paths.get(tiedosto));
            while(tiedostonlukija.hasNextLine()) {
                // Luetaan rivi ja sijoitetaan muuttujaan
                String rivi = tiedostonlukija.nextLine();
                
                // Jos rivi on tyhjä, lisää löydetty resepti
                // ja aloita uusiresepti
                if(rivi.isEmpty()) {
                    this.resepti.add(reseptit);
                    reseptit = new Resepti();
                    continue;
                }
                //Lisätään resepti
                reseptit.lisaa(rivi);
            }
            this.resepti.add(reseptit);
        }catch(Exception e) {
            System.out.println("Tiedoston lukeminen eponnistui: "+e.getMessage());
        }
    }
    
    public void menu() {
        try
        {
          
            System.out.println("Komennot:");
            System.out.println("listaa - listaa reseptit");
            System.out.println("lopeta - lopettaa ohjelman");
            System.out.println("hae nimi - hakee reseptiä nimen perusteella");
            System.out.println("hae keittoaika - hakee reseptiä keittoajan perusteella");
            
            System.out.println();
            
            while(true) {
                System.out.print("Syötä komento: ");
                String komento = this.lukija.nextLine();
            
                if(komento.equals("lopeta")) {
                    break;
                }
                if(komento.equals("listaa")) {                    
                    listaa();
                }
                if(komento.equals("hae nimi")) {
                    haeNimi();
                }
                if(komento.equals("hae keittoaika")) {
                    haeKeittoaika();
                }
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }        
    }
    
    public void haeNimi() {
        System.out.print("Mitä haetaan: ");
        String nimi = this.lukija.nextLine();
        
        System.out.println();
        
        for(Resepti haettava : this.resepti) {
            if(haettava.getNimi().contains(nimi)) {
                System.out.println(haettava);
            }
        }
    }
    
    public void haeKeittoaika() {
        System.out.print("Keittoaika korkeintaan: ");
        int aika = Integer.parseInt(this.lukija.nextLine());
        
        System.out.println();
        
        for(Resepti haettava : this.resepti) {
            if(haettava.getAika() <= aika) {
                System.out.println(haettava);
            }
        }
        System.out.println();
    }
        
    public void listaa() {
        System.out.println();
        System.out.println("Reseptit:");
        
        for(Resepti reseptit : this.resepti) {
            System.out.println(reseptit);
        }
        System.out.println();
    }
    
}
