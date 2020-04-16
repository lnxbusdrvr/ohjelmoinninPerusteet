/*
 * |      Maksukortti         |
 * |--------------------------|
 * | -saldo: double           |
 * |--------------------------|
 * | +Maksukortti(double)     |
 * | +syoEdullisesti():void   |
 * | +syoMaukkaasti(): void   |
 * | +lataaRahaa(double):void |
 * | +toString():String       |
 *
 * Osa1
 * ----
 *
 * Lisää projektiin uusi luokka nimeltä Maksukortti
 * 
 * Tee ensin Maksukortti-olion
 * konstruktori,
 * jolle annetaan kortin alkusaldo
 * ja joka tallentaa sen olion sisäiseen muuttujaan.
 *
 * Tee sitten
 * toString-metodi,
 * joka palauttaa kortin saldon muodossa
 * "Kortilla on rahaa X euroa".
 *
 * Osa2: Kortilla maksaminen
 * -------------------------
 *
 * Täydennä Maksukortti-luokkaa seuraavilla metodeilla:
 * syoEdullisesti()
 * syoMaukkaasti()
 *
 * Metodin syoEdullisesti tulisi vähentää kortin saldoa
 * 2.60 eurolla
 *
 * ja metodin syoMaukkaasti tulisi vähentää kortin saldoa
 * 4.60 eurolla.
 *
 * Osa3: Ei-negatiivinen saldo
 * ---------------------------
 *
 * Mitä tapahtuu, jos kortilta loppuu raha kesken?
 * Ei ole järkevää, että saldo muuttuu negatiiviseksi.
 * Muuta metodeita syoEdullisesti ja syoMaukkaasti niin,
 * että ne eivät vähennä saldoa,
 * jos saldo menisi negatiiviseksi.
 *
 * Osa4: Kortin lataaminen
 * -----------------------
 *
 * Lisää Maksukortti-luokkaan seuraava metodi:
 * lataaRahaa(double rahamaara)
 *
 * Metodin tarkoituksena on kasvattaa kortin saldoa
 * parametrina annetulla rahamäärällä.
 * Kuitenkin kortin saldo saa olla korkeintaan 150 euroa,
 * joten jos ladattava rahamäärä ylittäisi sen,
 * saldoksi tulisi tulla silti tasan 150 euroa.
 *
 * Osa5: Kortin lataus negatiivisella arvolla
 * ------------------------------------------
 *
 * Muuta metodia lataaRahaa vielä siten,
 * että jos yritetään ladata negatiivinen rahamäärä,
 * ei kortilla oleva arvo muutu.
 *
 * Osa6: Monta korttia
 * --------------------
 *
 * Tee luokan Paaohjelma main-metodiin koodi,
 * joka sisältää seuraavan tapahtumasarjan:
 *
 * Luo Pekan kortti. Kortin alkusaldo on 20 euroa
 * Luo Matin kortti. Kortin alkusaldo on 30 euroa
 * Pekka syö maukkaasti
 * Matti syö edullisesti
 * Korttien arvot tulostetaan (molemmat omalle rivilleen, rivin alkuun kortin omistajan nimi)
 * Pekka lataa rahaa 20 euroa
 * Matti syö maukkaasti
 * Korttien arvot tulostetaan (molemmat omalle rivilleen, rivin alkuun kortin omistajan nimi)
 * Pekka syö edullisesti
 * Pekka syö edullisesti
 * Matti lataa rahaa 50 euroa
 * Korttien arvot tulostetaan (molemmat omalle rivilleen, rivin alkuun kortin omistajan nimi)
 *
 */
 

public class Maksukortti {
    private double saldo;
    
    // Konstruktori
    public Maksukortti(double alkuSaldo) {
        this.saldo = alkuSaldo;
    }
    
    //Metodit
    public void syoEdullisesti() {
        double edullinen = 2.60;
        
        if(this.saldo < edullinen) {
            this.saldo = this.saldo;    
        }else{
            this.saldo = this.saldo - edullinen;
        }
    }
    
    public void syoMaukkaasti() {
        double maukas = 4.60;
        
        if(this.saldo < maukas) {
            this.saldo = this.saldo;    
        }else{
            this.saldo = this.saldo - maukas;
        }        
    }
 
    public void lataaRahaa(double rahamaara) {
        if(rahamaara <= 0) {
            this.saldo = this.saldo;
        }else{
            this.saldo = this.saldo + rahamaara;
        }
    }
    
    public String toString() {
        return "Kortilla on rahaa " +this.saldo+ " euroa";
    }
} 
// Luokka valmis
