package harjoituksia;

import java.util.Scanner;


public class AABTahdetFor
{
    public static void main(String[] args)
    {
        Scanner lukija=new Scanner(System.in);
        int lkm=0;

        System.out.println("Montako tähteä tulostetaan: ");
        lkm=lukija.nextInt(); // jos saatava tietue on desimaali, niin
                                // foobar.nextDouble(),
                                // merkkijonossa(eli string) foobar.nextString()

        for(int i=0; i<lkm; i++)
        {
             System.out.print("*");
        }

        lukija.close();
    }
}