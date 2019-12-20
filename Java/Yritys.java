package harjoituksia;

public class Yritys
{
	private String nimi;
	private String yTunnus;
	private int ttMaara;
	private double liikevaihto;
	private String kotikunta;
	public Yritys(String nimi, String yTunnus, int ttMaara, double liikevaihto,
			String kotikunta)
	{
		super();
		this.nimi = nimi;
		this.yTunnus = yTunnus;
		this.ttMaara = ttMaara;
		this.liikevaihto = liikevaihto;
		this.kotikunta = kotikunta;
	}
	
	public String getnimi()
	{
		return nimi;
	}
	public String getyTunnus()
	{
		return yTunnus;
	}
	public void setyTunnus(String yTunnus)
	{
		this.yTunnus = yTunnus;
	}
	public int getTtMaara()
	{
		return ttMaara;
	}
	public void setTtMaara(int ttMaara)
	{
		this.ttMaara = ttMaara;
	}
	public double getLiikevaihto()
	{
		return liikevaihto;
	}
	public void setLiikevaihto(double liikevaihto)
	{
		this.liikevaihto = liikevaihto;
	}
	public String getKotikunta()
	{
		return kotikunta;
	}
	public void setKotikunta(String kotikunta)
	{
		this.kotikunta = kotikunta;
	}
	@Override
	public String toString()
	{
		return "Yrituksen nimi: "+nimi+"\nYritys Y-tunnus: "+yTunnus+"\nTyöntekijöiden määrä: "+ttMaara
				+"\nLiikevaihto: "+liikevaihto+"\nKotipaikka: "+kotikunta;
	}
	

}
