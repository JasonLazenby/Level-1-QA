import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static String word;
	public static String backupWord;
	public static String secWord;
	public static boolean didTheyWin = false;
	public static String replacementWord;
	public static int replaceWordLocation;
	public static boolean isGameOver = true;
	public static int numberOfLives = 7;

	public static void main(String[] args) throws IOException {

		
		File words = new File("\\Users\\Admin\\Documents\\words.txt");
		Scanner wordReader = new Scanner(words);
		
		try 
		{
			wordReader = new Scanner(words);
		} 
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		ArrayList<String> wordList = new ArrayList<String>();
		
		while (wordReader.hasNextLine())
		{
		    wordList.add(wordReader.nextLine()); 
		}
		
		wordReader.close();
		
		System.out.println(randNumber(wordList));
		//System.out.println(backupWord);
		setBlanks();
		
		while(isGameOver = true)
		{
			userInput();
		}	
	}
	
	public static void setBlanks()
	{
		secWord = word.replaceAll("[a-zA-Z]", "_");
		System.out.println(secWord);
		System.out.println("Number Of Lives Left: " + numberOfLives);
	}
	
	public static void userInput()
	{
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter your guess: ");

	    String userGuess = scanner.next();
	    
	    char letter = userGuess.charAt(0);
	    
	    StringBuilder sb = new StringBuilder(word.length());
  
	    if (word.contains(userGuess))
	    {
	    
	    for(int i = 0; i < word.length(); i++)
	    {	
	    	if (letter == word.charAt(i))
	    	{
	    		sb.append(letter);	
	    	}
	    	else
	    	{
	    		sb.append(secWord.charAt(i));
	    	}
	    }
	    
	    secWord = new String(sb.toString());
	    
	    }
	    else
	    {
	    	numberOfLives = numberOfLives - 1;
	    	System.out.println("Number Of Lives Left: " + numberOfLives);
	    	
	    	if(numberOfLives == 0)
	    	{
	    		System.out.println("GAME OVER!");
	    		System.out.println("The Word Was : " + word);
	    		System.exit(0);
	    	}
	    }
	    
	    isGameOver = false;
	   
	    System.out.println(secWord);
	}
	
	public static int randNumber(ArrayList<String> wordList)
	{
		Random rand = new Random();
		int n = rand.nextInt(wordList.size());
		word = wordList.get(n);
		backupWord = wordList.get(n);
		return n;
	}

}
