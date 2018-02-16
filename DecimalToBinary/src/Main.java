import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		
		JFrame win = new JFrame("Decimal To Binary");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);

		JButton convert = new JButton("Convert to Binary");
		JButton convert1 = new JButton("Convert to Number");
		
		
		win.setLayout(new GridLayout(2, 3));
		
		win.add(t1);
		win.add(convert);
		win.add(t2);
		win.add(t3);
		win.add(convert1);
		win.add(t4);
		
		
		
		win.setSize(600,400);
		win.setVisible(true);
		
		
		
		convert.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				t2.setText("");
				
				int A, B;
				
				A = Integer.parseInt(t1.getText());
	
				for(int i = 0; A >= 1; i++)
				{		
					B = A%2;
					A = A/2;

					t2.setText(Integer.toString(B) + t2.getText());		
				}
				
			}
			
		});
		
		convert1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				t2.setText("");

				int B  = 0;

				String a = t3.getText();

				for(int i = a.length() - 1, p = 0; i >= 0; i--, p++)
				{			
					B += (int) Math.pow(2, p)*Integer.parseInt(a.substring(i, i + 1));
				}
				t4.setText(Integer.toString(B));
			}
			
		});

	}

}
