package harjoituksia;

public class ABIkasvit
{

	public static void main(String[] args)
	{
		Kasvi ruusu=new Kasvi("Eden Rose", "punainen", "Etelä-Suomi", 10, "vaativa", "auringossa");
		Kasvi chilli=new Kasvi("Jalapeño Gaucho", "vihreä", "Mexico", 8, "helppo", "poliisilta piilossa");
		Kasvi soija=new Kasvi("Soya", "punainen", "Aasia", 1, "vaativa", "pellolla");
		
		System.out.println(ruusu);
		System.out.println(chilli);
		System.out.println(soija);
		
		ruusu.kasvata();  //anna ohjelman luoda itse tämä Kasvi.javaan
		
		System.out.println("Ruusun korkeus nyt: "+ruusu.getKorkeus()+ " senttiä.");
		ruusu.kasvata();
		System.out.println("Ruusun korkeus nyt: "+ruusu.getKorkeus()+ " senttiä.");
		ruusu.kasvata();
	}

}
