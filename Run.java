import java.text.NumberFormat;

public class Run {


	public static void main(String[] args) {
		
		NumbersToWords x = new NumbersToWords();
	
		int number;

		number = 7265;
		
		System.out.println(NumberFormat.getInstance().format(number) + "='" + x.digitToWord(number) + "'");

	}

}
