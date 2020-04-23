
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        try{
            System.out.println("Minkä niminen tiedosto luetaan?");
            String tiedosto = lukija.nextLine();
                                  
            Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto));
            
            System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
            String joukkue = lukija.nextLine();
            
            ArrayList<Ottelu> ottelut = new ArrayList<>();
            
            int voitetutMaalit = 0;
            int havitytMaalit = 0;
            
            // Tiedoston läpikäynti
            while(tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
               
                
                String[] tilastot = rivi.split(",");
                String paaPelaaja = tilastot[0];
                String vastustaja = tilastot[1];
                int pisteetYks = Integer.valueOf(tilastot[2]);
                int pisteetKaks = Integer.valueOf(tilastot[3]);
                
                // Lisätään tiedot listaan
                ottelut.add(new Ottelu(paaPelaaja, vastustaja, pisteetYks, pisteetKaks));
            }
            
            // Selvitellään ottelut ja maalit
            for(Ottelu ottelu : ottelut) {
                if(ottelu.pelaasikoJoukkue(joukkue)) {
                    if(ottelu.getVoittaja().equals(joukkue)) {
                        voitetutMaalit++;
                    }else{
                        havitytMaalit++;
                    }
                }                    
            }
            
            System.out.println("Otteluita: "+(voitetutMaalit+havitytMaalit));
            System.out.println("Voittoja: "+voitetutMaalit);
            System.out.println("Tappioita: "+havitytMaalit);
            
        }catch(Exception e) {
            System.out.println("Virhe: "+e.getMessage());
        }
    }
}
