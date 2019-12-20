package harjoituksia;

public class Kasvi
{
	private String nimi;	//t‰ss‰ luodaan muuttuija, mutta yksityisi‰ muuttujia
	private String vari;	//Source-> Generate construction using fields
	private String vyohyke;	//valitaan n‰m‰ kent‰t, mitk‰ t‰ss‰ on esitelty
	private int korkeus;	//source -> Generate Getters and Setters
	private String vaikeusluokka;	// valitaan kaikki kent‰t
	private String kasvupaikka;								// lopuksi
									//source -> toString
									// otetaan mukaan ainoastaa fieldsit, ei medoteja
	
	
	//Generate constructions using fields:
	public Kasvi(String nimi, String vari, String vyohyke, int korkeus,
			String vaikeusluokka, String kasvupaikka)
	{
		super();
		this.nimi = nimi;
		this.vari = vari;
		this.vyohyke = vyohyke;
		this.korkeus = korkeus;
		this.vaikeusluokka = vaikeusluokka;
		this.kasvupaikka = kasvupaikka;
	}
	//Generate constructions using fields-LOPPU

	//Getters and Setters-ALKAA
	public String getNimi()
	{
		return nimi;
	}


	public void setNimi(String nimi)
	{
		this.nimi = nimi;
	}


	public String getVari()
	{
		return vari;
	}


	public void setVari(String vari)
	{
		this.vari = vari;
	}


	public String getVyohyke()
	{
		return vyohyke;
	}


	public void setVyohyke(String vyohyke)
	{
		this.vyohyke = vyohyke;
	}


	public int getKorkeus()
	{
		return korkeus;
	}


	public void setKorkeus(int korkeus)
	{
		this.korkeus = korkeus;
	}


	public String getVaikeusluokka()
	{
		return vaikeusluokka;
	}


	public void setVaikeusluokka(String vaikeusluokka)
	{
		this.vaikeusluokka = vaikeusluokka;
	}
	//Getters and Setters-LOPPUU

	//Lis‰ttiin uusi Getters and Setters-ALKAA
	public String getKasvupaikka()
	{
		return kasvupaikka;
	}

	public void setKasvupaikka(String kasvupaikka)
	{
		this.kasvupaikka = kasvupaikka;
	}
	//Lis‰ttiin uusi Getters and Setters-LOPPUU

	//toString-ALKAA
	@Override
	public String toString()
	{
		//this tunnistaa muuttujan, kun laittaa pisteen per‰‰n
		//this:i‰ on hankalaa selitt‰‰.
		return this.nimi+", "+this.vari+", "+this.vyohyke+", "+this.korkeus+", "+this.vaikeusluokka+", "+this.kasvupaikka+".";
	}
	//toString-LOPPUU
	
	public void kasvata()
	{
		korkeus++; //korkeus=korkeus+1
	}
	
	
	

}
