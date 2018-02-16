
public class TaxCalculations {

	
	public float calculateNetSalary(int salary, int absents)throws MyException
	{
		float netSalary = 0;
		if(absents >= 14)
		{
			MyException E = new MyException();
			throw E;
		}
		netSalary = salary * 80/100 - (salary/30 * absents);
		return netSalary;
	}
}
