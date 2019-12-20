package harjoituksia;

import java.util.ArrayList;

public class ABDelokuvaLista
{

	public static void main(String[] args)
	{
		ArrayList<String> elokuvat=new ArrayList<String>();
		
		elokuvat.add("Casablanca");
		elokuvat.add("Star Wars");
		elokuvat.add("Pirates of Caribian");
		elokuvat.add("Transporter");
		
		//.get(0) saadaan indexi
		System.out.println("Listalla on yht. " + elokuvat.size()+ " elokuvaa.");
		System.out.println(elokuvat);
		System.out.println("Ne ovat: " +elokuvat.get(0)+ ", " + elokuvat.get(1)+ ", " + elokuvat.get(2)+ ", " + elokuvat.get(3));
		
		elokuvat.remove(3);
		System.out.println("Listalla on poiston jälkeen " + elokuvat.size()+ " elokuvaa.");

		//tutkitaan, onko jokin elokuva listalla
		if(elokuvat.contains("Star Wars"))
			System.out.println("Löytyi!");
		else System.out.println("Eipä löydy!");

	}

}
