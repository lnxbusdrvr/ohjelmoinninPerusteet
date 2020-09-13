

/**
 *
 * @author lnxbusdrvr
 */
public class Elio implements Siirrettava {
    private int x;
    private int y;
    
    public Elio(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void siirra(int dx, int dy) {
        // Siirtää oliota parametrina saatujen 
        // arvojen verran. Muuttuja dx sisältää 
        // muutoksen koordinaattiin x, muuttuja 
        // dy sisältää muutoksen koordinaattiin y. 
        // Esimerkiksi jos muuttujan dx arvo on 5, 
        // tulee oliomuuttujan x arvoa kasvattaa viidellä
        this.x += dx;
        this.y += dy;
    }
    
    @Override
    public String toString() {
        // Luo ja palauttaa oliosta 
        // merkkijonoesityksen. 
        // Eliön merkkijonoesityksen tulee olla 
        // seuraavanlainen "x: 3; y: 6". 
        // Huomaa että koordinaatit on 
        // erotettu puolipisteellä (;)
        return "x: "+this.x+"; y: "+this.y;
    }
    
}
