import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Windows {
	

	public static void main(String[] args) {
		

		Frame win = new Frame("Jason's Stuff");
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		
		GridLayout G = new GridLayout(4,4);
		
		TextField T2 = new TextField();
		TextField T3 = new TextField();
		
		Button plus = new Button("+");
		Button minus = new Button("-");
		Button times = new Button("x");
		Button divide = new Button("/");
		Button zero = new Button("0");
		Button one = new Button("1");
		Button two = new Button("2");
		Button three = new Button("3");
		Button four = new Button("4");
		Button five = new Button("5");
		Button six = new Button("6");
		Button seven = new Button("7");
		Button eight = new Button("8");
		Button nine = new Button("9");
		Button clear = new Button("C");
		Button equals = new Button("=");
		
		p2.setLayout(G);
		
		Label sum = new Label("", 1);
		sum.setPreferredSize(new Dimension(400, 50));
		
		
		Calculate P = new Calculate(sum, "+", T2, T3);
		Calculate M = new Calculate(sum, "-", T2, T3);
		Calculate T = new Calculate(sum, "x", T2, T3);
		Calculate D = new Calculate(sum, "/", T2, T3);
		Calculate E = new Calculate(sum, "=", T2, T3);
		Buttons B0 = new Buttons(sum, 0);
		Buttons B1 = new Buttons(sum, 1);
		Buttons B2 = new Buttons(sum, 2);
		Buttons B3 = new Buttons(sum, 3);
		Buttons B4 = new Buttons(sum, 4);
		Buttons B5 = new Buttons(sum, 5);
		Buttons B6 = new Buttons(sum, 6);
		Buttons B7 = new Buttons(sum, 7);
		Buttons B8 = new Buttons(sum, 8);
		Buttons B9 = new Buttons(sum, 9);
		
		
		plus.addActionListener(P);
		minus.addActionListener(M);
		times.addActionListener(T);
		divide.addActionListener(D);
		equals.addActionListener(E);
		
		zero.addActionListener(B0);
		one.addActionListener(B1);
		two.addActionListener(B2);
		three.addActionListener(B3);
		four.addActionListener(B4);
		five.addActionListener(B5);
		six.addActionListener(B6);
		seven.addActionListener(B7);
		eight.addActionListener(B8);
		nine.addActionListener(B9);


		win.add(p1, BorderLayout.NORTH);
		win.add(p2, BorderLayout.CENTER);
		
		p1.add(sum);
		
		p2.add(seven);
		p2.add(eight);
		p2.add(nine);
		p2.add(divide);
		
		p2.add(four);
		p2.add(five);
		p2.add(six);
		p2.add(times);
		
		p2.add(one);
		p2.add(two);
		p2.add(three);
		p2.add(minus);	
		p2.add(zero);
		p2.add(clear);
		p2.add(equals);
		p2.add(plus);

		win.setSize(400, 500);
		win.setVisible(true);
		
	}

}
