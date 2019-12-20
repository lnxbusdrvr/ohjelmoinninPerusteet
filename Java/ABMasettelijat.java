package harjoituksia;

import java.awt.*;
import javax.swing.*;	//GUI käyttöön tarkoitettu kirjasta. Kevyempi, kuin .awt

public class ABMasettelijat {
    public static void main(String[] args) {
        new Ikkuna1();
        new Ikkuna2();
        new Ikkuna3();
        new Ikkuna4();
        new Ikkuna5();
        new Ikkuna6();
    }
}

class Ikkuna1 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton nappi1 = new JButton("Eka");
    JButton nappi2 = new JButton("Toka");
    JButton nappi3 = new JButton("Kolmas");

    public Ikkuna1() {
        super("FlowLayout");
        setBounds(100, 100, 300, 300);
        setLayout(new FlowLayout());
        add(nappi1); // Ei enaa contentPane:a
        add(nappi2);
        add(nappi3);
        setVisible(true);
    }
}

class Ikkuna2 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton nappi1 = new JButton("Eka");
    JButton nappi2 = new JButton("Toka");
    JButton nappi3 = new JButton("Kolmas");

    public Ikkuna2() {
        super("GridLayout");
        setBounds(500, 100, 300, 300);
        setLayout(new GridLayout(0, 2));
        add(nappi1);
        add(nappi2);
        add(nappi3);
        setVisible(true);
    }
}

class Ikkuna3 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton nappi1 = new JButton("Eka");
    JButton nappi2 = new JButton("Toka");
    JButton nappi3 = new JButton("Kolmas");

    public Ikkuna3() {
        super("BorderLayout");
        setBounds(900, 100, 300, 300);
        setLayout(new BorderLayout());
        add(nappi1, BorderLayout.NORTH);
        add(nappi2, BorderLayout.EAST);
        add(nappi3, BorderLayout.SOUTH);
        setVisible(true);
    }
}

class Ikkuna4 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton nappi1 = new JButton("Eka");
    JButton nappi2 = new JButton("Toka");
    JButton nappi3 = new JButton("Kolmas");

    public Ikkuna4() {
        super("GridBagLayout");
        setBounds(100, 500, 300, 300);
        setLayout(new GridBagLayout());
        add(nappi1, new GridBagConstraints(0, 0, 2, 2, 0, 0, GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
        add(nappi2, new GridBagConstraints(0, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        add(nappi3, new GridBagConstraints(1, 1, 3, 3, 1, 1, GridBagConstraints.WEST,
                GridBagConstraints.VERTICAL, new Insets(0, 0, 0, 0), 0, 0));
        setVisible(true);
    }
}

class Ikkuna5 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton nappi1 = new JButton("Eka");
    JButton nappi2 = new JButton("Toka");
    JButton nappi3 = new JButton("Kolmas");

    public Ikkuna5() {
        super("BoxLayout");
        setBounds(500, 500, 300, 300);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(nappi1);
        add(nappi2);
        add(nappi3);
        setVisible(true);
    }
}

class Ikkuna6 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton nappi1 = new JButton("Eka");
    JButton nappi2 = new JButton("Toka");
    JButton nappi3 = new JButton("Kolmas");

    public Ikkuna6() {
        super("CardLayout");
        setBounds(900, 500, 300, 300);
        CardLayout kortti = new CardLayout();
        setLayout(kortti);
        add(nappi1, "Nappi1");
        add(nappi2, "Nappi2");
        add(nappi3, "Nappi3");
        int i = 0;
        while (i < 100000) {
            if (i++ % 10000 == 0) {
                kortti.next(getContentPane());
            }
            setVisible(true);
        }
    }
}