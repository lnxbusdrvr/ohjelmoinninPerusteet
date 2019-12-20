package harjoituksia;
/* Tee ohjelma, joka tulostaa vain parilliset
 * numerot välillä 2 - 100
 * while-versio
 * 
 * 
 */

public class ABZwhileParilliset
{

	public static void main(String[] args)
	{
		int i =	2;
		while(i<=100)
		{
			if(i % 2 == 0)
			{
				System.out.println(+i);
			}
			i++;
		}

	}

}
