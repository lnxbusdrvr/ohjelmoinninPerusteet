package harjoituksia;

import javax.swing.JOptionPane;

public class ACOlempiVariGraf
{

	public static void main(String[] args)
	{
		String menu;
		char valinta;
		
		menu=JOptionPane.showInputDialog("Valitse seuraavista v�reist� lempiv�ri: \n"
				+ "P. Punainen \n S. Sininen \n M. Musta \n");
		valinta=menu.charAt(0);
		
		switch(valinta)
		{
			case 'p':
			case 'P':
				JOptionPane.showMessageDialog(null, "Lempiv�risi on punainen.");
				break;
						
			case 's':
			case 'S':
				JOptionPane.showMessageDialog(null, "Lempiv�risi on sininen.");
				break;
				
			case 'm':
				JOptionPane.showMessageDialog(null, "Lempiv�risi on musta.");
				break;
			case 'M':
				JOptionPane.showMessageDialog(null, "Lempiv�risi on musta.");
				break;
				
			default:
				System.out.println("Tarkista valinta");
		}
		
		

	}

}
