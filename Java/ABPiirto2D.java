package harjoituksia;
/*Piirto Java 2D:ss‰
 * k‰ytet‰‰n java.awt.Graphics2D-luokan piirtometodeja
 * aluksi luodaan graafinen olio, jolla on jokin muoto esim. ellipsi
 * 
 * */
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ABPiirto2D extends JApplet{
 
	private static final long serialVersionUID = 1L;
	
	public void init(){
		//luodaan ulkoasu ja komponentit
		Container cp=getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(new JLabel("JLabel-komponentti"), BorderLayout.NORTH);
		cp.add(new Paneeli2D(), BorderLayout.CENTER);
		cp.add(new JButton("JButton-komponentti"), BorderLayout.SOUTH);
	}
}
class Paneeli2D extends JPanel{

	 //luodaan graafiset oliot
	private static final long serialVersionUID = 1L;
	private Ellipse2D.Double ympyra=new Ellipse2D.Double(20,20,250,250);
	private Rectangle2D.Double nelio=new Rectangle2D.Double(20, 20, 250, 250);
	
	//piirret‰‰n v‰rill‰ t‰ytetyt kuviot
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		Graphics2D g2d=(Graphics2D)g;
		g2d.setPaint(Color.yellow);
		g2d.fill(ympyra);
		g2d.setPaint(Color.red);
		g2d.setStroke(new BasicStroke(8));
		g2d.draw(nelio);
	}
}