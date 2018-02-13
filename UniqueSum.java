
public class UniqueSum {

	public static void main(String[] args) {
			
		System.out.println(uniqueSum(2, 1, 1));

	}
	
	static int uniqueSum(int firstNumber, int secondNumber, int thirdNumber)
	{
		if (firstNumber == secondNumber && secondNumber == thirdNumber)
		{
			return 0;
		}
		else if(firstNumber == secondNumber)
		{
			return thirdNumber;
		}
		else if(secondNumber == thirdNumber)
		{
			return firstNumber;
		}
		else if(thirdNumber == firstNumber)
		{
			return secondNumber;
		}
		else 
		{
			return firstNumber + secondNumber + thirdNumber;
		}

		
		
		
		
	}

}
