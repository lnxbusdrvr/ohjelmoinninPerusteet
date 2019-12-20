package harjoituksia;

import java.util.Scanner;

/* Tee ohjelma, jonka aliohjelma(metodi) palauttaa tuotteen
 * arvonlisänverllisen hinnan, kun sille annetaan parametrina tuotteen
 * veroton hinta
 * Määrittele alv-prosentti vakiona.
 * algoritmia:
 * pääohjelmassa esittele muuttujat
 * kutsu aliohjelmaa, joka palauttaa jotain ja saa yhden parametrin
 * tulosta tuotteen alvillinen hinta
 * aliohjelmassa pyydä käyttäjältä tuotteen hinta, ota vastaan
 * return lauseessa lasketaan alvillinen hinta.
 */

public class ABOalv
{

	public static void main(String[] args)
	{
		double verollinenHinta, verotonHinta =0;
		verollinenHinta=palautaAlv(verotonHinta);
		
		System.out.println("Verollinen hinta on: \n"+verollinenHinta+"€");
	}

	private static double palautaAlv(double verotonHinta)
	{
		Scanner lukija=new Scanner(System.in);
		System.out.println("Syötä veroton hinta");
		verotonHinta=lukija.nextDouble();
		
		final double ALV=1.24;
		lukija.close();
		
		return verotonHinta*ALV;
	}

}
