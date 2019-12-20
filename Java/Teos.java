package harjoituksia;

public class Teos
{
	private int teosLaji;
	private String teosLajinNimi;
	private String nimi;
	private String tekija;
	private String julkaisija;
	private int julkaisuVuosi;
	private double hinta;
	
	public Teos(int teosLaji, String teosLajinNimi, String nimi, String tekija,
			String julkaisija, int julkaisuVuosi, double hinta)
	{
		super();
		this.teosLaji = teosLaji;
		this.teosLajinNimi = teosLajinNimi;
		this.nimi = nimi;
		this.tekija = tekija;
		this.julkaisija = julkaisija;
		this.julkaisuVuosi = julkaisuVuosi;
		this.hinta = hinta;
	}

	public int getTeosLaji()
	{
		return teosLaji;
	}

	public void setTeosLaji(int teosLaji)
	{
		this.teosLaji = teosLaji;
	}

	public String getTeosLajinNimi()
	{
		return teosLajinNimi;
	}

	public void setTeosLajinNimi(String teosLajinNimi)
	{
		this.teosLajinNimi = teosLajinNimi;
	}

	public String getNimi()
	{
		return nimi;
	}

	public void setNimi(String nimi)
	{
		this.nimi = nimi;
	}

	public String getTekija()
	{
		return tekija;
	}

	public void setTekija(String tekija)
	{
		this.tekija = tekija;
	}

	public String getJulkaisija()
	{
		return julkaisija;
	}

	public void setJulkaisija(String julkaisija)
	{
		this.julkaisija = julkaisija;
	}

	public int getJulkaisuVuosi()
	{
		return julkaisuVuosi;
	}

	public void setJulkaisuVuosi(int julkaisuVuosi)
	{
		this.julkaisuVuosi = julkaisuVuosi;
	}

	public double getHinta()
	{
		return hinta;
	}

	public void setHinta(double hinta)
	{
		this.hinta = hinta;
	}

	@Override
	public String toString()
	{
		return this.teosLaji+", "+this.teosLajinNimi+
				", "+this.nimi+", "+this.tekija+", "+this.julkaisija+
				", "+this.julkaisuVuosi+", "+this.hinta+" €";
	}
	
	

}
