package harjoituksia;
/* Tee ohjelma, joka tulostaa vain parilliset
 * numerot v�lill� 2 - 100
 * doWhile-versio
 * opettajan While-versiosta muunteltu oma versio
 * todenn�k�isesti kuitenkin sama
 */

public class ACCparillinenDoWhileHelpompi
{

	public static void main(String[] args)
	{
		int luku = 2;
		
		do
		{
			System.out.println(luku);
			luku=luku+2;	//n�in saa tulostettua joka toisen(2) luvun
							//jos t�m� muuttaa esim luku+5,
							//niin se tulostaa joka viidennen luvun
		}while(luku <= 100);

	}

}
