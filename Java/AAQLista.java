package harjoituksia;

import java.util.ArrayList;

public class AAQLista {

	public static void main(String[] args) {
		//Lista, johon voi tallentaa esim. merkkijonoja
		ArrayList<String>lista=new ArrayList<String>();
		
		//lis�t��n listaan merkkijonoja
		lista.add("Java");
		lista.add("ohjelmointi");
		lista.add("on mielenkiintoista");
		lista.add("joskus osaan");
		lista.add("toisin taas en");
		
		//tulostetaan listan koko
		System.out.println(lista.size());
		
		//tulostetaan listan sis�lt� oletusmuotoisena
		System.out.println(lista);
		
		//tulostetaan listan sis�lt� oletusmuotousena
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		System.out.println(lista.get(3));
		System.out.println(lista.get(4));
		
		//poistetaan merkkijono
		lista.remove("on mielenkiintoista");
		System.out.println(lista);
		
		//tutkitaan onko listalla merkkijoino "Java"
		boolean vastaus=lista.contains("Java"); //Boolean tottai vai ep�totta
		System.out.println(vastaus+ " Metal");
		
		boolean vastaus2=lista.contains("matematiikka");
		System.out.println(vastaus2);
		
		//hienompi tapa selvitt�� sama asia kuin yll�
		if(lista.contains("Java"))System.out.println("L�ytyi");
		else System.out.println("Ei l�ydy");
		
		//eri tulostusvaihtoja
		int i=0;
		while(i<lista.size())
		{
			System.out.println(lista.get(i));
			i++;
		}
		System.out.println();
		//2. tulostusvaihtoehto
		for(int j=0; j<lista.size(); j++)
		{
			System.out.println(lista.get(j));
		}
		System.out.println();
		//3. vaihtoehto (for each)
		for(String sana: lista)
		{
			System.out.println(sana);
		}

	}

}
