package harjoituksia;

import java.util.Date;

public class Lasku
{
	private int numero;
	private double summa;
	Date pvm;
	private String maksaja;
	private double korko;
	
	public Lasku(int numero, double summa, String maksaja,
			double korko)
	{
		super();
		this.numero = numero;
		this.summa = summa;
		pvm=new Date();  //hakee koneen p‰iv‰m‰‰r‰n
		this.maksaja = maksaja;
		this.korko = korko;
	}

	public int getNumero()
	{
		return numero;
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public double getSumma()
	{
		return summa;
	}

	public void setSumma(double summa)
	{
		this.summa = summa;
	}

	public Date getPvm()
	{
		return pvm;
	}

	public void setPvm(Date pvm)
	{
		this.pvm = pvm;
	}

	public String getMaksaja()
	{
		return maksaja;
	}

	public void setMaksaja(String maksaja)
	{
		this.maksaja = maksaja;
	}

	public double getKorko()
	{
		return korko;
	}

	public void setKorko(double korko)
	{
		this.korko = korko;
	}
	
	public void tulosta()
	{
		System.out.println(" LASKU ");
		System.out.println("Maksaja:        "+maksaja);
		System.out.println("Laskun numero:  "+numero);
		System.out.println("Laskun summa:   "+summa);
		System.out.println("Laskun pvm:     "+pvm);
		System.out.println("Maksuehto:      30 pv netto");
		System.out.println("Viiv‰styskorko: "     +korko);
	}
	
	public void maksa(double maara) //kun aliohjelmassa on parametrein‰ joku muuttuja
	{								//niin sit‰ ei tarvitse erikseen esitell‰
		summa-=maara;
	}
	
	public void nosto(double maara)
	{
		korko+=maara;
	}
	
	//Nostetaan korkoa eri tavalla
	public void koronNosto()
	{
		korko++;
	}

}
