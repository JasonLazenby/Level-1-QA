
public class Results {

	private int phy, che, met, fail;
	private float total, per;
	
	
	public void showResults()
	{
		total = phy + che + met;
		per = total * 100/450;
		
		System.out.println("Marks : " + total);
		System.out.println("Percentage : " + per);
	}
	
	public void setPhysics(int A)
	{
		if(A >= 0 && A <= 150)
		{
			phy = A;
		}
		else
		{
			System.out.println("Invalid Physics Marks");
		}
		if (A < 90)
		{
			fail = fail + 1;
			System.out.println("You Failed Your Physics Exam");
		}
	}
	
	public void setChemistry(int A)
	{
		if(A >= 0 && A <= 150)
		{
			che = A;
		}
		else
		{
			System.out.println("Invalid Chemistry Marks");
		}
		if (A < 90)
		{
			fail = fail + 1;
			System.out.println("You Failed Your Chemistry Exam");
		}
	}
	
	public void setMaths(int A)
	{
		if(A >= 0 && A <= 150)
		{
			met = A;
		}
		else
		{
			System.out.println("Invalid Maths Marks");
		}
		if (A < 90)
		{
			fail = fail + 1;
			System.out.println("You Failed Your Maths Exam");
		}
		
	}
	
	public void failCheck()
	{
		if (fail == 0)
		{
			System.out.println("You Passed You Are Amazing");
		}
		else if (fail == 1)
		{
			System.out.println("Retake The Exam");
		} 
		else if (fail == 2)
		{
			System.out.println("Retake The Course");
		}
		else if (fail == 3)
		{
			System.out.println("Go Home You Mug");
		}
	}


}
