
public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
    }
    
    public static int pienin(int[] taulukko) {
        
        int pienin = taulukko[0];
        
        for(int i : taulukko) {
            if(i<pienin) {
                pienin = i;
            }
        }
        return pienin;        
    }
    
    public static int pienimmanIndeksi(int[] taulukko) {
        int pieninIdx = 0;
        for(int i = 0; i < taulukko.length; i++) {
            int indexinLuku = taulukko[i];
                
            if(indexinLuku == pienin(taulukko)) {
                pieninIdx=i;
            }
        }
        return pieninIdx;    
    }
    
}
