
import java.util.ArrayList;

/**
 *
 * @author lnxbusdrvr
 */
public class LavistajaDebug {
    public static void main(String[] args) {
        int[][] nelio;
        // Debug:
        nelio = new int[3][3];
        // {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        nelio[0][0] = 1;
        nelio[0][1] = 2;
        nelio[0][2] = 3;
        
        nelio[1][0] = 4;
        nelio[1][1] = 5;
        nelio[1][2] = 6;
        
        nelio[2][0] = 7;
        nelio[2][1] = 8;
        nelio[2][2] = 9;
        ArrayList<Integer> lista = new ArrayList<>();
        int summa = 0;
        int rivi = 0;
        int sarake = 0;
        for(rivi = 0; rivi < nelio.length; rivi++) {
                System.out.println("Lisätään summa; "+nelio[rivi][sarake]);
                summa += nelio[rivi][sarake];
                sarake++;
        }
        System.out.println("Summaksi tuli: "+summa);
        lista.add(summa);
        summa = 0;
        
        // Toisin päin
        for(rivi = 0; rivi < nelio.length; rivi++) {
            for(sarake = nelio.length-1; sarake > 0; sarake--) {
                System.out.println("Lisätään toinen summa; "+nelio[sarake][rivi]);
                summa += nelio[sarake][rivi];
                rivi++;
                
            }
            summa += nelio[sarake][rivi];
        }
        System.out.println("Summaksi tuli: "+summa);
        lista.add(summa);
    }
    
}

