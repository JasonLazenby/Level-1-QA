import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons implements ActionListener {
	
	TextField T;

	public Buttons(TextField A) 
	{	
		T = A;	
	}

	public void actionPerformed(ActionEvent e) 
	{
		
		Button Btn = (Button)e.getSource();
		T.setText(T.getText() + Btn.getLabel());
		
		
	}

}
