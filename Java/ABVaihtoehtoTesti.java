package harjoituksia;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ABVaihtoehtoTesti extends Applet {
	private static final long serialVersionUID = 1L;
	private Label kysymys1, kysymys2;
	private Checkbox radio[]=new Checkbox[4];
	private CheckboxGroup radionapit;
	private Choice valinnat;
	private Panel kehys1;
	//oikeat vastaukset sisältävä taulukko
	private static final int oikea_vastaus[]={2,3};
	//alustetaan kysymyksen arvot
	private String kehittaja[]={"Nokia", "IBM", "Sun", "Compaq"};
	private int vuosiluku[]={1970, 1981, 1990, 1995};
	
	public void init(){
		setBackground(Color.lightGray);
		//luodaan radiopainikeryhmä kysymyksineen
		kysymys1=new Label("Mikä yhtiö kehitti Javan?");
		radionapit=new CheckboxGroup();
		
		for(int i=0; i<radio.length; i++){
			radio[i]=new Checkbox(kehittaja[i], radionapit, false);
			radio[i].addItemListener(new RadioKuuntelija());
		}
		//luodaan pudotusvalikkoryhmä kysymyksineen
		kysymys2=new Label("Milloin ilmestyi ensimmäinen JDK?");
		valinnat=new Choice();
		for(int i=0; i<vuosiluku.length; i++){
			valinnat.add(new Integer(vuosiluku[i]).toString());
			valinnat.addItemListener(new ListaKuuntelija());
		}
		
		//sijoitetaan elementit ensin paneeleihin
		kehys1=new Panel();
		kehys1.setLayout(new GridLayout(8,1));
		kehys1.add(kysymys1);
		
		for(int i=0; i<radio.length; i++){
			kehys1.add(radio[i]);
		}
		
		kehys1.add(kysymys2);
		kehys1.add(valinnat);
		//josta ne sijoitetaan lomakkeelle
		setLayout(new BorderLayout());
		add(kehys1, BorderLayout.NORTH);
	}
	//käsitellään radiopainikkeiden tapahtumat
	class RadioKuuntelija implements ItemListener{

		
		@Override
		public void itemStateChanged(ItemEvent ie) {
			Checkbox kohde=(Checkbox) ie.getSource();
			
			if(kohde== radio[oikea_vastaus[0]])
				showStatus("Oikein! Tila: " +kohde.getState()+ " ja nimi (" +kohde.getLabel()+ ")");
			else
				showStatus("Väärin! Tila: " +kohde.getState()+ " ja nimi (" + kohde.getLabel()+ ")");
		}
		
	}
	//käsitellään listan valinnat
	class ListaKuuntelija implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent ie) {
			Choice valinta=(Choice) ie.getItemSelectable();
			if(valinta.getSelectedIndex()==oikea_vastaus[1])
				showStatus("Valitsit oikean vastauksen (" +valinta.getSelectedIndex()+ ")");
			else
				showStatus("Valitsit väärän vastauksen("+valinta.getSelectedItem()+ ")");
			
		}
		
	}

}
