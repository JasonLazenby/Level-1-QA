
public class StringProcess {

	private String backWord = "";
	private int blankspaces = 0;
	
	public void printMessage1(String msg)
	{
		int i;
		for (i = 0; i < msg.length(); i++)
		{
			System.out.print(msg.substring(i, i + 1));
			if(msg.substring(i, i + 1).equals(" "))
			{
				System.out.println("\n");
			}	
		}
		System.out.println("\n");	
	}
	
	public void wordLength(String msg)
	{
		int i;

		for(i = 0; i < msg.length(); i++)
		{
			if(msg.substring(i, i + 1).equals(" "))
			{
				blankspaces = blankspaces + 1;		
			}
		}	
		System.out.println("White Space: " + blankspaces + "\n");
		System.out.println("Word Lenght: " + msg.length() + "\n");
	}
	
	public void reverseWord(String msg) 
	{
		int i;

	    for(i = msg.length() - 1; i >= 0; i--) 
	    {		 
	    	backWord = backWord + msg.charAt(i);	
	    }
	    System.out.println(backWord + "\n");	    
	}

}
