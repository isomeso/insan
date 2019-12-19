import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Naberin {
	
	static JTextField textBox0 = new JTextField();
    static JTextField textBox1 = new JTextField(); 
    static JTextField textBox2 = new JTextField(); 
	static double sayi1, sayi2, sonuc;


	public static void main(String[] args) {
        


	    JFrame frame = new JFrame("Fazla insani olmaya calisan bisey");
	    JPanel vPanel = new JPanel();
	    JPanel hPanel = new JPanel();
        BoxLayout  boxLayout  = new BoxLayout(vPanel, BoxLayout.Y_AXIS);
        BoxLayout  boxLayout2  = new BoxLayout(hPanel, BoxLayout.X_AXIS);
        
        vPanel.setLayout(boxLayout);
        hPanel.setLayout(boxLayout2);

        

        JButton buttonTopla = new JButton("TOPLA");
        JButton buttonCikar = new JButton("CIKAR");
        JButton buttonBol = new JButton("BOL");
        JButton buttonCarp = new JButton("CARP");

        buttonTopla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate(1);
            }
        });

        buttonCikar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate(2);
            }
        });

        buttonBol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate(3);
            }
        });

        buttonCarp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate(4);
            }
        });
        
        hPanel.add(buttonTopla);
        hPanel.add(buttonCikar);
        hPanel.add(buttonBol);
        hPanel.add(buttonCarp);


        vPanel.add(textBox0);
        vPanel.add(textBox1);
        vPanel.add(textBox2);
        vPanel.add(hPanel);

	    vPanel.setPreferredSize(new Dimension(320, 130));
	    frame.getContentPane().add(vPanel);
	    frame.pack();
	    frame.setVisible(true);
	}

	public static void calculate(int sayi) {
		sayi1 = Double.parseDouble(textBox0.getText());
		sayi2 = Double.parseDouble(textBox1.getText());

		if (sayi == 1) 
			sonuc = sayi1+sayi2;
		else if (sayi == 2)
			sonuc = sayi1-sayi2;
		else if (sayi == 3)
			sonuc = sayi1/sayi2;
		else if (sayi == 4)
			sonuc = sayi1*sayi2;

		textBox2.setText(String.valueOf(sonuc));
	}
}