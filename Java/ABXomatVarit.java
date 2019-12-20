package harjoituksia;

import javax.swing.*;            
import java.awt.Graphics;
import java.awt.Color;

public class ABXomatVarit extends JFrame {

  
	private static final long serialVersionUID = 1L;

public ABXomatVarit() {
    add(new VariPaneeli());
  }

  public static void main(String[] args) {
        ABXomatVarit ikkuna = new ABXomatVarit();
        ikkuna.setTitle("OmatVarit");
        ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ikkuna.setSize(285, 310);
        ikkuna.setVisible(true);
    }
}


class VariPaneeli extends JPanel {

  
	private static final long serialVersionUID = 1L;

public void paintComponent(Graphics kuva) {

     kuva.drawRect(0,0, 277, 277);
     setBackground(Color.white);

     int r,g,b; // RGB värikolmikko

     b = (int)(Math.random()*256);

     for (r=0; r<256; r+=3) 
       for (g=0; g<256; g+=3) {
         Color vari = new Color(255-r,255-g,b);
         kuva.setColor(vari);
         kuva.fillRect(10+r,10+g, 3,3);
       }

  }


}
