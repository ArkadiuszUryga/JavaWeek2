package tydzien2.dzien2.dziedziczenie;
//#### Zadanie 2.
//
//Stwórz klasę `Shape`, która ma spełniać następujące wymogi:
//
//1. Mieć prywatne atrybuty:
//`x`, `y` (określające środek tego kształtu) i `color`.
//2. Posiadać konstruktor przyjmujący zmienne określające wartości `x`, `y` i `color`. 
//3. Mieć metodę wypisującą informacje o tym kształcie o nazwie `getDescription()` zwracającą wartość typu `String`.
//4. Mieć metodę zwracającą odległość od środka innego kształtu o nazwie `getDistance(Shape shape)` zwracającą wartość typu `double`.
//
//Sprawdź, co się dzieje, kiedy zmieniasz dostęp do poszczególnych funkcji z publicznych na prywatne. 
//
//Stwórz klasę `Circle`, która ma spełniać następujące wymogi:
//
//1. Dziedziczyć po klasie definiującej kształt (`Shape`).
//2. Mieć dodatkowy atrybut `radius`.
//3. Mieć konstruktor przyjmujący zmienne określające wartości `x`, `y`, `color` i `radius`.
//4. Nadpisywać funkcje kształtu `getDescription()`.
//5. Mieć metodę zwracającą pole powierzchni o nazwie `getArea()` zwracającą wartość typu `double`. .
//6. Mieć metodę zwracającą obwód o nazwie `getCircuit()` zwracającą wartość typu `double`.
//
//Przetestuj metodę `getDistance(Shape shape)` na obiektach typu Circle.
public class Shape {
private double x,y;
private String color;
public Shape(double x,double y, String color) {
	this.setX(x);
	this.setY(y);
	this.setColor(color);
}
protected String getDescription() {
	String description="Ten obiekt posiada środek o współrzędnych "+this.getX()+", "+this.getY()+" i kolor: "+this.getColor();
	return description;
	
}
protected double getDistance(Shape shape2) {
	double distanceX=this.getX()-shape2.getX();
	distanceX=Math.abs(distanceX);
	double distanceY=this.getY()-shape2.getY();	//obliczam odległość między współrzędnymi Y
	//dla x obliczyłem wartość bezwzględną, ale niepotrzebnie, bo i tak będę obliczał kwadrat
	double distance=Math.pow(distanceX, 2)+Math.pow(distanceY, 2);//suma kwadratów przyprostokątnych
	distance=Math.sqrt(distance);//wyciągam pierwiastek i otrzymuję przeciwprostokątną
	return distance;
	
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}


}
