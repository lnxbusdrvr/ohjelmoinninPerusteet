package harjoituksia;

public class ACHnoppa2{

    public static void main (String[] args){
      int[] noppa = new int[10]; // luodaan taulukko

      // heitet‰‰n noppaa 10 kertaa
      for (int i=0; i < noppa.length; i++){
        noppa[i]=1+(int) (Math.random()*6);// tulos taulukkoon
      }

      // J‰rjestet‰‰n taulukon sis‰lt‰∂
      java.util.Arrays.sort(noppa);

      // Tulostetaan taulukon sis‰lt‰∂
      for (int i=0; i < noppa.length; i++){
        System.out.print(" " + noppa[i]);
      }
    }
}
