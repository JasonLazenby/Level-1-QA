import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons implements ActionListener {
	
	Label labelSum;
	int number;
	

	public Buttons(Label sum, int i) 
	{
		labelSum = sum;
		number = i;
	
	}

	public void actionPerformed(ActionEvent x) 
	{
		
		labelSum.setText(labelSum.getText() + number);
			
	}
	


	
}
