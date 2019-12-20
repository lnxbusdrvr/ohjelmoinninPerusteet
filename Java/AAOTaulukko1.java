package harjoituksia;

public class AAOTaulukko1
{
	public static void main(String[] args)
	{
		//taulukon  luonti alkuarvoin
		//indeksit    0, 1, 2
		int [] luvut={10,44,23};
		
		//taulukon tulostus 1 vaihtoehto
		int i=0; //laskurin alustus
		
		while(i<luvut.length) //taulukon pituus
		{
			System.out.println(luvut[i]);
			i++;
		}
		
		System.out.println();
		
		//taulukon tulostus 2. vaihtoehto
		for(int j=0; j<luvut.length; j++)
		{
			System.out.println(luvut[j]);
		}
	}
}
