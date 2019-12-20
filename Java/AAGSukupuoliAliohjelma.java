package harjoituksia;

import java.util.Scanner;

public class AAGSukupuoliAliohjelma {

	public static void main(String[] args)
	{
		KumpaaSukupuolta(); //Aliohjelman kutsu
		

	}
	
	//Aliohjelma
	private static void KumpaaSukupuolta()
	{
		Scanner lukija=new Scanner(System.in);
		char sukupuoli;
		
		System.out.println("Oletko mies vai nainen (m/n): ");
		sukupuoli=lukija.nextLine().charAt(0);
		
		if(sukupuoli == 'm'|| sukupuoli == 'M')
		{
			System.out.println("Oletpa sinä komea!");
		}
		else if(sukupuoli == 'n'|| sukupuoli == 'N')
		{
			System.out.println("Oletpa sinä kaunis!");
		}
		else
		{
			System.out.println("Oletpa sinä komea ja kaunis!");
		}
		lukija.close();
		
	}

}
