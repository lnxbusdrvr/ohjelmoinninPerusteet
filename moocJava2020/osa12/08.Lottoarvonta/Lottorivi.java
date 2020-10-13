
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Lottorivi {

    private ArrayList<Integer> numerot;
    private Random rndm;

    public Lottorivi() {
        //Ei auta:
        //this.numerot = new ArrayList<>();
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        // Numeroiden alustus virran sisällä
        //this.numerot = new ArrayList<>();
        // Kirjoita numeroiden arvonta tänne
        // kannattanee hyödyntää metodia sisaltaaNumeron
        this.rndm = new Random();
        //                       ints(mista, mihin)
        this.numerot = this.rndm.ints(1, 41)
                .distinct()
                .limit(7)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        
        //for(int nrot : this.numerot) {
        for(int i = 0; i < this.numerot.size(); i++) {
            if(this.numerot.get(i) == numero) {
            // Debug:
            //System.out.println("this.numero: "+this.numerot.get(i)
            //+", vertailu_numero: "+numero+"   koko: "
            //+this.numerot.size()+" onko totta: "
            //+(this.numerot.get(i) == numero));
                return true;
            }
        }
        return false;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int nro: this.numerot) {
            sb.append(nro+", ");
        }
        return "Lottonumerot: \n"+sb; 
    }
}
