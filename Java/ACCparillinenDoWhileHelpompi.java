package harjoituksia;
/* Tee ohjelma, joka tulostaa vain parilliset
 * numerot välillä 2 - 100
 * doWhile-versio
 * opettajan While-versiosta muunteltu oma versio
 * todennäköisesti kuitenkin sama
 */

public class ACCparillinenDoWhileHelpompi
{

	public static void main(String[] args)
	{
		int luku = 2;
		
		do
		{
			System.out.println(luku);
			luku=luku+2;	//näin saa tulostettua joka toisen(2) luvun
							//jos tämä muuttaa esim luku+5,
							//niin se tulostaa joka viidennen luvun
		}while(luku <= 100);

	}

}
