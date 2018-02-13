import java.text.NumberFormat;

public class NumbersToWords {

	private String[] oneToNineteen = {"", "One", "Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve","Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen"};

	private String[] twentyToOneHundred = {"", "",	"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

	public String digitToWord(int i) 
	{

		if (i < 0) 
		{
			return "Minus " + digitToWord(-i);
		}

		if (i < 20) 
		{
			return oneToNineteen[i];
		}

		if (i < 100) 
		{
			return twentyToOneHundred[i/10] + ((i % 10 != 0) ? " " : "") + oneToNineteen[i%10];
		}

		return oneToNineteen[i/100] + " Hundred and" + ((i%100 != 0) ? " " : "") + digitToWord(i%100);
	}
	
}
