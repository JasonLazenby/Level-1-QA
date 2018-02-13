import java.util.ArrayList;

public class Garage {
	
	public static void main(String[] args) {
		
		String newLine = "\n";
		
		Battleship battleship1 = new Battleship("Grey", 20, 1);
		Car car1 = new Car("Red", 45, 3);
		Motorcycle motorcycle = new Motorcycle("Yellow", 128, 2000);
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		
		vehicleList.add(battleship1);
		vehicleList.add(car1);
		vehicleList.add(motorcycle);
		
		System.out.println(vehicleList);

	}
	

}
