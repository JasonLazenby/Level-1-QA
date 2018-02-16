
public class TestResults {

	public static void main(String[] args) {
		
		Results jason = new Results();
		
		jason.setPhysics(99);
		jason.setChemistry(122);
		jason.setMaths(106);
		
		jason.showResults();
		jason.failCheck();
		
	}

}
