package harjoituksia;

public class AAKMjono1
{
	public static void main(String[] args)
	{
		String nimi1="Matti";
		String nimi2="Risto";
		String nimi3="";
		
		// nimi3=nimi2;
		
		if(nimi3.compareTo(nimi2)==0)
			System.out.println("Nimet ovat samoja!");
		else if(nimi2.compareTo(nimi1)>0)
			System.out.println(nimi2+ " tulee aakkosissa " +nimi1+ " -nimen jälkeen");
		
		String nimi4="Antero";
		System.out.println(nimi4+ " nimen pituus on " +nimi4.length());
		
		//charAt(2) tulostaa stringin kolmannen(3) kirjaimen
		System.out.println(nimi4+ " nimen kolmas kirjain on " +nimi4.charAt(2));
		
		//Tulostetaan alusta kolme ensimmäistä kirjainta
		System.out.println(nimi4+ "kolme ekaa kirjainta " +nimi4.substring(0, 3));  //nollasta aloitetaat ja kolma kirjainta tulostetaan

		//Tulostetaan keskeltä kolme kirjainta
		System.out.println(nimi4+ " keskelta kolme kirjainta: " +nimi4.substring(2, 5)); //aloittaa 2-kohdastaa ja tulostaa 5 kirjainta
		
		//Tulostaa lopusta kolme kirjainta
		System.out.println(nimi4+ " lopusta kolme kirjainta: " +nimi4.substring(nimi4.length()-3));
		
		String nimi5="Merituulia";
		
		for(int i=0; i<nimi5.length(); i++)
		{
			System.out.println(nimi5.charAt(i));
			
			System.out.println();
			
			//palauttaa t-kirjaimen indeksinumero
			System.out.println(nimi5.indexOf('t'));
			
			//nimi isoiksi kirjaimiksi
			System.out.println(nimi5.toUpperCase());
			
			//nimi pieniksi kirjaimiksi
			System.out.println(nimi5.toLowerCase());
			
		}
	}

}
