import java.util.ArrayList;

public class Vehicle {
	
	private String colour;
	private int speed;
	
	public Vehicle(String startColour, int startSpeed)
	{
		colour = startColour;
		speed = startSpeed;
	}
	
	public String toString() 
    {
        return("Vehicle Colour is: "+ colour
                +"\n"
                + "Speed of Vehicle is "+ speed + " MPH");
    } 

	
	public void applyBrake(int minusSpeed)
	{
		speed -= minusSpeed;
	}
	
	public void speedUp(int plusSpeed)
	{
		speed += plusSpeed;
	}

	
}
