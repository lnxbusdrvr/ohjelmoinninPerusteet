package harjoituksia;
/* Esittele merkkijono, jolle annat jonkin merkkijonon alkuarvoksi
 * K�sittele merkkijonoa seuraavasti:
 * tulosta merkkijonon pituus
 * tulosta merkkijono isoilla kirjaimilla
 * tulosta merkkijono pienill� kirjaimilla
 * tulosta merkkijonon jonkin indeksin sis�ll�n
 */

public class AAVmjono2
{
	public static void main(String[] args)
	{
		String mjono1 = "Ohjelmointi on kivaa";
		String mjono2 = "Linux";
		String mjono3 = "Chuck Berry on Rock \'n\' Roll";
		
		//Tulostus
		System.out.print(mjono1+" ");
		System.out.println(mjono1.length());
		System.out.print(mjono2+" ");
		System.out.println(mjono2.length());
		System.out.print(mjono3+" ");
		System.out.println(mjono3.length());
		
		System.out.println();
		//Tulostus isoilla kirjaimilla
		System.out.println("Tulostetaan isoilla kirjaimilla: ");
		System.out.println(mjono1.toUpperCase());
		System.out.println(mjono2.toUpperCase());
		System.out.println(mjono3.toUpperCase());
		
		System.out.println();
		//Tulostetaan pienill� kirjaimilla
		System.out.println(mjono1.toLowerCase());
		System.out.println(mjono2.toLowerCase());
		System.out.println(mjono3.toLowerCase());
		
		System.out.println();
		//Tulostetan jostain v�lilt�
		System.out.println(mjono1.substring(1, 4)); //jos stringissa on v�lily�nti, niin se tulostaa sen errorina
		System.out.println(mjono2.substring(0, 5));
		System.out.println(mjono3.substring(12, 14)); //12 on XIII-kirjain, pilkun j�lkeen ruvetaan 
													  //piirt�� kohdasta 12 - 14 asti
													  //eli kaksi kirjainta
		
	
		

	}

}
