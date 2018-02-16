
public class TooHot {

	public static void main(String[] args) {
		
		System.out.println(tooHot(99, false));

	}
	
	static boolean tooHot(int temp, boolean isSummer)
	{
		

		if (isSummer)
		{
			if(temp >= 60 & temp <= 100)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		else if (temp >= 60 & temp <= 90)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
