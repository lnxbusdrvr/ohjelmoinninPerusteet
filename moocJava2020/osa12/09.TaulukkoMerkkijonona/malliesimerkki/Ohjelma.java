 
public class Ohjelma {
 
    public static void main(String[] args) {
        // Testaa metodiasi täällä
    }
 
    public static String taulukkoMerkkijonona(int[][] taulukko) {
        StringBuilder sb = new StringBuilder();
        for (int rivi = 0; rivi < taulukko.length; rivi++) {
            for (int sarake = 0; sarake < taulukko[rivi].length; sarake++) {
                sb.append(taulukko[rivi][sarake]);
            }
            sb.append("\n");
        }
 
        return sb.toString();
    }
}
 
