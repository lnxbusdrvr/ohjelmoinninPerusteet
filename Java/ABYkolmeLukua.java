package harjoituksia;

import java.util.Scanner;

/* Tee ohjelma, joka kyselee k�ytt�j�lt�
 * kolme lukua, laskee niist� kaksi ensimm�ist�
 * yhteen ja v�htent�� viimeisen
 * Lis�teht�v� laskea keskiarvo kahden desimaalin tarkuudella
 */

public class ABYkolmeLukua
{

	public static void main(String[] args)
	{
		Scanner lukija=new Scanner(System.in);
		
		int luku1, luku2, luku3, yht;
		double keskiArvo;
		//int vahennys;
		
		System.out.println("Sy�t� ensimm�inen luku: ");
		luku1=lukija.nextInt();
		
		System.out.println("Sy�t� toinen luku: ");
		luku2=lukija.nextInt();
		
		System.out.println("Sy�t� kolmas luku: ");
		luku3=lukija.nextInt();
		
		yht=luku1+luku2;
		//vahennys=yht-luku3;
		
		System.out.println("Ensimm�isen ja toisen luvun summa on "+yht);
		System.out.println("Siit� v�hennet��n kolmas luku, jolloin summaksi tulee "+(yht-luku3));	//N�in voi laskea Syso:n sis�ll�
		
		keskiArvo=(luku1+luku2+luku3)/3;
		System.out.printf("Kaikkien luvujen keskiarvo on %.2f", keskiArvo);
		
		

	}

}
