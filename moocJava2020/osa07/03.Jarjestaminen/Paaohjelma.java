
public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
        
        System.out.println("Pienin: " + Paaohjelma.pienin(taulukko));
        System.out.println("Pienimmän indeksi: " + Paaohjelma.pienimmanIndeksi(taulukko));
        System.out.println(Paaohjelma.pienimmanIndeksiAlkaen(taulukko, 0));
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
    
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int idx = aloitusIndeksi;
        int pienin = taulukko[aloitusIndeksi];
                
        for(int i = aloitusIndeksi; i < taulukko.length; i++) {                
            if(taulukko[i] < pienin) {
                pienin=taulukko[i];
                idx=i;
            }
        }
        return idx;
    }
    
}
