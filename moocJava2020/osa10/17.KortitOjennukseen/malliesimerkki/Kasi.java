 
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Kasi implements Comparable<Kasi> {
 
    private List<Kortti> kortit;
 
    public Kasi() {
        this.kortit = new ArrayList<>();
    }
 
    public void lisaa(Kortti kortti) {
        kortit.add(kortti);
    }
 
    public void tulosta() {
        for (Kortti kortti : kortit) {
            System.out.println(kortti);
        }
    }
 
    public void jarjesta() {
        Collections.sort(kortit);
    }
 
    public void jarjestaMaittain() {
        Collections.sort(kortit, new SamatMaatVierekkainArvojarjestykseen());
    }
 
    private int arvojenSumma() {
        int summa = 0;
 
        for (Kortti kortti : kortit) {
            summa += kortti.getArvo();
        }
 
        return summa;
    }
 
    @Override
    public int compareTo(Kasi kasi) {
        return this.arvojenSumma() - kasi.arvojenSumma();
    }
}
