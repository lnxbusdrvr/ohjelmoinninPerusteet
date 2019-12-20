package harjoituksia;

import java.util.Scanner;

/* Tee ohjelma, joka kyselee käyttäjältä
 * kolme lukua, laskee niistä kaksi ensimmäistä
 * yhteen ja vähtentää viimeisen
 * Lisätehtävä laskea keskiarvo kahden desimaalin tarkuudella
 */

public class ABYkolmeLukua
{

	public static void main(String[] args)
	{
		Scanner lukija=new Scanner(System.in);
		
		int luku1, luku2, luku3, yht;
		double keskiArvo;
		//int vahennys;
		
		System.out.println("Syötä ensimmäinen luku: ");
		luku1=lukija.nextInt();
		
		System.out.println("Syötä toinen luku: ");
		luku2=lukija.nextInt();
		
		System.out.println("Syötä kolmas luku: ");
		luku3=lukija.nextInt();
		
		yht=luku1+luku2;
		//vahennys=yht-luku3;
		
		System.out.println("Ensimmäisen ja toisen luvun summa on "+yht);
		System.out.println("Siitä vähennetään kolmas luku, jolloin summaksi tulee "+(yht-luku3));	//Näin voi laskea Syso:n sisällä
		
		keskiArvo=(luku1+luku2+luku3)/3;
		System.out.printf("Kaikkien luvujen keskiarvo on %.2f", keskiArvo);
		
		

	}

}
