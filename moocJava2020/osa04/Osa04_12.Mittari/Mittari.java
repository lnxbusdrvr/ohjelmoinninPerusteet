/*
 * Luo luokka Mittari. Mittarilla on oliomuuttuja
 * private int mitta, parametriton konstruktori (asettaa muuttujan mitta alkuarvoksi 0),
 * sekä seuraavat neljä metodia:
 *
 *   Metodi public void lisaa() kasvattaa oliomuuttujan mitta arvoa yhdellä. Ei kasvata arvoa yli viiden.
 *   Metodi public void vahenna() vähentää oliomuuttujan mitta arvoa yhdellä. Ei vähennä arvoa negatiiviseksi.
 *   Metodi public int mitta() palauttaa oliomuuttujan mitta arvon.
 *   Metodi public boolean taynna() palauttaa true mikäli oliomuuttujan mitta on viisi, palauttaa muulloin false.
 *
 */
 
 


public class Mittari {
    private int mitta;
    
    public Mittari() {
        this.mitta = 0;
    }
    
    public void lisaa() {
        this.mitta = this.mitta + 1;
        if(this.mitta > 5) {
            this.mitta = this.mitta -1;
        }
    }
    
    public void vahenna() {
        this.mitta = this.mitta -1;
        if(this.mitta < 0) {
            this.mitta = this.mitta +1;
        }
    }
    
    public int mitta() {
        return this.mitta;
    }
    
    public boolean taynna() {
        if(this.mitta == 5) {
            return true;
        }
        return false;
    }
}
