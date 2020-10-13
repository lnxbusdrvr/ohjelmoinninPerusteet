 
import java.util.ArrayList;
import java.util.Random;
 
public class Lottorivi {
 
    private ArrayList<Integer> numerot;
 
    public Lottorivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.arvoNumerot();
    }
 
    public ArrayList<Integer> numerot() {
        return this.numerot;
    }
 
    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        // Kirjoita numeroiden arvonta tänne
        // kannattanee hyödyntää metodia sisaltaaNumeron
        Random random = new Random();
 
        while (this.numerot.size() < 7) {
            int uusiNumero = random.nextInt(40) + 1;
            boolean numeroOliJoArvottu = this.sisaltaaNumeron(uusiNumero);
 
            // Lisätään uusi numero vain, jos se ei ole jo arvottujen joukossa
            if (!numeroOliJoArvottu) {
                this.numerot.add(uusiNumero);
            }
        }
    }
 
    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        return this.numerot.contains(numero);
    }
}
 
