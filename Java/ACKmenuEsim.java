package harjoituksia;
import java.util.Scanner;
public class ACKmenuEsim {

	public static void main(String[] args) {
		Scanner lukija=new Scanner(System.in);
		int valinta;
	 		
		System.out.println("    Menu   ");
		System.out.println("1. Laske huoneen pinta-ala");
		System.out.println("2. Laske neliön ala");
		System.out.println("Anna valintasi: ");
		valinta=lukija.nextInt();
		
		switch (valinta) {
		case 1:
			LaskeHuoneenPintaAla();
		 
		    break;
	
		case 2: 
			LaskeNelionAla();
		 
			break;
		 
		}
	
		lukija.close();
	}

	public static void LaskeNelionAla() {
		Scanner lukija=new Scanner(System.in);
		double sivunPituus;
		System.out.println("Anna neliön sivun pituus: ");
		sivunPituus=lukija.nextDouble();
		System.out.println("Neliön ala on " +sivunPituus*sivunPituus);
		lukija.close();
		 
	}
 
	public static void LaskeHuoneenPintaAla() {
		Scanner lukija=new Scanner(System.in);
		double pituus, leveys;
		System.out.println("Anna huoneen pituus: ");
		pituus=lukija.nextDouble();
		
		System.out.println("Anna huoneen leveys: ");
		leveys=lukija.nextDouble();
		System.out.println("Huoneen pinta-ala: " +pituus*leveys);
		lukija.close();
	 
		
	 
	}

}
