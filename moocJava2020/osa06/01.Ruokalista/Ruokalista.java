/*
 *
 * Osa 1: Aterian lisääminen
 * -------------------------
 *
 * Toteuta metodi 
 * public void lisaaAteria(String ateria), i
 *
 * joka lisää uuden aterian listalle ateriat. 
 * Jos lisättävä ateria on jo listalla, sitä ei tule lisätä uudelleen. 
 * Listan metodi contains on näppärä olemassaolon tarkastamiseen.
 *
 * Osa 2: Aterioiden tulostaminen
 * ------------------------------
 *
 * Toteuta metodi public void tulostaAteriat(), joka tulostaa ateriat.
 *
 * Osa 3: Ruokalistan tyhjentäminen
 * --------------------------------
 *
 * Toteuta metodi 
 * public void tyhjennaRuokalista() 
 *
 * joka tyhjentää ruokalistan. 
 * ArrayList-luokalla on metodi josta on tässä hyötyä. 
 * NetBeans osaa vihjata käytettävissä olevista metodeista 
 * kun kirjoitat olion nimen ja pisteen. 
 *
 * Yritä kirjoittaa ateriat. metodirungon sisällä ja katso mitä käy.
 *
 */ 

import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    // toteuta tänne tarvittavat metodit
    
    // Osa 1 Koodausaika 1min 27sek
    public void lisaaAteria(String ateria) {
        if(!this.ateriat.contains(ateria)) {
            this.ateriat.add(ateria);
        }
    }
    
    // Osa 2 Koodausaika 53sek
    public void tulostaAteriat() {
        for(String ateria : this.ateriat) {
            System.out.println(ateria);
        }
    }
    
    // Osa 3 Koodausaika 37sek
    public void tyhjennaRuokalista() {
        this.ateriat.clear();
    }
}
