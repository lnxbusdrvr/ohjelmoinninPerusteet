package harjoituksia;

import java.util.Scanner;

public class AAAPulla
{
    public static void main(String[] args)
    {
        Scanner lukija=new Scanner(System.in);
        final int PULLAT=5;  // final on sama kuin #define c++:ssa, eli vakiomuuttuja
        final int LUKIOPULLAT=7;
        int alaAste=0, ylaAste=0, lukio, yht;

        System.out.println("Montako oppilasta on ala-asteella: ");
        alaAste=lukija.nextInt();

        System.out.println("Montako oppilasta on ylä-asteella: ");
        lukio=lukija.nextInt();

        yht=(alaAste*PULLAT)+(ylaAste*PULLAT)+(lukio*LUKIOPULLAT);

        System.out.println("Lihapullia tarvitaan yhteensä "+yht);
        lukija.close();
    }
}