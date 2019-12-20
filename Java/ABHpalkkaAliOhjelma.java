package harjoituksia;

import java.util.Scanner;

/*Ohjelma laskee k�ytt�j�n bruttopalkan, veronm��r�n ja nettopalkan(=3 aliohjelmaa)
 * k�ytt�j�lt� tarvitaan seuraavat tiedot:
 * tehdyt tunnit
 * tuntipalkka
 * veroprosentti
 * Laskukaavat:
 * bruttoPalkka=tehdysTunnit*tuntiPalkka
 * veronMaara=(tehdytTunnit*tuntiPalkka*veroProsentti)/100
 * nettoPalkka=bruttoPalkka-veronMaara
 * 
 * 
 */

public class ABHpalkkaAliOhjelma
{

	public static void main(String[] args)
	{
		Scanner lukija=new Scanner(System.in);
		double veroPros, tehTunnit=0, tuntiPalkka=0;
		double bruttoPalkka, veroMaara, nettoPalkka;
		
		//Alkumenu
		System.out.println();
		System.out.println("Palkkalaskuri");
		System.out.println("-------------");
		
		//Kysyt��n tehdyt tunnit
		System.out.println("Sy�t� tehdyt tunnit: ");
		tehTunnit=lukija.nextDouble();
				
		//Kysyt��n tuntipalkka
		System.out.println("Sy�t� tuntipalkkasi: ");
		tuntiPalkka=lukija.nextDouble();
		
		//Kysyt��n veroprosentti
		System.out.println("Sy�t� veroprosenttisi: ");
		veroPros=lukija.nextDouble();
		
				
		bruttoPalkka=LaskeBruttoPalkka(tehTunnit, tuntiPalkka);
		veroMaara=LaskeVeronMaara(bruttoPalkka, veroPros);
		nettoPalkka=LaskeNettoPalkka(bruttoPalkka, veroMaara);
		
		System.out.printf("Bruttopalkkasi on: %.2f �\n", bruttoPalkka);
		System.out.printf("Veroa v�hennet��n %.2f � verran.\n",veroMaara);
		System.out.printf("Nettopalkkasi on: %.2f �",nettoPalkka);
		
		lukija.close();
		

	}

	private static double LaskeBruttoPalkka(double tehTunnit, double tuntiPalkka)
	{
		return tehTunnit*tuntiPalkka;
	}

	private static double LaskeVeronMaara(double bruttoPalkka, double veroPros)
	{
		return (bruttoPalkka*veroPros)/100;
	}

	private static double LaskeNettoPalkka(double bruttoPalkka, double veroMaara)
	{
		return bruttoPalkka-veroMaara;
	}

	

}
