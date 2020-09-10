
import java.util.ArrayList;


/**
 *
 * @author lnxbusdrvr
 */
public class Laatikko implements Talletettava {
    
    private double maksimikapasiteetti;
    private ArrayList<Talletettava> talletettava;
    
    public Laatikko(double maksimikapasiteetti) {
        this.maksimikapasiteetti = maksimikapasiteetti;
        this.talletettava = new ArrayList<>();
    }
    
    public void lisaa(Talletettava talletettava) {
        if(paino() + talletettava.paino() > this.maksimikapasiteetti) {
            return;
        }
        this.talletettava.add(talletettava);
    }

    @Override
    public double paino() {
        double yhteispaino = 0.0;
        for(Talletettava tallete : this.talletettava) {
            yhteispaino += tallete.paino();
        }
        return yhteispaino;
    }
    
    @Override
    public String toString() {
        return "Laatikko: "+this.talletettava.size()+
                " esinettä, paino yhteensä "
                +paino()+
                " kiloa";
    }
    
    
}
