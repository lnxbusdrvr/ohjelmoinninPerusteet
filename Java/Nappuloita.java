package harjoituksia;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//Extends  tuo mukaan
//tuo Framen, eli kehityksen
//implements tuo rajanapinnan ActionListenerin
//painetaan Framin kohdalta import java.awt
//painetaan Nappuloita -kohdalta Add unimplemented
//painetaan Nappuloita -kohdasta Add default serial version ID
//painetaan ActionListener kohdalta import java.awt.event
public class Nappuloita extends Frame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	//ikkunan komponenttien muuttujia
	private Button nappula, tyhjaa, loppu;
	private TextField tekstiKentta1, tekstiKentta2;
	private TextArea tekstiAlue;
	
	/*Konstruktori suoritetaan, kun luokasta luodaan olio:
	 * asettaa arvot olion muuttujille
	 * nimi pit‰‰ olla sama kuin luokalla
	 * this-sanan k‰yttˆ on pakollinen
	 */
	public Nappuloita()
	{
		//ikkunan asemointi, eli layout
		//FlowLayout -import java.awt.Layout
		setLayout(new FlowLayout());
		//Luodaan komponenttioliot
		//Button -import java.awt  
		//ja sama kaikissa punaisella viivalla olevat jutut
		nappula=new Button("nappula");
		tyhjaa=new Button("tyhj‰‰");
		loppu=new Button("loppeta");
		tekstiKentta1=new TextField(10);
		tekstiKentta2=new TextField(15);
		tekstiKentta2.setEditable(false);
		tekstiAlue=new TextArea(5, 14); //korkeus, leveys
		
		//lis‰t‰‰n komponenttioliot ikkunaan
		add(nappula);
		add(tyhjaa);
		add(loppu);
		add(tekstiKentta1);
		add(tekstiKentta2);
		add(tekstiAlue);
		
		//asetetaan kuuntelijat
		nappula.addActionListener(this);	//this, jotta osaa yhdist‰‰ 
		tyhjaa.addActionListener(this);		//juuri oikeaan nappiin
		loppu.addActionListener(this);
		tekstiKentta1.addActionListener(this);
		
	}
	//tapahtumien k‰sittelyt, kun kuuntelija on havainnut toiminnon
	@Override
	public void actionPerformed(ActionEvent tapahtuma)
	{
		//Object on kaikkien luokkien yl‰luokka
		Object aiheuttaja=tapahtuma.getSource();
		
		if(aiheuttaja==nappula)
		{
			//setText asettaa tekstin
			tekstiKentta2.setText("Painoit nappulaa");
			//append tekee sen, ett‰ teksti ilmestyy n‰kyviin
			tekstiAlue.append("Painoit nappulaa!");
		}
		else if(aiheuttaja==tyhjaa)
		{
			tekstiKentta1.setText("");
			tekstiKentta2.setText("");
			tekstiAlue.setText("");
		}
		else if(aiheuttaja==loppu)
		{
			System.exit(0);
		}
		else if(aiheuttaja==tekstiKentta1)
		{
			tekstiAlue.append(tekstiKentta1.getText()+ "\n");
		}
	}
	


}
