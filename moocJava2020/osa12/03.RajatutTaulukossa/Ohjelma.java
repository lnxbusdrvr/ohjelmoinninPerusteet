
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
        
        /*int[] luvut = {3, -1, 8, 4};

        System.out.println(summa(luvut, 0, 0, 0, 0));
        System.out.println(summa(luvut, 0, 0, 0, 10));
        System.out.println(summa(luvut, 0, 1, 0, 10));
        System.out.println(summa(luvut, 0, 1, -10, 10));
        System.out.println(summa(luvut, -1, 999, -10, 10));*/
        
        /* 
        int[] arvot = {8, 2, 9, 1, 1};
        System.out.println(summa(arvot, 0, arvot.length, 0, 999)); // 21
        */
        
        int[] arvot = {8, -2, 3, 1, 1};
        System.out.println(summa(arvot, 0, arvot.length, 0, 999)); // 13

    }
    
    public static int summa(int[] taulukko, int mista, int mihin, int pienin, int suurin) {
        // Metodin tulee laskea sille parametrina annetusta 
        // taulukosta indeksien mista ja mihin välillä olevien 
        // arvojen summa. Summaan otetaan mukaan vain ne arvot, 
        // jotka ovat suurempia tai yhtäsuuria kuin pienin ja pienempiä 
        // kuin suurin.
        int summa = 0;
        // Debug:
        // System.out.println("Mista: "+mista+", mihin: "+mihin
        //+", pienin: "+pienin+", suurin: "+suurin);
        if(mista < 0 ) {
            mista = 0;
        }
        if(mihin > taulukko.length) {
            mihin = taulukko.length;
        }
        for(int i=mista;i < mihin; i++) {
            // suurempia tai yhtäsuuria kuin pienin 
            //                      ja pienempiä kuin suurin.
            if(taulukko[i] >= pienin && taulukko[i] < suurin) {
                summa += taulukko[i];
            }            
        }
        return summa;
    }
    
}
