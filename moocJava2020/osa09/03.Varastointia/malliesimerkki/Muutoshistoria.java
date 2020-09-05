 
import java.util.ArrayList;
 
public class Muutoshistoria {
 
    private ArrayList<Double> tilanteet;
 
    public Muutoshistoria() {
        this.tilanteet = new ArrayList<>();
    }
 
    public void lisaa(double tilanne) {
        this.tilanteet.add(tilanne);
    }
 
    public void nollaa() {
        this.tilanteet.clear();
    }
 
    public double minArvo() {
        double min = this.tilanteet.get(0);
        for (Double d : this.tilanteet) {
            if (min > d) {
                min = d;
            }
        }
        return min;
    }
 
    public double maxArvo() {
        double max = this.tilanteet.get(0);
        for (Double d : this.tilanteet) {
            if (max < d) {
                max = d;
            }
        }
        return max;
    }
 
    public double keskiarvo() {
        if (this.tilanteet.isEmpty()) {
            return 0;
        }
 
        double summa = 0;
        for (Double muutos : this.tilanteet) {
            summa = summa + muutos;
        }
 
        return summa / this.tilanteet.size();
    }
 
    @Override
    public String toString() {
        return tilanteet.toString();
    }
}
 
