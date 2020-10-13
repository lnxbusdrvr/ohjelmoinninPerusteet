 
import java.util.Scanner;
 
public class Ohjelma {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
 
    }
 
    public static int summa(int[] taulukko, int mista, int mihin, int pienin, int suurin) {
        if (mista < 0) {
            mista = 0;
        }
 
        if (mihin > taulukko.length) {
            mihin = taulukko.length;
        }
 
        int summa = 0;
        for (int i = mista; i < mihin; i++) {
            if (taulukko[i] < pienin || taulukko[i] > suurin) {
                continue;
            }
 
            summa = summa + taulukko[i];
        }
        
        return summa;
    }
}
 
