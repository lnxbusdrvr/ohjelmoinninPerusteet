package harjoituksia;

import java.util.Scanner;

public class AANPisteetWhileAliReturn
{
	public static void main(String[] args)
	{
		int paluu, pisteet=1;
		
		paluu=LaskeYhteispist(pisteet);
		System.out.println("Yhteispistem‰‰r‰ on " +paluu+ "\n");
	}

	private static int LaskeYhteispist(int pisteet)
	{
		Scanner lukija=new Scanner(System.in);
		int tehtava=1, summa=0;
		
		System.out.println("\n");
		
		while(tehtava <=5)
		{
			System.out.println("Anna " +tehtava+ " teht‰v‰n pisteet: ");
			pisteet=lukija.nextInt();
			
			summa=summa+pisteet;
			tehtava++;
		}
		lukija.close();
		return summa;
	}
}
