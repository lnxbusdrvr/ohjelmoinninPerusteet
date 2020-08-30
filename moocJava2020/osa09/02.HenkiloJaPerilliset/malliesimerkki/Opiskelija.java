 
public class Opiskelija extends Henkilo {
 
    private int op;
 
    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
    }
 
    public int opintopisteita() {
        return op;
    }
 
    public void opiskele() {
        this.op = this.op + 1;
    }
 
    @Override
    public String toString() {
        return super.toString() + "\n  opintopisteitä " + op;
    }
 
}
 
