package harjoituksia;

import java.util.Scanner;

/* Tee ohjelma, jossa menussa kutsutaan kahta aliohjelmaa
 * - LempiVariAliohjelma
 * - AnnaSuiurempiLukuAliohjelma 
 */

public class ACJmenuAli
{

	public static void main(String[] args)
	{
		Scanner lukija=new Scanner(System.in);
		
		int valinta, variValinta=0, luku1=0, luku2=0, suurempi;
		
		System.out.println("");
		System.out.println("__Menu_________________");
		System.out.println("1. Lempiväri          |");
		System.out.println("2. Anna suurempi luku |");
		System.out.println("______________________|");
		
		System.out.print("Anna valintasi: ");
		valinta=lukija.nextInt();
		
		//while(jatketaanko == 'e' || jatketaanko =='E')
		if(valinta==1)
		{
			LempiVariAli(variValinta);
		}
		else if(valinta==2)
		{
			suurempi=AnnaSuurempiLukuAli(luku1, luku2);
			System.out.println("Suurempi luku oli " +suurempi);
		}
		else
		{
			System.out.println("Tarkista syöte");
		}
		lukija.close();
		
	}

	private static int AnnaSuurempiLukuAli(int luku1, int luku2)
	{
		Scanner lukija3=new Scanner(System.in);
		System.out.println("Anna kaksi lukua: ");
		luku1=lukija3.nextInt();
		luku2=lukija3.nextInt();
		lukija3.close();
		if(luku1>luku2) return luku1;
		else  return luku2;
		
	}

	private static void LempiVariAli(int variValinta)
	{
		Scanner lukija2=new Scanner(System.in);
		System.out.println("Valitse seuraavista väreistä lempiväri: ");
		System.out.println("1. Punainen \n 2. Sininen \n 3. Musta \n");
		
		System.out.println("Anna valinta: ");
		variValinta=lukija2.nextInt();
		
		switch(variValinta)
		{
			case 1:
				System.out.println("Lempivärisi on punainen.");
				break;
			
			case 2:
				System.out.println("Lempivärisi on sininen.");
				break;
				
			case 3:
				System.out.println("Lempivärisi on musta.");
				break;
				
			default:
				System.out.println("Tarkista valinta");
		}
		lukija2.close();
		
	}

}
