package harjoituksia;

public class ABIkasvit
{

	public static void main(String[] args)
	{
		Kasvi ruusu=new Kasvi("Eden Rose", "punainen", "Etel�-Suomi", 10, "vaativa", "auringossa");
		Kasvi chilli=new Kasvi("Jalape�o Gaucho", "vihre�", "Mexico", 8, "helppo", "poliisilta piilossa");
		Kasvi soija=new Kasvi("Soya", "punainen", "Aasia", 1, "vaativa", "pellolla");
		
		System.out.println(ruusu);
		System.out.println(chilli);
		System.out.println(soija);
		
		ruusu.kasvata();  //anna ohjelman luoda itse t�m� Kasvi.javaan
		
		System.out.println("Ruusun korkeus nyt: "+ruusu.getKorkeus()+ " sentti�.");
		ruusu.kasvata();
		System.out.println("Ruusun korkeus nyt: "+ruusu.getKorkeus()+ " sentti�.");
		ruusu.kasvata();
	}

}
