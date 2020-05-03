/*
 *
 * Osa 1: Plus
 * -----------
 *
 * Tee ensin metodi 
 * public Raha plus(Raha lisattava), 
 *
 * joka palauttaa uuden raha-olion, 
 * joka on arvoltaan yhtä suuri kuin se olio jolle metodia kutsuttiin 
 * ja parametrina oleva olio yhteensä.
 *
 *
 * Osa 2: Vähemmän
 * ---------------
 *
 *  Tee metodi 
 *  public boolean vahemman(Raha verrattava), 
 *
 *  joka palauttaa true 
 *  jos raha-olio jolle metodia kutsutaan on arvoltaan 
 *  pienempi kuin raha-olio, joka on metodin parametrina.
 *
 * Osa 3: Miinus
 * -------------
 *
 * Tee metodi i
 * public Raha miinus(Raha vahentaja), 
 *
 * joka palauttaa uuden raha-olion, jonka arvoksi tulee sen olion 
 * jolle metodia kutsuttiin ja parametrina olevan olion arvojen erotus. 
 * Jos erotus olisi negatiivinen, tulee luotavan raha-olion arvoksi 0.
 * 
 */

public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }
    
    // Osa 1 Koosausaika 2min 44sek
    public Raha plus(Raha lisattava) {
        int euroa = this.euroa + lisattava.euroa;
        int senttia = this.senttia + lisattava.senttia;
        Raha uusi = new Raha(euroa, senttia);
        
        return uusi;
    }
    
    // Osa 2 Koodausaika 6min 44sek
    public boolean vahemman(Raha verrattava) {
        if(this.euroa < verrattava.euroa || this.euroa == verrattava.euroa
                && this.senttia < verrattava.senttia) {
            return true;
        }else{
            return false;
        }
    }
    
    // Osa 3 Koodausaika 8min 16sek
    public Raha miinus(Raha vahentaja) {
        int euro = this.euroa - vahentaja.eurot();
        int sentti = this.senttia - vahentaja.sentit();
        if(sentti < 0) {
            euro--;
            sentti += 100;
        }
        // Debugger
        //System.out.println(euro+"."+sentti);
            
        if(euro < 0) {
            euro = 0;
            sentti = 0;
            Raha uusi = new Raha(euro, sentti);
            return uusi;
        }            
        
        Raha uusi = new Raha(euro, sentti);
        return uusi;
    }
}
