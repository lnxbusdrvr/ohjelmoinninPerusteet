package harjoituksia;

public class ABKlaskut
{

	public static void main(String[] args)
	{
		Lasku lasku1=new Lasku(1, 2000, "Matti Meikäläinen", 10);
		
		lasku1.tulosta();
		
		lasku1.maksa(500);
		
		lasku1.tulosta();
		
		//Nostetaan korkoa yhdellä
		lasku1.nosto(1);
		lasku1.tulosta();
		
		//Nostetaan korkoa kahdellä
		lasku1.nosto(2);
		lasku1.tulosta();
		
		//Nostetaan korkoa eri tavalla
		lasku1.koronNosto();
		lasku1.tulosta();

	}

}
