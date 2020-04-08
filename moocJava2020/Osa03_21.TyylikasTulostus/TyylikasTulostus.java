
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        //int[] taulukko = {5, 1, 3, 4, 2};
        int[] taulukko = {5};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
        int i = 0;
        for(i = 0; i < taulukko.length -1;i++) {
            if(i == taulukko.length) {
                break;
            }
            System.out.print(taulukko[i]+", ");
        }
        System.out.print(taulukko[i]);
    }
}
