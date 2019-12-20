package harjoituksia;

import java.util.Scanner;

public class ACFtahdetDoWhile
{

	public static void main(String[] args)
	{
		int lkm=0, i=0;
		Scanner lukija=new Scanner(System.in);
		
    	System.out.println("Montako tähteä tulostetaan: ");
    	lkm=lukija.nextInt(); // jos saatava tietue on desimaali, niin
                            // foobar.nextDouble(),
                            // merkkijonossa(eli string) foobar.nextString()4
		
    	do
        {
    
             System.out.print("*");
             i++;
        }while(i<lkm);
        lukija.close();

	}

}
