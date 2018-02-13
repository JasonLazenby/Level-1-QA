
public class Exception {

	
	
	public static void main(String[] args) {
		
		
		int A;
		
		try 
		{
			A = 4/0;
			System.out.println("Answer: " + A);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide by zero");
		}
	
	}
	
	

}
