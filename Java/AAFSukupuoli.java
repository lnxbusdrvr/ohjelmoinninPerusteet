package harjoituksia;

import java.util.Scanner;

public class AAFSukupuoli {

	public static void main(String[] args)
	{
		Scanner lukija=new Scanner(System.in);
		char sukupuoli;
		
		System.out.println("Oletko mies vai nainen (m/n): ");
		sukupuoli=lukija.nextLine().charAt(0);
		
		if(sukupuoli == 'm'|| sukupuoli == 'M')
		{
			System.out.println("Oletpa sin� komea!");
		}
		else if(sukupuoli == 'n'|| sukupuoli == 'N')
		{
			System.out.println("Oletpa sin� kaunis!");
		}
		else
		{
			System.out.println("Oletpa sin� komea ja kaunis!");
		}
		lukija.close();
		
	}

}
