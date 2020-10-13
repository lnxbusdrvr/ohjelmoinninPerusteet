
import java.util.Arrays;


public class Ohjelma {

    public static void main(String[] args) {
        // Testaa metodiasi täällä
        int[][] taulu = {{1, 2, 3},
                        {4, 5, 6, 7},
                        {8, 9},
                        {0, 11}};
        System.out.println(taulukkoMerkkijonona(taulu));
        
        /*for(int i = 0; i < taulu.length; i++) {
            for( int j = 0; j < taulu[i].length; j++) {
                System.out.println(taulu[i]+","+taulu[j]);
            }
        }*/
        
    }
    
    public static String taulukkoMerkkijonona(int[][] taulukko) {
        StringBuilder mjono = new StringBuilder();
        
        if(taulukko.length > 0) {
            for(int rivi = 0; rivi < taulukko.length; rivi++) {
                for( int alkio = 0; alkio < taulukko[rivi].length; alkio++) {
                    mjono.append(taulukko[rivi][alkio]);
                }
                //Rivin loppu
                //Lisätään uusi rivi
                mjono.append("\n");
            }
        }
        // purkkaviritys:
        //return ""+mjono
        // Oikea tapa
        return mjono.toString();
    }


}
