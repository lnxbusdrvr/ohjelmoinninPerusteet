 package harjoituksia;
import java.util.Scanner;
public class ACLmenuEsim2 {

	public static void main(String[] args) {
		Scanner lukija=new Scanner(System.in);
		int valinta;
		double pituus = 0, leveys = 0, ala, pinta_ala, sivunPituus = 0;
		
		System.out.println("    Menu   ");
		System.out.println("1. Laske huoneen pinta-ala");
		System.out.println("2. Laske neliön ala");
		System.out.println("Anna valintasi: ");
		valinta=lukija.nextInt();
		
		switch (valinta) {
		case 1:
			ala=LaskeHuoneenPintaAla(pituus, leveys);
		    System.out.println("Huoneen pinta-ala: " +ala);
		    break;
	
		case 2: 
			pinta_ala=LaskeNelionAla(sivunPituus);
			System.out.println("Neliön ala on " +pinta_ala);
			break;
				 
		}
		lukija.close();
	}

	public static double LaskeNelionAla(double sivunPituus) {
		Scanner lukija=new Scanner(System.in);
		
		System.out.println("Anna neliön sivun pituus: ");
		sivunPituus=lukija.nextDouble();
		lukija.close();
		return sivunPituus*sivunPituus;
	}

	private static double LaskeHuoneenPintaAla(double pituus, double leveys) {
		Scanner lukija=new Scanner(System.in);
		System.out.println("Anna huoneen pituus: ");
		pituus=lukija.nextDouble();
		
		System.out.println("Anna huoneen leveys: ");
		leveys=lukija.nextDouble();
		
		lukija.close();
		return pituus*leveys;
		
	 
	}

}
