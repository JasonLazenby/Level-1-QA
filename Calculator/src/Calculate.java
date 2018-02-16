import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate implements ActionListener {
	
	Label labelSum;
	TextField text2, text3;
	float firstNumber, secondNumber, total;
	String symbol;

	
	
	public Calculate(Label sum, String cc, TextField b, TextField c)
	{
		labelSum = sum;
		symbol = cc;
		text2 = b;
		text3 = c;
	}


	public void actionPerformed(ActionEvent C) {
		
		
		System.out.println(secondNumber);
			
			if(symbol == "+")
			{
				firstNumber = Float.parseFloat(labelSum.getText());
				text3.setText(symbol);
				text2.setText(Float.toString(firstNumber));
				labelSum.setText("");			
				
			}
			else if(symbol == "-")
			{
				firstNumber = Float.parseFloat(labelSum.getText());
				text3.setText(symbol);
				text2.setText(Float.toString(firstNumber));
				labelSum.setText("");
				
			}
			else if(symbol == "x")
			{
				firstNumber = Float.parseFloat(labelSum.getText());
				text3.setText(symbol);
				text2.setText(Float.toString(firstNumber));
				labelSum.setText("");
			}
			else if(symbol == "/")
			{
				firstNumber = Float.parseFloat(labelSum.getText());
				text3.setText(symbol);
				text2.setText(Float.toString(firstNumber));
				labelSum.setText("");
			}
			
			else if(symbol == "=")
			{
				secondNumber = Float.parseFloat(labelSum.getText());
				
				if(text3.getText()== "+")
				{
					firstNumber = Float.parseFloat(labelSum.getText());
					total = firstNumber + secondNumber;
					labelSum.setText(Float.toString(total));
					
				}
				if(text3.getText()== "-")
				{
					firstNumber = Float.parseFloat(labelSum.getText());
					total = firstNumber - secondNumber;
					labelSum.setText(Float.toString(total));
				}
				if(text3.getText()== "x")
				{
					firstNumber = Float.parseFloat(labelSum.getText());
					total = firstNumber * secondNumber;
					labelSum.setText(Float.toString(total));
				}
				if(text3.getText()== "/")
				{
					firstNumber = Float.parseFloat(labelSum.getText());
					total = firstNumber / secondNumber;
					labelSum.setText(Float.toString(total));
				}
				firstNumber = secondNumber = total = 0;

				
			}
			
			
		}
	

	
}
