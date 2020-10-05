package sanakirja;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author lnxbusdrvr
 */
public class MuistavaSanakirja {
    private HashMap<String, String> sanakirja;
    private HashMap<String, String> sanakirjaTiedostosta;
    private String tiedosto;

    public MuistavaSanakirja() {
        this.sanakirja = new HashMap<>();
        this.sanakirjaTiedostosta = new HashMap<>();
    }

    public MuistavaSanakirja(String tiedosto) {
        this.sanakirja = new HashMap<>();
        this.sanakirjaTiedostosta = new HashMap<>();
        this.tiedosto = tiedosto;
    }    
        
    public void lisaa(String sana, String kaannos) {
        // Ensi kerralla lue paremmin ohjeet
        // kun tämä metodi oli vääriin niin tähään kului taas tunt(e)i aikaa
        if(!this.sanakirja.containsKey(sana)) {
            this.sanakirja.put(sana, kaannos);
        }        
    }
    
    public String kaanna(String sana) {
        if(this.sanakirja.containsKey(sana)) {
            return this.sanakirja.get(sana);
        }
        
        for(String s : this.sanakirja.keySet()) {
            // jos tulos on sana
            if(this.sanakirja.get(s).equals(sana)) {
                // Palauta avain
                return s;
                //debug 
                //System.out.println(s);                    
            }
        }
        return null;
    }
    
    public void poista(String sana) {
        // Poista ensiksi V, sen jälkeen K
        if(this.sanakirja.containsValue(sana)) {
            this.sanakirja.remove(this.sanakirja.get(sana));
        }if(this.sanakirja.containsKey(sana)) {
            this.sanakirja.remove(sana);
        }
    }
    
    public boolean lataa() {
        try{
            Scanner tiedostonLukija = new Scanner(Paths.get(this.tiedosto));
            
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                // pilkotaan rivi :-merkkien kohdalta
                String[] osat = rivi.split(":");
                
                //Lisää listalle
                this.lisaa(osat[0], osat[1]);                
            }
            return true;
        }catch (Exception e) {
            return false;
        }finally{
            
        }
    }
    
}
