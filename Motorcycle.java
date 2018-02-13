
public class Motorcycle extends Vehicle {

	private int price;
	
	public Motorcycle(String colour, int speed, int price)
	{
		super(colour, speed);
		this.price = price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() 
	{
		return price;
	}

	public String toString()
	{
		return (super.toString()+
				"\nPrice is £" + price);
	}
	
	
}
