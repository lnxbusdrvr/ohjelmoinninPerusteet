package harjoituksia;

import java.util.Scanner;

public class AAMPisteetWhileAli
{
	public static void main(String[] args)
	{
		pisteet();
	}

	private static void pisteet()
	{
		Scanner lukija=new Scanner(System.in);
		int tehtava=1;
		int pisteet=0, summa=0;
		
		System.out.println("\n");
		
		while(tehtava <=5)
		{
			System.out.println("Anna" +tehtava+ " teht�v�n pisteet: ");
			pisteet=lukija.nextInt();
			
			summa=summa+pisteet;
			tehtava++;
		}
		System.out.println("Yhteispistem��r� on " +summa+ "\n");
		lukija.close();
	}
}
