package harjoituksia;

import javax.swing.JOptionPane;

public class ABGrafArvosanat
{

	public static void main(String[] args)
	{
		char arvosana;
		String arvosanaStr;
		arvosanaStr=JOptionPane.showInputDialog("Anna arvosanaasi: ");
		arvosana=arvosanaStr.charAt(0);
		switch(arvosana)
		{
		case 'k':
		case 'K':
			JOptionPane.showMessageDialog(null, "Sait kiitett‰v‰n");
			break;
		case 'h':
		case 'H':
			JOptionPane.showMessageDialog(null, "Sait hyv‰n");
			break;			
		case 't':
		case 'T':
			JOptionPane.showMessageDialog(null, "Sait tyydytt‰v‰n");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Harjoittele lis‰‰!");
		}
		System.exit(0);
	}

}
