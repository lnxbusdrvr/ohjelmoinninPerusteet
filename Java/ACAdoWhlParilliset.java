package harjoituksia;
/* Tee ohjelma, joka tulostaa vain parilliset
 * numerot välillä 2 - 100
 * doWhile-versio
 */

public class ACAdoWhlParilliset
{

	public static void main(String[] args)
	{
		int i = 2;
		do
		{
			if(i % 2 == 0)
			{
				System.out.println(+i);
			}
			i++;
		}while(i<=100);
	}

}
