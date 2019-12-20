package harjoituksia;

import java.util.Scanner;

public class AAPTaulukko2
{
	public static void main(String[] args)
	{
		Scanner lukija=new Scanner(System.in);
		
		System.out.println("Taulukon koko(m‰‰r‰): ");
		int koko=lukija.nextInt();
		
		//Taulukon luonti
		
		int [] luvut=new int[koko];
	
		//otetaan vastaan annetut luvut
		for(int i=0; i<luvut.length; i++)
		{
			System.out.println("Anna taulukon " +i+ " alku: ");
			luvut[i]=lukija.nextInt();
		}

		//Tulostetaan annetut luvut
		for(int i=0; i<luvut.length; i++)
		{
			System.out.println(luvut[i]);
		}
		lukija.close();
	}

}
