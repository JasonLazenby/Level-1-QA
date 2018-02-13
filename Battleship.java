public class Battleship extends Vehicle {


	private int numberOfGuns;
	
	public Battleship(String colour, int speed, int numberOfGuns)
	{
		super(colour, speed);
		this.numberOfGuns = numberOfGuns;
	}
	
	public void setNumberOfGuns(int newNumberOfGuns)
	{
		this.numberOfGuns = newNumberOfGuns;
	}
	
	public int getNumberOfGuns() 
	{
		return numberOfGuns;
	}
	
	public String toString()
	{
		return (super.toString()+
				"\nThis Ship has " + numberOfGuns + " Guns");
	}


}
