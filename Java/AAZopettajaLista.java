package harjoituksia;

import java.util.ArrayList;

/*Luo lista, johon lis�t��n opettajien nimi� (v�h. 5 kpl).
 * Tulosta listan opettajien lukum��r�
 * Tulosta kolmantena (indeksi=2) olevan opettajan nimi�
 * Poista listan viimeinen nimi
 * Tulosta lista uudestaan
 */

public class AAZopettajaLista
{
	public static void main(String[] args)
	{
		ArrayList<String>opettajat=new ArrayList<String>();
		
		opettajat.add("Anne");
		opettajat.add("Pirkko");
		opettajat.add("Jarmo");
		opettajat.add("Minna");
		opettajat.add("Satu");
		opettajat.add("Erkki");
		opettajat.add("Kimmo");
		opettajat.add("Marjo");
		opettajat.add("P�ivi");
		
		//Tulostetaan lukum��r�
		System.out.println("Opettajien lista hakasuluilla: ");
		System.out.println(opettajat+"\n");
		System.out.println("Opettajien lista ilma hakasulkuja: ");
		System.out.println(opettajat.get(0)+", "+opettajat.get(1)+", "+opettajat.get(2)+", "+opettajat.get(3)+", "+opettajat.get(4)+", "+opettajat.get(5)+", "+opettajat.get(6)+", "+opettajat.get(7)+", "+opettajat.get(8)+"\n");
		System.out.println("opettajien lukum��r�: "+opettajat.size()+"\n");
		
		//Tulostetaan kolmas(2) lista
		System.out.println("Kolmas opettaja on "+opettajat.get(2));
		
		

	}

}
