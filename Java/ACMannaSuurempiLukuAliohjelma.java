package harjoituksia;

import java.util.Scanner;

/*Ohjelma tutkii kumpi k�ytt�j�n antamista luvuista on suurempi*/
public class ACMannaSuurempiLukuAliohjelma {

	public static void main(String[] args) {
	 /*esitell��n muuttujat
	  * kutsutaan aliohjelmaa
	  * tulostetaan suurempi luku
	  * */
		int luku1=0, luku2=0, suurempi;
		
		suurempi=AnnaSuurempi(luku1, luku2);
		System.out.println("Suurempi luku oli " +suurempi);
		
		
	}
	/*T�h�n aliohjelman toteutus:
	 * pyydet��n luvut ja otetaan ne vastaan
	 * tutkitaan if-else-rakenteella kumpi luvuista on suurempi
	 * palautetaan suurempi luku kutsuvaan aliohjelmaan
	 * */

	private static int AnnaSuurempi(int luku1, int luku2) {
		Scanner lukija=new Scanner(System.in);
		System.out.println("Anna kaksi lukua: ");
		luku1=lukija.nextInt();
		luku2=lukija.nextInt();
		lukija.close();
		if(luku1>luku2) return luku1;
		else  return luku2;
		
		
		
	}
	
}
