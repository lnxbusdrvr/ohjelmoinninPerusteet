package harjoituksia;

import javax.swing.JOptionPane;

public class AAHGrafDialogi {

	public static void main(String[] args) {
		String lukuStr;
		/*tietojen sy�tt�minen showInputDialog-metodilla, johon
		 * liittyy tiedon kysyminen ja k�ytt�j�n sy�tteen vastaanottaminen*/
		lukuStr=JOptionPane.showInputDialog("Anna kokonaisluku: ");
		
		/*tiedot otetaan aina vastaan String-muuttujaan, joka 
		 * muutetaan halutuksi tyypiksi parseInt tai parseDouble metodilla*/
		int luku=Integer.parseInt(lukuStr);
		JOptionPane.showMessageDialog(null, "Luku on " +luku);
		
		System.exit(0);

	}

}
