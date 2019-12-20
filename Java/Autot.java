package harjoituksia;

public class Autot
{
	private String reknro;
	private String merkki;
	private String malli;
	private String vari;
	private int vuosimalli;
	private int ostohinta;
	private int tankki;
	
	//konstruktori
	public Autot(String reknro, String merkki, String malli, String vari,
			int vuosimalli, int ostohinta, int tankki)
	{
		super();
		this.reknro = reknro;
		this.merkki = merkki;
		this.malli = malli;
		this.vari = vari;
		this.vuosimalli = vuosimalli;
		this.ostohinta = ostohinta;
		this.tankki = tankki;
	}

	
	public int getTankki()
	{
		return tankki;
	}


	public void setTankki(int tankki)
	{
		this.tankki = tankki;
	}


	//Getters and Setters
	public String getReknro()
	{
		return reknro;
	}

	public void setReknro(String reknro)
	{
		this.reknro = reknro;
	}

	public String getMerkki()
	{
		return merkki;
	}

	public void setMerkki(String merkki)
	{
		this.merkki = merkki;
	}

	public String getMalli()
	{
		return malli;
	}

	public void setMalli(String malli)
	{
		this.malli = malli;
	}

	public String getVari()
	{
		return vari;
	}

	public void setVari(String vari)
	{
		this.vari = vari;
	}

	public int getVuosimalli()
	{
		return vuosimalli;
	}

	public void setVuosimalli(int vuosimalli)
	{
		this.vuosimalli = vuosimalli;
	}

	public int getOstohinta()
	{
		return ostohinta;
	}

	public void setOstohinta(int ostohinta)
	{
		this.ostohinta = ostohinta;
	}



	
	//Generate toStrings()
	@Override
	public String toString()
	{
		return this.reknro+", \t"+this.merkki+", \t"+this.malli+", \t"+this.vari+", \t"+this.vuosimalli+", \t\t"+this.ostohinta+", "+this.tankki+".";
	}


	public void kaynnista()
	{
		System.out.println("Auto on käynnissä");		
	}


	public void sammuta()
	{
		System.out.println("Auto on sammutettu");
	}

	

	public void ajo()
	{
		tankki=tankki-10;
		
	}


	public void tankkaa(int maara)
	{
		tankki=tankki+maara;
		
	}
	
	
	
	
	

}
