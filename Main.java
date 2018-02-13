
public class Main {
	
	static String helloWorld = "Hello World";
	
	static int[] arrayOfNumbers = {5,0,7,8,1,4,3,2,9,12};
	
	static int[] emptyArray = new int [10];
	

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		System.out.println(helloWorld);
		
		System.out.println(helloMethodString());
		
		helloMethodVoid();
		

		for (int i = 0; i < 10; i++)
		{
			System.out.println(addTwoNumbers(4, 0, false));
		}

		for (int i = 0; i < 10; i++)
		{
			System.out.println(addTwoNumbers(arrayOfNumbers[9-i], arrayOfNumbers[i], false));
		}
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(arrayOfNumbers[i]);
		}
		
		for (int i = 0; i < emptyArray.length; i++)
		{
			emptyArray[i] = i;
			System.out.println(emptyArray[i]);
		}
		
		for (int i = 0; i < emptyArray.length; i++)
		{
			emptyArray[i] = i * 10;
			System.out.println(emptyArray[i]);
		}
		
	}	

	static String helloMethodString()
	{
		
		return "Hello World";
		
	}
	
	
	static void helloMethodVoid()
	{
		System.out.println("Hello World");
		
	}
	
	static int addTwoNumbers(int firstNumber, int secondNumber, boolean bool)
	{
			
		if (firstNumber == 0)
		{
			return secondNumber;
		}
		
		else if(secondNumber == 0)
		{
			return firstNumber;
		}
	
	
		if (bool)
		{
			return firstNumber + secondNumber;
		}
		else
		{
			return firstNumber * secondNumber;
		}
			
	}
	
	
	

}
