package sanakirja;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiConsumer;

/**
 *
 * @author lnxbusdrvr
 */
public class MuistavaSanakirja {
    private HashMap<String, String> sanakirja;
    private String tiedosto;

    public MuistavaSanakirja() {
        this.sanakirja = new HashMap<>();
    }

    public MuistavaSanakirja(String tiedosto) {
        this.sanakirja = new HashMap<>();
        this.tiedosto = tiedosto;
    }    
        
    public void lisaa(String sana, String kaannos) {
        if(!(this.sanakirja.containsKey(sana))
                && !(this.sanakirja.containsValue(kaannos))) {
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
        try{
            String kaannos = this.sanakirja.get(sana);
            // Jos avain sisältää sanan
            if(this.sanakirja.containsKey(sana)) {
                // poista avain, käännös
                this.sanakirja.remove(sana, kaannos);
            }if(this.sanakirja.containsValue(sana)) {
                // tämä ei toteudu
                //this.sanakirja.remove(kaannos, sana);
                /*for(String v : this.sanakirja.values()) {
                    // Jos Value on sama kuin sana
                    if(v.equals(kaannos)) {
                        // Poista avain
                        this.sanakirja.remove(sana);
                        //this.sanakirja.remove(kaannos);
                        System.out.println("Sana: "+sana);
                        System.out.println("v: "+v);
                    }
                }*/
                this.sanakirja.forEach((avain, tieto) -> {
                    if(tieto.equals(sana)) {
                        this.sanakirja.remove(avain);
                    }
                });
            }
            
            // tämä ei toteudu
            //this.sanakirja.remove(kaannos, sana);
            /*for(String v : this.sanakirja.values()) {
                // Jos Value on sama kuin sana
                if(v.equals(kaannos)) {
                    // Poista avain
                    this.sanakirja.remove(sana);
                    //this.sanakirja.remove(kaannos);
                    System.out.println("Sana: "+sana);
                    System.out.println("v: "+v);
                }
            }*/
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
        }
    }
    
    public boolean tallenna() {
        try{
            PrintWriter kirjoittaja = new PrintWriter(this.tiedosto);
            for(String k : this.sanakirja.keySet()) {
                kirjoittaja.println(k+":"+this.sanakirja.get(k));
            }
            kirjoittaja.close();
            
            return true;
        }catch (Exception e) {
            return false;
        }
    }
    
    public void tulosta() {
        String mjono;
        for(String a : this.sanakirja.keySet()) {
            System.out.println(a+":"+this.sanakirja.get(a));
        }
        //System.out.println(mjono);
    }
    
    
}
