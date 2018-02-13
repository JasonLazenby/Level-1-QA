
public class Main {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		drawSomething(c);
		Square sq = new Square();
		drawSomething(sq);	

	}
	
	public static void drawSomething(Drawing x)
	{
		x.draw();
		x.fill();
		x.add();
		x.dan();
	}

}
