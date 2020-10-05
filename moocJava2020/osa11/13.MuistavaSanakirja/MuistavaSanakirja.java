package sanakirja;

import java.util.HashMap;

/**
 *
 * @author lnxbusdrvr
 */
public class MuistavaSanakirja {
    private HashMap<String, String> sanakirja;

    public MuistavaSanakirja() {
        this.sanakirja = new HashMap<>();
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
    
}
