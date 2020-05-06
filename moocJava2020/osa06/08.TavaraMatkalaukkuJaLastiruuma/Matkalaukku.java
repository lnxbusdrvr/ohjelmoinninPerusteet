
import java.util.ArrayList;

public class Matkalaukku {
    private int maksimipaino;
    private ArrayList<Tavara> matkalaukku;
    
    public Matkalaukku(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.matkalaukku = new ArrayList<>();
    }
    
    public void lisaaTavara(Tavara tavara) {
        if(tavara.getPaino() + this.yhteispaino() <= this.maksimipaino) {
            this.matkalaukku.add(tavara);
        }
    }
    
    public void tulostaTavarat() {
      /*String tulosta = "";
        for(Tavara laukku : this.matkalaukku) {
            tulosta += laukku.getNimi()+" ("+laukku.getPaino()+" kg)\n";
        }
        return tulosta;*/
        for(Tavara laukku : this.matkalaukku) {
            System.out.println(laukku.getNimi()+" ("+laukku.getPaino()+" kg)");
        }
    }
    
    public int yhteispaino() {
        int kilot = 0;
        for(Tavara laukku : this.matkalaukku) {
            kilot += laukku.getPaino();
        }
        return kilot;
    }
    
    public Tavara raskainTavara() {
        if(this.matkalaukku.isEmpty()) {
            return null;
        }
        Tavara indexinEka = this.matkalaukku.get(0);
        
        for(Tavara laukku : this.matkalaukku) {
            if(indexinEka.getPaino() < laukku.getPaino()) {
                indexinEka = laukku;
            }
        }
        return indexinEka;
    }
    
    public String toString() {
        if(this.matkalaukku.isEmpty()) {
            return "ei tavaroita (0 kg)";
        }
        if(this.matkalaukku.size() == 1) {
            return "1 tavara ("+this.yhteispaino()+" kg)";
        }
        int kerrat = 0;
        int kilot = 0;
        String tulostus = "";
        for(Tavara laukku : this.matkalaukku) {
            kerrat++;
            kilot += laukku.getPaino();
        }
        return kerrat+" tavaraa ("+kilot+" kg)";
    }
}
