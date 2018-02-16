import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Windows implements ActionListener {
	
	JMenuItem item1, item2, item3, item4, exit;
	
	Calculations calc;
	
	public Windows()
	{
		JFrame win = new JFrame("Windows");
		JMenuBar menubar = new JMenuBar();
		JMenu menu1 = new JMenu("Maths");
		
		item1 = new JMenuItem("Addition");
		item2 = new JMenuItem("Subtraction");
		item3 = new JMenuItem("Multiply");
		item4 = new JMenuItem("Divide");
		exit = new JMenuItem("Exit");
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
		exit.addActionListener(this);
		
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		menu1.add(exit);
		
		
		menubar.add(menu1);
		
		win.setJMenuBar(menubar);
		win.setSize(400,400);
		win.setVisible(true);
		
		calc = new Calculations();
		
	}

	
	public void actionPerformed(ActionEvent e) {
		JMenuItem I = (JMenuItem) e.getSource();
		
		if (I == item1)
		{
			calc.showWindow("Addition");
		}
		if (I == item2)
		{
			calc.showWindow("Subtraction");
		}
		if (I == item3)
		{
			calc.showWindow("Multiply");
		}
		if (I == item4)
		{
			calc.showWindow("Divide");
		}

	
		
	}

}
