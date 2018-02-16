import java.util.Scanner;

public class NumberToWords {
	
	public int firstDigit;
    public int secondDigit;
    public int thirdDigit;

	public static void main(String[] args) {
		
		NumberToWords numberWords = new NumberToWords();
		
		numberWords.input();
		
	}
	
	public void input()
	{
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter A Number Between 1-999 : ");

	    int userMove = scanner.nextInt();
	    
	    if (userMove > 1 && userMove <=990)
	    {
	    	firstDigit = userMove/10;
	    	secondDigit = userMove%10;
	    	thirdDigit = userMove/100;
	    	twoNumbers();
	    	threeNumbers();
	    }
	    
	}
	
	public void threeNumbers()
	{

	switch (thirdDigit) {

		case 1: thirdDigit = 1;
		System.out.println("One Hundred and ");
		twoNumbers();
		break;
		case 2: thirdDigit = 2;
		System.out.println("Two Hundred and ");
		twoNumbers();
		break;
		case 3: thirdDigit = 3;
		System.out.println("Three Hundred and ");
		twoNumbers();
		break;
		case 4: thirdDigit = 4;
		System.out.println("Four Hundred and ");
		twoNumbers();
		break;
		case 5: thirdDigit = 5;
		System.out.println("Five Hundred and ");
		twoNumbers();
		break;
		case 6: thirdDigit = 6;
		System.out.println("Six Hundred and ");
		twoNumbers();
		break;
		case 7: thirdDigit = 7;
		System.out.println("Seven Hundred and ");
		twoNumbers();
		break;
		case 8: thirdDigit = 8;
		System.out.println("Eight Hundred and ");
		twoNumbers();
		break;
		case 9: thirdDigit = 9;
		System.out.println("Nine Hundred and ");
		twoNumbers();
		break;
	}
	
}
	public void twoNumbers()
	{
		if(firstDigit == 1)
	    {
	    	switch (secondDigit) {
	    		case 1: secondDigit = 1;
	    		System.out.println("Eleven");
	    		break;
	    		case 2: secondDigit = 2;
	    		System.out.println("Twelve");
	    		break;
	    		case 3: secondDigit = 3;
	    		System.out.println("Thirteen");
	    		break;
	    		case 4: secondDigit = 4;
	    		System.out.println("Fourteen");
	    		break;
	    		case 5: secondDigit = 5;
	    		System.out.println("Fifteen");
	    		break;
	    		case 6: secondDigit = 6;
	    		System.out.println("Sixteen");
	    		break;
	    		case 7: secondDigit = 7;
	    		System.out.println("Seventeen");
	    		break;
	    		case 8: secondDigit = 8;
	    		System.out.println("Eighteen");
	    		break;
	    		case 9: secondDigit = 9;
	    		System.out.println("Nineteen");
	    		break;
	    	}
	    }
	    
	    if(firstDigit == 2)
	    {
	    	switch (secondDigit) {
    		case 1: secondDigit = 1;
    		System.out.println("Twenty One");
    		break;
    		case 2: secondDigit = 2;
    		System.out.println("Twenty Two");
    		break;
    		case 3: secondDigit = 3;
    		System.out.println("Twenty Three");
    		break;
    		case 4: secondDigit = 4;
    		System.out.println("Twenty Four");
    		break;
    		case 5: secondDigit = 5;
    		System.out.println("Twenty Five");
    		break;
    		case 6: secondDigit = 6;
    		System.out.println("Twenty Six");
    		break;
    		case 7: secondDigit = 7;
    		System.out.println("Twenty Seven");
    		break;
    		case 8: secondDigit = 8;
    		System.out.println("Twenty Eight");
    		break;
    		case 9: secondDigit = 9;
    		System.out.println("Twenty Nine");
    		break;
	    	}
	    }
	    
	    if(firstDigit == 3)
	    {
	    	switch (secondDigit) {
    		case 1: secondDigit = 1;
    		System.out.println("Thirty One");
    		break;
    		case 2: secondDigit = 2;
    		System.out.println("Thirty Two");
    		break;
    		case 3: secondDigit = 3;
    		System.out.println("Thirty Three");
    		break;
    		case 4: secondDigit = 4;
    		System.out.println("Thirty Four");
    		break;
    		case 5: secondDigit = 5;
    		System.out.println("Thirty Five");
    		break;
    		case 6: secondDigit = 6;
    		System.out.println("Thirty Six");
    		break;
    		case 7: secondDigit = 7;
    		System.out.println("Thirty Seven");
    		break;
    		case 8: secondDigit = 8;
    		System.out.println("Thirty Eight");
    		break;
    		case 9: secondDigit = 9;
    		System.out.println("Thirty Nine");
    		break;
	    	}
	    }
	    
	    if(firstDigit == 4)
	    {
	    	switch (secondDigit) {
    		case 1: secondDigit = 1;
    		System.out.println("Fourty One");
    		break;
    		case 2: secondDigit = 2;
    		System.out.println("Fourty Two");
    		break;
    		case 3: secondDigit = 3;
    		System.out.println("Fourty Three");
    		break;
    		case 4: secondDigit = 4;
    		System.out.println("Fourty Four");
    		break;
    		case 5: secondDigit = 5;
    		System.out.println("Fourty Five");
    		break;
    		case 6: secondDigit = 6;
    		System.out.println("Fourty Six");
    		break;
    		case 7: secondDigit = 7;
    		System.out.println("Fourty Seven");
    		break;
    		case 8: secondDigit = 8;
    		System.out.println("Fourty Eight");
    		break;
    		case 9: secondDigit = 9;
    		System.out.println("Fourty Nine");
    		break;
	    	}
	    }
	    
	    if(firstDigit == 5)
	    {
	    	switch (secondDigit) {
    		case 1: secondDigit = 1;
    		System.out.println("Fifty One");
    		break;
    		case 2: secondDigit = 2;
    		System.out.println("Fifty Two");
    		break;
    		case 3: secondDigit = 3;
    		System.out.println("Fifty Three");
    		break;
    		case 4: secondDigit = 4;
    		System.out.println("Fifty Four");
    		break;
    		case 5: secondDigit = 5;
    		System.out.println("Fifty Five");
    		break;
    		case 6: secondDigit = 6;
    		System.out.println("Fifty Six");
    		break;
    		case 7: secondDigit = 7;
    		System.out.println("Fifty Seven");
    		break;
    		case 8: secondDigit = 8;
    		System.out.println("Fifty Eight");
    		break;
    		case 9: secondDigit = 9;
    		System.out.println("Fifty Nine");
    		break;
	    	}
	    }
	    
	    if(firstDigit == 6)
	    {
	    	switch (secondDigit) {
    		case 1: secondDigit = 1;
    		System.out.println("Sixty One");
    		break;
    		case 2: secondDigit = 2;
    		System.out.println("Sixty Two");
    		break;
    		case 3: secondDigit = 3;
    		System.out.println("Sixty Three");
    		break;
    		case 4: secondDigit = 4;
    		System.out.println("Sixty Four");
    		break;
    		case 5: secondDigit = 5;
    		System.out.println("Sixty Five");
    		break;
    		case 6: secondDigit = 6;
    		System.out.println("Sixty Six");
    		break;
    		case 7: secondDigit = 7;
    		System.out.println("Sixty Seven");
    		break;
    		case 8: secondDigit = 8;
    		System.out.println("Sixty Eight");
    		break;
    		case 9: secondDigit = 9;
    		System.out.println("Sixty Nine");
    		break;
	    	}
	    }
	    
	    if(firstDigit == 7)
	    {
	    	switch (secondDigit) {
    		case 1: secondDigit = 1;
    		System.out.println("Seventy One");
    		break;
    		case 2: secondDigit = 2;
    		System.out.println("Seventy Two");
    		break;
    		case 3: secondDigit = 3;
    		System.out.println("Seventy Three");
    		break;
    		case 4: secondDigit = 4;
    		System.out.println("Seventy Four");
    		break;
    		case 5: secondDigit = 5;
    		System.out.println("Seventy Five");
    		break;
    		case 6: secondDigit = 6;
    		System.out.println("Seventy Six");
    		break;
    		case 7: secondDigit = 7;
    		System.out.println("Seventy Seven");
    		break;
    		case 8: secondDigit = 8;
    		System.out.println("Seventy Eight");
    		break;
    		case 9: secondDigit = 9;
    		System.out.println("Seventy Nine");
    		break;
	    	}
	    }
	    
	    if(firstDigit == 8)
	    {
	    	switch (secondDigit) {
    		case 1: secondDigit = 1;
    		System.out.println("Eighty One");
    		break;
    		case 2: secondDigit = 2;
    		System.out.println("Eighty Two");
    		break;
    		case 3: secondDigit = 3;
    		System.out.println("Eighty Three");
    		break;
    		case 4: secondDigit = 4;
    		System.out.println("Eighty Four");
    		break;
    		case 5: secondDigit = 5;
    		System.out.println("Eighty Five");
    		break;
    		case 6: secondDigit = 6;
    		System.out.println("Eighty Six");
    		break;
    		case 7: secondDigit = 7;
    		System.out.println("Eighty Seven");
    		break;
    		case 8: secondDigit = 8;
    		System.out.println("Eighty Eight");
    		break;
    		case 9: secondDigit = 9;
    		System.out.println("Eighty Nine");
    		break;
	    	}
	    }
	    
	    if(firstDigit == 9)
	    {
	    	switch (secondDigit) {
    		case 1: secondDigit = 1;
    		System.out.println("Ninety One");
    		break;
    		case 2: secondDigit = 2;
    		System.out.println("Ninety Two");
    		break;
    		case 3: secondDigit = 3;
    		System.out.println("Ninety Three");
    		break;
    		case 4: secondDigit = 4;
    		System.out.println("Ninety Four");
    		break;
    		case 5: secondDigit = 5;
    		System.out.println("Ninety Five");
    		break;
    		case 6: secondDigit = 6;
    		System.out.println("Ninety Six");
    		break;
    		case 7: secondDigit = 7;
    		System.out.println("Ninety Seven");
    		break;
    		case 8: secondDigit = 8;
    		System.out.println("Ninety Eight");
    		break;
    		case 9: secondDigit = 9;
    		System.out.println("Ninety Nine");
    		break;
	    	}
	    }
	}
}
