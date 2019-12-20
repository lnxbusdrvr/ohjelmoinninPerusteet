/*
 * Tee luokka Teos, jolla on seuraavat kent‰t‰:
 * teoslaji (numero)
 * teoslajinimi (=selvent‰‰ edell‰ olevaa numeroa)
 * nimi
 * tekij‰ (esim. kirjain kirjoittaja)
 * julkaisija (esim. Wsoy)
 * julkaisuvuosi
 * hinta
 */
package harjoituksia;

public class ABJteokset
{

	public static void main(String[] args)
	{
		Teos kirja=new Teos(1, "Kaunokirjallisuus", "Viiden Kannen Pelti", "Laila Vuorinen", "Wsoy", 2010, 0);
		Teos kirja2=new Teos(2, "Scifi", "Babylon 5", "Al Sarrantonio", "Written Space", 1996, 0);
		
		System.out.println(kirja);
		
		//asetetaan ilmentym‰lle hinta
		kirja.setHinta(55);
		System.out.println(kirja.getNimi()+": "+kirja.getHinta()+ " euroa.");
		System.out.println(kirja.getNimi()+": "+kirja.getTekija());
		System.out.println(kirja.getTekija()+" kirjoitti kirjan "+kirja.getNimi());
		
		kirja2.setHinta(2);
		System.out.println(kirja2.getNimi()+": "+kirja2.getHinta()+ " euroa.");

	}

}
