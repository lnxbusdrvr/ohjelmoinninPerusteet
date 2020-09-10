 
import java.util.ArrayList;
 
public class Laatikko implements Talletettava {
 
    private ArrayList<Talletettava> esineet;
    private double maxPaino;
 
    public Laatikko(double paino) {
        this.maxPaino = paino;
        this.esineet = new ArrayList<>();
    }
 
    @Override
    public double paino() {
        double paino = 0;
        for (Talletettava talletettava : this.esineet) {
            paino = paino + talletettava.paino();
        }
        return paino;
    }
 
    public void lisaa(Talletettava esine) {
        if (this.paino() + esine.paino() <= this.maxPaino) {
            this.esineet.add(esine);
        }
    }
 
    @Override
    public String toString() {
        return "Laatikko: " + this.esineet.size() + " esinettä, paino yhteensä " + this.paino() + " kiloa";
    }
}
 
