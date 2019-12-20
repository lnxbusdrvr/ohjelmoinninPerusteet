package harjoituksia;

import java.util.Scanner;

public class AAEHuoneenPintaAli
{
	public static void main(String[] args)
	{
		double ala, pituus = 0, leveys = 0;
		// aliohjelman kutsu
		ala=LaskePa(pituus, leveys);
		
		System.out.println("Huoneen pinta-ala: " +ala);
		

	}

	private static double LaskePa(double leveys, double pituus) {
		Scanner lukija=new Scanner(System.in);
				
		System.out.println("Anna huoneen pituus: ");
		pituus=lukija.nextDouble();
		
		System.out.println("Anna huoneen leveys: ");
		leveys=lukija.nextDouble();
		
		lukija.close();
		
		return pituus*leveys;
	}

}
