package harjoituksia;

public class Opiskelija
{
	/*Ensiksi private-jutut, eli yhden luokan käytettävissä
	 * olevat muuttujat
	 * Source > "Generate Constructor Using Fields
	 * Source > "Generate Getters and Setters"
	 * valitse muuttujat
	 * Source > "Generate toString()"
	 */
	private String nimi;
	private int opintopisteet;
	@Override
	public String toString() {
		return nimi+"\t"+opintopisteet;
	}


	
	//konstruktori
	public Opiskelija(String nimi, int opintopisteet) {
		super();
		this.nimi = nimi;
		this.opintopisteet = opintopisteet;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public int getOpintopisteet() {
		return opintopisteet;
	}

	public void setOpintopisteet(int opintopisteet) {
		this.opintopisteet = opintopisteet;
	}
	
	public void opiskele()
	{
		opintopisteet++;
	}
	

}
