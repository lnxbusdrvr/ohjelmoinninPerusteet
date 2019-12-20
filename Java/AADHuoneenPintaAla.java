package harjoituksia;

import java.util.Scanner;

public class AADHuoneenPintaAla {

	public static void main(String[] args)
	{
		Scanner lukija=new Scanner(System.in);
		double pituus, leveys, ala;
		
		System.out.println("Anna huoneen pituus: ");
		pituus=lukija.nextDouble();
		
		System.out.println("Anna huoneen leveys: ");
		leveys=lukija.nextDouble();
		
		ala=pituus*leveys;
		
		System.out.println("Huoneen pinta-ala: " +ala);
		
		lukija.close();

	}

}
