 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
 
public class Lukutaitovertailu {
    
    public static void main(String[] args) {
 
        ArrayList<Tulos> tulokset = new ArrayList<>();
        try {
            Files.lines(Paths.get("lukutaito.csv"))
                    .map(l -> l.split(","))
                    .map(a -> new Tulos(a[2].replace("(%)", "").trim(), a[3], Integer.valueOf(a[4]), Double.parseDouble(a[5])))
                    .forEach(t -> tulokset.add(t));
        } catch (IOException ex) {
            System.out.println("Virhe tiedoston käsittelyssä.");
        }
        
        tulokset.stream().sorted((t1, t2) -> {
            if (t1.getLukutaitoprosentti() > t2.getLukutaitoprosentti()) {
                return 1;
            }
            if (t1.getLukutaitoprosentti() < t2.getLukutaitoprosentti()) {
                return -1;
            }
            return 0;
        }).forEach(t -> System.out.println(t));
    }
}
 
