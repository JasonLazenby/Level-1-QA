import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operations implements ActionListener {
	
	TextField T1;
	float firstNumber;
	String op;

	public Operations(TextField A) {
		
		T1 = A;
		
	}


	public void actionPerformed(ActionEvent ee) {
		
		Button Btn = (Button)ee.getSource();
		String L = Btn.getLabel();
		
		try {
		
		if(L.equals("C"))
		{
			T1.setText("");
		}
		else if(L.equals("+"))
		{
			firstNumber = Float.parseFloat(T1.getText());
			op = L;
			T1.setText("");
		}
		else if(L.equals("-"))
		{
			firstNumber =  Float.parseFloat(T1.getText());
			op = L;
			T1.setText("");
		}
		else if(L.equals("x"))
		{
			firstNumber =  Float.parseFloat(T1.getText());
			op = L;
			T1.setText("");
		}
		else if(L.equals("/"))
		{
			firstNumber =  Float.parseFloat(T1.getText());
			op = L;
			T1.setText("");
		}
		else if(L.equals("="))
		{
			float A,B;
			A =  Float.parseFloat(T1.getText());
			
			if(op.equals("+"))
			{
				B = firstNumber + A;
				T1.setText(Float.toString(B));
			}
			if(op.equals("-"))
			{
				B = firstNumber - A;
				T1.setText(Float.toString(B));
			}
			if(op.equals("x"))
			{
				B = firstNumber * A;
				T1.setText(Float.toString(B));
			}
			if(op.equals("/"))
			{
				B = firstNumber / A;
				T1.setText(Float.toString(B));
			}
		}
		}
		catch(Exception e)
		{
			System.out.print("Error" + "\n");
		}
		
		
		
	
		
	}

}
