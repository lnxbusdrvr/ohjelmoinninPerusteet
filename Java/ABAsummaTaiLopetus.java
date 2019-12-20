package harjoituksia;

import java.util.Scanner;

/* Tee ohjelma, joka pyyt‰‰ k‰ytt‰j‰‰ valitsemaan joko summan, erotuksen tai lopetuksen
 * jos komento on lopetus, ohjelman k‰yttˆ p‰‰ttyy siihen
 * k‰ytt‰j‰lt‰ pyydet‰‰n kaksi lukua ja otetaan ne vastaan
 * jos k‰ytt‰j‰n antama komento on summa
 * - lasketaan luvut yhteen ja tulostetaan summa
 * jos taas k‰ytt‰j‰n antama komento on erotus
 * - lasketaan lukujen erotus ja tulostetaan erotus
 * muussa tapauksessa
 * - tulostetaan "tuntematon komento"
 * Ohjelmaa toistetaan ehdolla: while(true)
 * 
 * Ohjelman lopuksi tulostetaan "Kiitos ja n‰kemiin"
 * 
 * tulostusesimerkki:
 * tervetuloa k‰ytt‰m‰‰n laskinta
 * anna komento (summa, erotus, lopetus): erotus
 * anna luvut 5
 * 4
 * lukujen erotus 1
 * anna komento (summa, erotus, lopetus): lopetus
 * kiitos ja kuulemiin.
 * 
 */
 public class ABAsummaTaiLopetus
 {
	public static void main(String[] args)
	{
		Scanner lukija = new Scanner(System.in);
		System.out.println("tervetuloa k‰ytt‰m‰‰n laskinta");

		while ( true )
		{
			System.out.print("anna komento (summa, erotus, lopetus): ");
		    String komento = lukija.nextLine();
		    if ( komento.equals("lopetus") )
		    {
		        break;
		    }
		    
		    System.out.print("anna luvut ");
		    int eka = Integer.parseInt(lukija.nextLine());
		    int toka = Integer.parseInt(lukija.nextLine());

		    if ( komento.equals("summa"))
		    {
		    	int summa = eka+toka;
		        System.out.println( "lukujen summa " + summa );
		    }
		    else if ( komento.equals("erotus"))
		    {
		    	int erotus = eka-toka;
		        System.out.println( "lukujen erotus " + erotus );
		    }
		    else
		    {
		    	System.out.println( "tuntematon komento");
		    }
		    System.out.println("kiitos ja kuulemiin.");
			lukija.close();
		    }
		}

}

	
