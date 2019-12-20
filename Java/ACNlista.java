package harjoituksia;

import java.util.ArrayList;

public class ACNlista
{

	public static void main(String[] args)
	{
		//Lista, johon voi tallentaa esim. merkkijonoja
		ArrayList<String>kukkaLista=new ArrayList<String>();
		ArrayList<String>puuLista=new ArrayList<String>();
				
		//lis‰t‰‰n listaan merkkijonoja
		kukkaLista.add("Tulppaani");
		kukkaLista.add("Ruusu");
		kukkaLista.add("Voikukka");
		kukkaLista.add("Auringokukka");
		
		puuLista.add("Tammi");
		puuLista.add("Kuusipuu");
		puuLista.add("M‰nty");
		puuLista.add("Koivu");
		
		//Tulostetaan I -ryhm‰n 2 indexi
		System.out.println(kukkaLista.get(1));
		
		//Tulostetaan II -ryhm‰n 3 indexi
		System.out.println(puuLista.get(2));
		
		//Poistetaan kukka
		kukkaLista.remove(3);
		//Ja tulostetaan kaikki kukat
		System.out.println("Kukkia on j‰ljell‰ "+kukkaLista.size());
		System.out.println("Ja ne ovat: "+kukkaLista.get(0)+", "+kukkaLista.get(1)+", "+kukkaLista.get(2));

	}

}
