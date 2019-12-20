package harjoituksia;

public class AAYopiskelija
{
	public static void main(String[] args)
	{
		Opiskelija aapeli=new Opiskelija("Aapeli", 115);
		Opiskelija maija=new Opiskelija("Maija", 80);
		
		System.out.println("Nimi\tOpintopisteet");
		System.out.println(aapeli);
		System.out.println(maija);
		
		//kasvatetaan opintopisteitä
		aapeli.opiskele();
		
		System.out.println("Aapelin opintopisteet");
		

	}

}
