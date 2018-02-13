public class Car extends Vehicle {

	private int numberOfWheels;
	
	public Car(String colour, int speed, int numberOfWheels)
	{
		super(colour, speed);
		this.numberOfWheels = numberOfWheels;
	}
	
	public String toString()
	{
		return (super.toString()+
				"\nThis Car has " + numberOfWheels + " Wheels");
	}

	public void setNumberOfWheels(int newWheelNumber)
	{
		this.numberOfWheels = newWheelNumber;
	}
	
	public int getNumberOfWheels() 
	{
		return numberOfWheels;
	}
	
}
