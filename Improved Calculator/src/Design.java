import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.UIManager;

public class Design {

	public static void main(String[] args) {
		
		Frame win = new Frame("Jason's Stuff");
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		
		GridLayout G = new GridLayout(4,4);
		
		TextField screen = new TextField(35);
		screen.setEditable(false);
		
		Button Bplus = new Button("+");
		Button Bminus = new Button("-");
		Button Btimes = new Button("x");
		Button Bdiv = new Button("/");
		Button B0 = new Button("0");
		Button B1 = new Button("1");
		Button B2 = new Button("2");
		Button B3 = new Button("3");
		Button B4 = new Button("4");
		Button B5 = new Button("5");
		Button B6 = new Button("6");
		Button B7 = new Button("7");
		Button B8 = new Button("8");
		Button B9 = new Button("9");
		Button Bclear = new Button("C");
		Button Bequals = new Button("=");

		Operations O = new Operations(screen);
		Buttons B = new Buttons(screen);
		
		p2.setLayout(G);
		
		Label sum = new Label("", 1);
		sum.setPreferredSize(new Dimension(400, 50));
		
		
		Bplus.addActionListener(O);
		Bminus.addActionListener(O);
		Btimes.addActionListener(O);
		Bdiv.addActionListener(O);
		Bclear.addActionListener(O);
		Bequals.addActionListener(O);

		
		B0.addActionListener(B);
		B1.addActionListener(B);
		B2.addActionListener(B);
		B3.addActionListener(B);
		B4.addActionListener(B);
		B5.addActionListener(B);
		B6.addActionListener(B);
		B7.addActionListener(B);
		B8.addActionListener(B);
		B9.addActionListener(B);


		win.add(p1, BorderLayout.NORTH);
		win.add(p2, BorderLayout.CENTER);
		
		p1.add(screen);
		
		p2.add(B7);
		p2.add(B8);
		p2.add(B9);
		p2.add(Bdiv);
		
		p2.add(B4);
		p2.add(B5);
		p2.add(B6);
		p2.add(Btimes);
		
		p2.add(B1);
		p2.add(B2);
		p2.add(B3);
		p2.add(Bminus);	
		p2.add(B0);
		p2.add(Bclear);
		p2.add(Bequals);
		p2.add(Bplus);

		win.setSize(400, 500);
		win.setVisible(true);

	}

}
