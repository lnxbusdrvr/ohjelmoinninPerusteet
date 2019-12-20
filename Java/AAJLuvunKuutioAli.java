package harjoituksia;

import java.util.Scanner;

public class AAJLuvunKuutioAli
{
	public static void main(String[] args)
	{
		//Aliohjelman kutsu
		LuvunKuutio();
	}

	//Aliohjelma
	private static void LuvunKuutio()
	{
		Scanner lukija=new Scanner(System.in);
		int luku, kuutio;
		
		System.out.println("Anna luku: ");
		luku=lukija.nextInt();
		
		kuutio=luku*luku*luku;
		
		System.out.println("Luvun kuutio on " +kuutio);
		lukija.close();
	}
	
}
