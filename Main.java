import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static int playerXPosition;
	public static int playerYPosition;
	
	public static int winXPosition;
	public static int winYPosition;
	
	public static String downMove = "d";
	public static String upMove = "u";
	public static String leftMove = "l";
	public static String rightMove = "r";
	public static String help = "h";
	public static String showTreasure = "s";
	public static int xMovesAway;
	public static int yMovesAway;
	
	public static int playerScore;
	
	public static String [][] gameBoard = new String[9][9];
	
	public static void main(String[] args) {
		
		System.out.println("GameBoard Size Is: " + gameBoard.length + " X " + gameBoard.length + "\n");
		
		setTreasureposition();
		setPlayerPosition();
		
		System.out.println("Player is the p" + "\n");
		
		reDrawBoard();
		
		userInput();	
		
	}
	
	public static void setTreasureposition()
	{
		winXPosition = randNumber(gameBoard);
		winYPosition = randNumber(gameBoard);
	}
	public static void setPlayerPosition()
	{
		playerYPosition = gameBoard.length/2;
		playerXPosition = gameBoard.length/2;
	}
	public static void userInput()
	{
		Scanner scanner = new Scanner(System.in);

	    System.out.print("\n" + "Enter your move d = Down, u = Up, l = Left, r = Right. Or h for help:  " + "\n");

	    String userMove = scanner.next();
	    
	    if (userMove.equals(help))
	    {
	    	xMovesAway = Math.abs(winXPosition - playerXPosition);
	    	yMovesAway = Math.abs(winYPosition - playerYPosition);
	    	System.out.println("You are: " + Math.abs(yMovesAway + xMovesAway) + "m" + " away from the treasure" + "\n");
	    	reDrawBoard();
	    }
	    
	    if(userMove.equals(showTreasure))
	    {
	    	for (int i = 0; i < gameBoard.length; i++)
			{
				   for (int z = 0; z < gameBoard.length; z++)
				   {
					  gameBoard[i][z] = "  -  "; 
					  gameBoard[playerXPosition][playerYPosition] = "  p  ";
					  gameBoard[winXPosition][winYPosition] = "  t  ";
				      System.out.print(" " + gameBoard[i][z] + " ");   
	
				   }
				   System.out.println();		   
			}
	    }
	    
	    if (playerXPosition >= 0 & playerXPosition <= gameBoard.length)
	    {
	    
	    	if (userMove.equals(downMove))
	    	{
  		
	    		playerXPosition = playerXPosition + 1;
	    		reDrawBoard();
	    		
	    		if (playerXPosition == winXPosition && playerYPosition == winYPosition)
	    		{
	    			System.out.println(" __     ______  _    _   ______ ____  _    _ _   _ _____    _______ _    _ ______   _______ _____  ______           _____ _    _ _____  ______ _ \r\n" + 
	    					" \\ \\   / / __ \\| |  | | |  ____/ __ \\| |  | | \\ | |  __ \\  |__   __| |  | |  ____| |__   __|  __ \\|  ____|   /\\    / ____| |  | |  __ \\|  ____| |\r\n" + 
	    					"  \\ \\_/ / |  | | |  | | | |__ | |  | | |  | |  \\| | |  | |    | |  | |__| | |__       | |  | |__) | |__     /  \\  | (___ | |  | | |__) | |__  | |\r\n" + 
	    					"   \\   /| |  | | |  | | |  __|| |  | | |  | | . ` | |  | |    | |  |  __  |  __|      | |  |  _  /|  __|   / /\\ \\  \\___ \\| |  | |  _  /|  __| | |\r\n" + 
	    					"    | | | |__| | |__| | | |   | |__| | |__| | |\\  | |__| |    | |  | |  | | |____     | |  | | \\ \\| |____ / ____ \\ ____) | |__| | | \\ \\| |____|_|\r\n" + 
	    					"    |_|  \\____/ \\____/  |_|    \\____/ \\____/|_| \\_|_____/     |_|  |_|  |_|______|    |_|  |_|  \\_\\______/_/    \\_\\_____/ \\____/|_|  \\_\\______(_)\r\n" + 
	    					"                                                                                                                                                 \r\n" + 
	    					"                                                                                                                                                 \r\n" + 
	    					"\r\n" + 
	    					"\r\n" + 
	    					"");
	    			System.exit(0);
	    		}
	    	}
	    	else if(userMove.equals(upMove))
	    	{
	    		
	    		playerXPosition = playerXPosition - 1;
	    		reDrawBoard();
	    	
	    		if (playerXPosition == winXPosition && playerYPosition == winYPosition )
	    		{
	    			System.out.println(" __     ______  _    _   ______ ____  _    _ _   _ _____    _______ _    _ ______   _______ _____  ______           _____ _    _ _____  ______ _ \r\n" + 
	    					" \\ \\   / / __ \\| |  | | |  ____/ __ \\| |  | | \\ | |  __ \\  |__   __| |  | |  ____| |__   __|  __ \\|  ____|   /\\    / ____| |  | |  __ \\|  ____| |\r\n" + 
	    					"  \\ \\_/ / |  | | |  | | | |__ | |  | | |  | |  \\| | |  | |    | |  | |__| | |__       | |  | |__) | |__     /  \\  | (___ | |  | | |__) | |__  | |\r\n" + 
	    					"   \\   /| |  | | |  | | |  __|| |  | | |  | | . ` | |  | |    | |  |  __  |  __|      | |  |  _  /|  __|   / /\\ \\  \\___ \\| |  | |  _  /|  __| | |\r\n" + 
	    					"    | | | |__| | |__| | | |   | |__| | |__| | |\\  | |__| |    | |  | |  | | |____     | |  | | \\ \\| |____ / ____ \\ ____) | |__| | | \\ \\| |____|_|\r\n" + 
	    					"    |_|  \\____/ \\____/  |_|    \\____/ \\____/|_| \\_|_____/     |_|  |_|  |_|______|    |_|  |_|  \\_\\______/_/    \\_\\_____/ \\____/|_|  \\_\\______(_)\r\n" + 
	    					"                                                                                                                                                 \r\n" + 
	    					"                                                                                                                                                 \r\n" + 
	    					"\r\n" + 
	    					"\r\n" + 
	    					"");
	    			System.exit(0);
	    		}
  	
	    	}
	    }
	    
	    if (playerYPosition >= 0 & playerYPosition <= gameBoard.length)
	    {
	    
	    	if(userMove.equals(leftMove))
	    	{
	    		
	    		playerYPosition = playerYPosition - 1;
	    		reDrawBoard();
	    	
	    		if (playerXPosition == winXPosition && playerYPosition == winYPosition )
	    		{
	    			System.out.println(" __     ______  _    _   ______ ____  _    _ _   _ _____    _______ _    _ ______   _______ _____  ______           _____ _    _ _____  ______ _ \r\n" + 
	    					" \\ \\   / / __ \\| |  | | |  ____/ __ \\| |  | | \\ | |  __ \\  |__   __| |  | |  ____| |__   __|  __ \\|  ____|   /\\    / ____| |  | |  __ \\|  ____| |\r\n" + 
	    					"  \\ \\_/ / |  | | |  | | | |__ | |  | | |  | |  \\| | |  | |    | |  | |__| | |__       | |  | |__) | |__     /  \\  | (___ | |  | | |__) | |__  | |\r\n" + 
	    					"   \\   /| |  | | |  | | |  __|| |  | | |  | | . ` | |  | |    | |  |  __  |  __|      | |  |  _  /|  __|   / /\\ \\  \\___ \\| |  | |  _  /|  __| | |\r\n" + 
	    					"    | | | |__| | |__| | | |   | |__| | |__| | |\\  | |__| |    | |  | |  | | |____     | |  | | \\ \\| |____ / ____ \\ ____) | |__| | | \\ \\| |____|_|\r\n" + 
	    					"    |_|  \\____/ \\____/  |_|    \\____/ \\____/|_| \\_|_____/     |_|  |_|  |_|______|    |_|  |_|  \\_\\______/_/    \\_\\_____/ \\____/|_|  \\_\\______(_)\r\n" + 
	    					"                                                                                                                                                 \r\n" + 
	    					"                                                                                                                                                 \r\n" + 
	    					"\r\n" + 
	    					"\r\n" + 
	    					"");
	    			System.exit(0);
	    		}

	    	}
	    	else if(userMove.equals(rightMove))
	    	{
	    		
	    		playerYPosition = playerYPosition + 1;
	    		reDrawBoard();
	    	
	    		if (playerXPosition == winXPosition && playerYPosition == winYPosition )
	    		{
	    			System.out.println(" __     ______  _    _   ______ ____  _    _ _   _ _____    _______ _    _ ______   _______ _____  ______           _____ _    _ _____  ______ _ \r\n" + 
	    					" \\ \\   / / __ \\| |  | | |  ____/ __ \\| |  | | \\ | |  __ \\  |__   __| |  | |  ____| |__   __|  __ \\|  ____|   /\\    / ____| |  | |  __ \\|  ____| |\r\n" + 
	    					"  \\ \\_/ / |  | | |  | | | |__ | |  | | |  | |  \\| | |  | |    | |  | |__| | |__       | |  | |__) | |__     /  \\  | (___ | |  | | |__) | |__  | |\r\n" + 
	    					"   \\   /| |  | | |  | | |  __|| |  | | |  | | . ` | |  | |    | |  |  __  |  __|      | |  |  _  /|  __|   / /\\ \\  \\___ \\| |  | |  _  /|  __| | |\r\n" + 
	    					"    | | | |__| | |__| | | |   | |__| | |__| | |\\  | |__| |    | |  | |  | | |____     | |  | | \\ \\| |____ / ____ \\ ____) | |__| | | \\ \\| |____|_|\r\n" + 
	    					"    |_|  \\____/ \\____/  |_|    \\____/ \\____/|_| \\_|_____/     |_|  |_|  |_|______|    |_|  |_|  \\_\\______/_/    \\_\\_____/ \\____/|_|  \\_\\______(_)\r\n" + 
	    					"                                                                                                                                                 \r\n" + 
	    					"                                                                                                                                                 \r\n" + 
	    					"\r\n" + 
	    					"\r\n" + 
	    					"");
	    			playerScore = playerScore + 10;
	    			setTreasureposition();
	    		}
	
	    	}

	    }
	    
	    userInput();    
	 }	
	public static int randNumber(String[][] gameBoard)
	{
		Random rand = new Random();
		int n = rand.nextInt(gameBoard.length);
		return n;
	}
	public static void reDrawBoard()
	{
		for (int i = 0; i < gameBoard.length; i++)
		{
			   for (int z = 0; z < gameBoard.length; z++)
			   {
				  gameBoard[i][z] = "  -  "; 
				  gameBoard[playerXPosition][playerYPosition] = "  p  ";
				  //gameBoard[winXPosition][winYPosition] = "  t  ";
			      System.out.print(" " + gameBoard[i][z] + " ");   
			   }
			   System.out.println();		   
		}
	}
	
}
