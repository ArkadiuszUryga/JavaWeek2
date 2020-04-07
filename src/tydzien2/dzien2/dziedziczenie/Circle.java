package tydzien2.dzien2.dziedziczenie;

public class Circle extends Shape {
	private double radius;
	public Circle(double x, double y, String color, double radius) {
		
		super(x, y, color);
		this.radius=radius;
		
	}
	protected String getDescription() {
		String description="To jest koło. Posiada środek o współrzędnych "+this.getX()+", "+this.getY()+" promień o długości "+this.radius+" i kolor: "+this.getColor();
		return description;
		
	}
	protected double getArea() {
		double result=Math.PI*Math.pow(this.radius, 2);
		return result;
		
	}
	//6. Mieć metodę zwracającą obwód o nazwie `getCircuit()` zwracającą wartość typu `double`.

	protected double getCircuit() {
		double result=2*Math.PI*this.radius;
		return result;
	}
	
	

}
