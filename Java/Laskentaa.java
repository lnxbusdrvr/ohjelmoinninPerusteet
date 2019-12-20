package harjoituksia;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Laskentaa extends Frame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextField luku1, luku2;
	private Button summa, erotus, tulo, osamaara, tyhjenna, loppu;
	private TextField tulos;
	private double dluku1, dluku2;
	
	//Konstruktori
	public Laskentaa()
	{
		luku1=new TextField(15);
		luku2=new TextField(15);
		
		luku1.addActionListener(this);
		luku2.addActionListener(this);
		
		Panel lahtoluvut=new Panel();
		lahtoluvut.add(new Label("1. Laskettava:"));
		lahtoluvut.add(luku1);
		lahtoluvut.add(new Label("2.Laskettava:"));
		lahtoluvut.add(luku2);
		add("North", lahtoluvut);
		
		summa=new Button("+");
		erotus=new Button("-");
		tulo=new Button("*");
		osamaara=new Button("/");
		tyhjenna=new Button("Tyhjennä kaikki kentät");
		loppu=new Button("Lopeta");
		
		summa.addActionListener(this);
		erotus.addActionListener(this);
		tulo.addActionListener(this);
		osamaara.addActionListener(this);
		tyhjenna.addActionListener(this);
		loppu.addActionListener(this);
		
		Panel operaatiot=new Panel();
		operaatiot.add(new Label("operaatiot"));
		operaatiot.add(summa);
		operaatiot.add(erotus);
		operaatiot.add(tulo);
		operaatiot.add(osamaara);
		operaatiot.add(tyhjenna);
		operaatiot.add(loppu);
		add("Center", operaatiot);
		
		tulos=new TextField(25);
		tulos.setEditable(false);
		
		Panel lopputulos=new Panel();
		lopputulos.add(new Label("Tulos: "));
		lopputulos.add(tulos);
		add("South", lopputulos);
		
		addWindowListener(new HoiteleikkunanSulkeminen());
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent tapahtuma)
	{
		Object aiheuttaja=tapahtuma.getSource();
		if(aiheuttaja==loppu)System.exit(0);
		else if(aiheuttaja==tyhjenna)
		{
			tulos.setText("");
			luku1.setText("");
			luku2.setText("");
		}
		else if(luvutKunnossa())
		{
			if(aiheuttaja==summa)
			{
				tulos.setText(""+(dluku1+dluku2));
			}
			else if(aiheuttaja==erotus)
			{
				tulos.setText(""+(dluku1-dluku2));
			}
			else if(aiheuttaja==tulo)
			{
			 tulos.setText(""+(dluku1*dluku2));
			}
			else if(aiheuttaja==osamaara)
			{
			 tulos.setText(""+(dluku1/dluku2));
			}
		}
	}



	private boolean luvutKunnossa()
	{
		boolean ok=true;
		
		try
		{
			dluku1=new Double(luku1.getText()).doubleValue();
		}
		catch(Exception e)
		{
			luku1.setText("VIRHE");
			ok=false;
		}
		
		try
		{
			dluku2=new Double(luku2.getText()).doubleValue();
		}
		catch(Exception e)
		{
			luku2.setText("VIRHE");
			ok=false;
		}
		
		if(!ok)tulos.setText("VIRHE");
		
		return ok;
	}

}
