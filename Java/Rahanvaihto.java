package harjoituksia;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Rahanvaihto extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final static double KURSSI=1.17;	//sama kuin #define c++:ssa
	private JTextField raha=new JTextField(8);	//8 viittaa kentän suurruutta
	private JTextField tulos=new JTextField(8);
	private JButton euro=new JButton("Euroiksi");
	private JButton dollari=new JButton("Dollareiksi");
	private JButton nollaa=new JButton("Nollaa arvot");
	private JButton lopeta=new JButton("Lopeta");
	private JMenuBar omaMenuBar=new JMenuBar();
	private JMenu toiminnot=new JMenu("Toiminnot");
	private JMenuItem eeuro=new JMenuItem("Vaihto euroiksi");
	
	//konstruktori
	public Rahanvaihto()
	{
		super("Rahanvaihto");  //tuo Ovject-luokasta kaikkea kivaa
		setBounds(100, 100, 300, 200);
		setLayout(new GridLayout(4,2,10,10));
		omaMenuBar.add(toiminnot);
		toiminnot.add(eeuro);
		setJMenuBar(omaMenuBar);
		
		eeuro.addActionListener(new Kuuntelija());
		euro.addActionListener(new Kuuntelija());
		dollari.addActionListener(new Kuuntelija());
		nollaa.addActionListener(new Kuuntelija());
		lopeta.addActionListener(new Kuuntelija());
		
		add(new JLabel("Raha"));
		add(new JLabel("Vaihto"));
		add(raha);
		add(tulos);
		add(euro);
		add(dollari);
		add(nollaa);
		add(lopeta);
				
	}
	//Sisäluokka
	class Kuuntelija implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent event)
		{
			String tapahtuma=event.getActionCommand();
			System.out.println("Tapahtuma: " +tapahtuma);
			if(tapahtuma.equals("Euroiksi"))  //.equals on numeroissa, tai muuttjissa
			{									//sama kuin ==
				Double summa=new Double(raha.getText())/KURSSI;
				tulos.setText(summa.toString());
			}
			else if(tapahtuma.equals("Dollareiksi"))
			{
				Double summa=new Double(raha.getText())*KURSSI;
				tulos.setText(summa.toString());
			}
			else if(tapahtuma.equals("Nollaan arvot"))
			{
				tulos.setText("0");
				raha.setText("0");
			}
			else if(tapahtuma.equals("Vaihto euroiksi: "))
			{
				Double summa=new Double(raha.getText())/KURSSI;
				tulos.setText(summa.toString());
			}
			else if(tapahtuma.equals("Lopeta"))
			{
				System.exit(0);
			}

			
		}
		
	}

}
