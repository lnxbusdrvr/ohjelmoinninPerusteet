
import java.util.ArrayList;

public class Lastiruuma {
    private int maksimipaino;
    private ArrayList<Matkalaukku> ruuma;
    
    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.ruuma = new ArrayList<>();
    }
    
    public void lisaaMatkalaukku(Matkalaukku matkalaukku) {
        if(matkalaukku.yhteispaino() +  
                this.yhteispaino() <= this.maksimipaino) {
            this.ruuma.add(matkalaukku);
        }
    }
    
    public int yhteispaino() {
        int kilot = 0;
        for(Matkalaukku laukku : this.ruuma) {
            kilot += laukku.yhteispaino();
        }
        return kilot;
    }
    
    public void tulostaTavarat() {
        int i = 0;
        // Matkalaukku-luokassa on myös
        // tulostaTavarat()
        for(Matkalaukku laukku : this.ruuma) {
            laukku.tulostaTavarat();
        }
    }
    
    public String toString() {
        if(this.ruuma.isEmpty()) {
            return null;
        }
        if(this.ruuma.size() == 1) {
            return "1 matkalaukku ("+this.yhteispaino()+" kg)";
        }
        int kerrat = 0;
        int kilot = 0;
        String tulostus = "";
        for(Matkalaukku laukku : this.ruuma) {
            kerrat++;
            kilot += laukku.yhteispaino();
        }
        return kerrat+" matkalaukkua ("+kilot+" kg)";
    }
}
