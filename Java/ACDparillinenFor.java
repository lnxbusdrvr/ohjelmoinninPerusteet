package harjoituksia;
/* Tee ohjelma, joka tulostaa vain parilliset
 * numerot v�lill� 2 - 100
 * For-versio
 * opettajan While-versiosta muunteltu oma versio
 * todenn�k�isesti kuitenkin sama
 */

public class ACDparillinenFor
{

	public static void main(String[] args)
	{
		for(int i=2; i<=100; i=i+2)
		{
			System.out.println(i);
		}

	}

}
