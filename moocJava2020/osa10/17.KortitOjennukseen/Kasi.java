
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author lnxbusdrvr
 */
public class Kasi implements Comparable<Kasi> {
    private List<Kortti> kasi;

    public Kasi() {
        this.kasi = new ArrayList<>();
    }
    
    public void lisaa(Kortti kortti) {
        // lisää käteen kortin
        this.kasi.add(kortti);
    }
    
    public void tulosta() {
        // tulostaa kädessä olevat kortit 
        // alla olevan esimerkin tyylillä
        this.kasi.stream().forEach(k -> System.out.println(k));
    }
    
    public void jarjesta() {
        // risti[0], ruutu[1], hertta[2], pata[3]
        Collections.sort(kasi);
    }
    
    public int summa() {        
        int summa = 0;
        summa = this.kasi.stream()
                .map(Kortti::getArvo)
                .reduce(summa, Integer::sum);
        return summa;
    }

    @Override
    public int compareTo(Kasi t) {
        return this.summa()-t.summa();
    }
    
}
