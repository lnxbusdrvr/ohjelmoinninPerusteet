package harjoituksia;
//http://www2.uef.fi/fi/anja.kareinen/grafiikan-perusteita
//tutustu yll‰ olevaan linkkiin ja siit‰ grafiikka-osuus (esimerkkej‰-linkki ei toimi)
import java.applet.*;
import java.awt.*;

public class ABQuvat extends Applet {

	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){


		//vaihdetaan piirtov‰ri siniseksi ja tulostetaan ympyr‰‰
		g.setColor(Color.blue);
		g.drawOval(10,10,200,200);
		g.drawString("teksti‰",50,50);

		//vaihdetaan piirtov‰ri punaiseksi ja tulostetaan 
		g.setColor(Color.red); 
		g.fillRect(120,120,170,170);

	}
}
