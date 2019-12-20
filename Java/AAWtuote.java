package harjoituksia;

public class AAWtuote
{
	private String nimi;
	private int hinta;
	
	/*konstruktori: suoritetaan silloin, kun luokasta luodaan olio
	 * konstruktori asettaa sopivat arvot olion muutujille
	 * konstruktorin nimi on sama kuin luokan nimi.
	 */
	public AAWtuote(String nimi)
	{
		this.nimi=nimi;
		this.hinta=0;
	}
	
	//metodi(eli aliohjelma, joka palauttaa tuotteen nimen
	public String haeNimi()
	{
		return this.nimi;
	}
	
	//metodi, joka palauttaa tuotteen hinnan
	public int haeHinta()
	{
		return this.hinta;
	}
	
	//metodi, joka muuttaa tuotteen hintaa
	public void asetaHinta(int hinta)
	{
		if(kevollinenHinta(hinta))
		{
			this.hinta=hinta;
		}
	}

	private boolean kevollinenHinta(int hinta)
	{		
		return hinta>=0;
	}
	
	//metodi toString m‰‰ritt‰‰ tulostuslauseen ulkon‰ˆn
	public String toString()
	{
		return this.nimi+": "+this.hinta+" euroa.";
	}

	public static void main(String[] args)
	{
		AAWtuote kirja=new AAWtuote("aapinen");
		AAWtuote uusiKirja=new AAWtuote("raamattu");
		
		kirja.asetaHinta(15);
		System.out.println(kirja.haeHinta());
		System.out.println(kirja.haeNimi());
		System.out.println(kirja);
		
		System.out.println();
		
		uusiKirja.asetaHinta(20);
		System.out.println(uusiKirja.haeHinta());
		System.out.println(uusiKirja.haeNimi());
		System.out.println(uusiKirja);

	}

}
