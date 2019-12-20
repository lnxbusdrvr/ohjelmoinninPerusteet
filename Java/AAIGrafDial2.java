package harjoituksia;

import javax.swing.JOptionPane;

public class AAIGrafDial2
{
	public static void main(String[] args)
	{
		int luku;
		String lukuStr;
	
		lukuStr=JOptionPane.showInputDialog("Anna kokonaisluku:");
		luku=Integer.parseInt(lukuStr); //muuttaa merkkijono kokonaisliuvuksi
		
		if(luku==100)
		{
			JOptionPane.showMessageDialog(null, "Lukusi on 100");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Lukusi ei ole 100.");
			javax.swing.JOptionPane.showMessageDialog(null, "Lukusi on " +luku);
		}
		
		System.exit(0);
	}

}
