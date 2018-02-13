
public class Blackjack {

	public static void main(String[] args) {
		
		
		System.out.println(lessThan21(18, 19, 21));

	}
	
	static int lessThan21(int firstNumber, int secondNumber, int blackJackNumber)
	{
		
		if (firstNumber <= blackJackNumber & firstNumber >= secondNumber | secondNumber > blackJackNumber & firstNumber <= blackJackNumber)
		{
			return firstNumber;
		}
		else if (secondNumber <= blackJackNumber)
		{
			return secondNumber;
		}
		else 
		{
			return 0;
		}


		
	}
	


}
