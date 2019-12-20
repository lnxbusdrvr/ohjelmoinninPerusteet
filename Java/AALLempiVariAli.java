package harjoituksia;

import java.util.Scanner;

public class AALLempiVariAli
{
	public static void main(String[] args)
	{
		Vari();
		

	}

	private static void Vari()
	{
		Scanner lukija=new Scanner(System.in);
		int valinta;
		
		System.out.println("Valitse seuraavista väreistä lempiväri: ");
		System.out.println("1. Punainen \n 2. Sininen \n 3. Musta \n");
		
		System.out.println("Anna valinta: ");
		valinta=lukija.nextInt();
		
		switch(valinta)
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
		lukija.close();
		
	}

}
