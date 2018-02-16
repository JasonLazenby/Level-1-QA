
public class Main {

	public static void main(String[] args) {
		
		TaxCalculations T = new TaxCalculations();
		
		try {
			float netSalary = T.calculateNetSalary(11500, 0);
			System.out.println(netSalary);
		}
		catch(MyException E) {
			System.out.println("You Done Goofed Not Going To Work!");
		}
	}
}
