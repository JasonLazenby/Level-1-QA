import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Windows7 {

	public static void main(String[] args) {
		
		JFrame win = new JFrame();
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JButton Bplus = new JButton("+");
		JButton Bminus = new JButton("-");
		JButton Btimes = new JButton("x");
		JButton Bdivide = new JButton("/");
		
		win.setLayout(new GridLayout(3, 3));
		
		win.add(t1);
		win.add(t2);
		win.add(t3);
		win.add(Bplus);
		win.add(Bminus);
		win.add(Btimes);
		win.add(Bdivide);
		
		win.setSize(400,400);
		win.setVisible(true);
		
		
		
		Bplus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("+");	
			}
			
		});
		
		Bminus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("-");
			}
			
		});
		
		Btimes.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("x");	
			}
			
		});
		
		Bdivide.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("/");	
			}
			
		});
			
		
		

	}

}
