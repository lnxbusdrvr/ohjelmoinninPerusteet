package harjoituksia;
/* Tee ohjelma, joka tulostaa vain parilliset
 * numerot v�lill� 2 - 100
 * while-versio
 * opettajan versio
 */

public class ACBparillinenHelpompi
{

	public static void main(String[] args)
	{
		int luku = 2;
		while(luku <= 100)
		{
			System.out.println(luku);
			luku=luku+2;	//n�in saa tulostettua joka toisen(2) luvun
							//jos t�m� muuttaa esim luku+5,
							//niin se tulostaa joka viidennen luvun
		}

	}

}
