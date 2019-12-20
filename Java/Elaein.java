package harjoituksia;

public class Elaein
{
	private String rotu;
	private String vari;
	private int ika;
	private int paino;
	private String nimi;
	//Konstruktio
	public Elaein(String rotu, String vari, int ika, int paino, String nimi) {
		super();
		this.rotu = rotu;
		this.vari = vari;
		this.ika = ika;
		this.paino = paino;
		this.nimi = nimi;
	}
	public String getRotu() {
		return rotu;
	}
	public void setRotu(String rotu) {
		this.rotu = rotu;
	}
	public String getVari() {
		return vari;
	}
	public void setVari(String vari) {
		this.vari = vari;
	}
	public int getIka() {
		return ika;
	}
	public void setIka(int ika) {
		this.ika = ika;
	}
	public int getPaino() {
		return paino;
	}
	public void setPaino(int paino) {
		this.paino = paino;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	@Override
	public String toString() {
		return this.rotu+" \t\t"+this.vari+" \t"+this.ika+" \t"+this.paino+" \t"+this.nimi+" ";
	}
	
	public void kasvataIkaa()
	{
		ika++;
	}
	
	

}
