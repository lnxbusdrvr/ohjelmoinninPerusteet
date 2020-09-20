
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        
        List<Lukutaito> lukutaito = new ArrayList<>();
        
        try{
            Files.lines(Paths.get("lukutaito.csv"))
                    .map(rivi -> rivi.split(","))
                    //.filter(palat -> palat.length >= 4)
                    // teema, ikäryhmä, sukupuoli, maa, vuosi, lukutaitoprosentti
                    // Adult[0], population 15+ years[1], female (%)[2],Zimbabwe[3],2015[4],85.28513[5]
                    // Haluamme nämä: maa[3], vuosi[4], sukupuoli[2], prosentti[5]
                    .map(palat -> new Lukutaito(palat[3], 
                            Integer.valueOf(palat[4]), 
                            palat[2].replace("(%)", "").trim(), 
                            Double.parseDouble(palat[5])))
                   .forEach(lisaaLtaito -> lukutaito.add(lisaaLtaito));
        }catch(Exception e) {
            System.out.println("Virhe: "+e.getMessage());
        }
        /* Ei toimi:
        lukutaito.stream().sorted((l1, l2) -> {
            return l2.getProsentti() - l1.getProsentti();
        }).forEach(l -> System.out.println(l));*/
        lukutaito.stream()
                .sorted(Comparator.comparingDouble(Lukutaito::getProsentti))
                .forEach(l -> System.out.println(l));
        
    }
    
}
