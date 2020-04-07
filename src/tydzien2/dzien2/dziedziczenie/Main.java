package tydzien2.dzien2.dziedziczenie;

public class Main {

	public static void main(String[] args) {
		Shape shape=new Shape(0,0,"czerwony");
		Shape shape2=new Shape(1,1,"niebieski");
		Circle circle=new Circle(4,1, "zielony", 1);
		System.out.println(shape.getDescription());
		System.out.println(shape.getDistance(shape2));
		System.out.println(circle.getDescription());
		System.out.println((circle.getArea()));
		System.out.println(circle.getCircuit());
		//Przetestuj metodę `getDistance(Shape shape)` na obiektach typu Circle.
		System.out.println(circle.getDistance(shape2));
		

	}

}
