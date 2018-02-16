import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculations implements ActionListener {
	
	JFrame F;
	JTextField t1, t2, t3;
	JButton btn;
	JLabel l1, l2, l3, empty;
	float zero;
	
	public Calculations()
	{
		F = new JFrame();
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		
		t1.setText(Float.toString(zero));
		t2.setText(Float.toString(zero));
		t3.setText(Float.toString(zero));
		
		l1 = new JLabel("First Number");
		l2 = new JLabel("Second Number");
		empty = new JLabel("");
		l3 = new JLabel("Result");
		
		btn = new JButton("Calculate");
		
		F.setLayout(new GridLayout(5, 2));
		
		btn.addActionListener(this);
		
		F.add(l1);
		F.add(t1);
		F.add(l2);
		F.add(t2);
		F.add(empty);
		F.add(btn);
		F.add(l3);
		F.add(t3);
		
		F.setSize(400, 400);
		
	}

	public void showWindow(String title) {
		
		F.setTitle(title);
		F.setVisible(true);
		
	}


	public void actionPerformed(ActionEvent e) 
	{
	
		float A, B, C;
		String T;
		
		A = Float.parseFloat(t1.getText());
		B = Float.parseFloat(t2.getText());
		T = F.getTitle();
		
		if(T.equals("Addition"))
		{
			C = A + B;
			t3.setText(Float.toString(C));
		}
		if(T.equals("Subtraction"))
		{
			C = A - B;
			t3.setText(Float.toString(C));
		}
		if(T.equals("Multiply"))
		{
			C = A * B;
			t3.setText(Float.toString(C));
		}
		if(T.equals("Divide"))
		{
			C = A / B;
			t3.setText(Float.toString(C));
		}
		if(T.equals("Exit"))
		{
			System.exit(0);
		}
		
		
	}

}
