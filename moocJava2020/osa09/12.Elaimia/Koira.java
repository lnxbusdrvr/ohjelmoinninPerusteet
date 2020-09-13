

/**
 *
 * @author lnxbusdrvr
 */
public class Koira extends Elain {

    public Koira(String nimi) {
        super(nimi);
    }

    public Koira() {
        super("Koira");
    }
    
    public void hauku() {
        System.out.println(super.getNimi()+" haukkuu");
    }
    
    
    
    
    
}
