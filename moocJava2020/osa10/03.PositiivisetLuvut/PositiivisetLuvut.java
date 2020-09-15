
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiivisetLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        // testaa metodia täällä

    }
    
    public static List<Integer> positiiviset(List<Integer> luvut) {
        // saa parametrinaan lukulistan ja jonka tulee palauttaa 
        // uusi lukulista, joka sisältää parametrina saadun listan 
        // sisältämät positiiviset luvut.
        List<Integer> posit = luvut.stream()
                .filter(luku -> luku > 0)
                .map(luku -> luku)
                .collect(Collectors.toCollection(ArrayList::new));
        return posit;
    }

}
