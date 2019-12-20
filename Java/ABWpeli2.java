package harjoituksia;
import java.util.Scanner;
/*Kivi voittaa sakset, sakset paperin ja paperi kiven*/
public class ABWpeli2 {

	public static void main(String[] args){
        int pisteet = 0;
        String vastaus = null;
        Scanner lukija = new Scanner(System.in);

        while (true){
            System.out.printf("Pistetilanne: %d%n", pisteet);
            System.out.println("Kivi, paperi vai sakset?");

            String vastustaja = satunnainenKPS();

            boolean vastausOK=false;
            while (!vastausOK){
                vastaus = lukija.nextLine();
                if (vastaus.equals("")){
                    System.out.println("Peli loppu.");
                    return;
                }
                if (vastaus.equals("kivi") 
                        || vastaus.equals("paperi") 
                        || vastaus.equals("sakset")){
                    vastausOK = true;
                } else {
                    System.out.println("Kirjoita kokonaan 'kivi', 'paperi' tai 'sakset'");
                    System.out.println("käyttämällä pieniä kirjaimia.");
                }
            }

            System.out.println("Vastustajallasi oli: " + vastustaja);
            int voittaja = saannotKumpiVoittaa(vastaus, vastustaja);
            if (voittaja == 1){
                pisteet++;
            } else if (voittaja == 2){
                pisteet--;
            } else {
                /* Muutoin tasapeli */
            }
// lukija.close();
        }
       
    }
	 /** Kertoo, kumpi voittaa kivi-paperi-sakset -taistelun.
    * @param a pelaajan nro 1 vastaus merkkijonona
    * @param b pelaajan nro 2 vastaus merkkijonona
    * @return  1=pelaaja nro 1 voittaa; 2=pelaaja 2 voittaa; 0=tasapeli
    */
    public static int saannotKumpiVoittaa(String a, String b){
    	
        if (a.equals("kivi") && b.equals("sakset")){
            return 1;
        }
        if (a.equals("sakset") && b.equals("paperi")){
            return 1;
        }
        if (a.equals("paperi") && b.equals("kivi")){
            return 1;
        }
        if (b.equals("kivi") && a.equals("sakset")){
            return 2;
        }
        if (b.equals("sakset") && a.equals("paperi")){
            return 2;
        }
        if (b.equals("paperi") && a.equals("kivi")){
            return 2;
        }
        return 0;
    	    	
    }

    /** Tuottaa satunnaisesti merkkijonon "kivi" "paperi" tai "sakset" */
    public static String satunnainenKPS(){
        double luku = Math.random()*3.0;
        if (luku < 1) return "kivi";
        if (luku < 2) return "paperi";
        return "sakset";
    }

}
    