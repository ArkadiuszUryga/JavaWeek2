package tydzien2.dzien1.metody;
//#### Zadanie 5.
//Stwórz klasę `Car` posiadającą następujące atrybuty:
//
//- brand
//- model
//- price
//
//Stwórz metody dostępowe do ww. atrybutów tzw. gettery i settery.
//
//Dopisz metodę `toString`  wyświetlającą markę oraz cenę w jednej linii.
public class Car {
	private String brand;
	private String model;
	private double price;
	
	public Car setBrand(String brand) {
		this.brand=brand;
		return this;
	}
	public String getBrand() {
		return this.brand;
	}
	public Car setModel(String model) {
		this.model=model;
		return this;
	}
	public String getModel() {
		return this.model;
	}
	public Car setPrice(double price) {
		this.price=price;
		return this;
	}
	public double getPrice() {
		return this.price;
	}
	public String toString() {
		return getModel()+" "+getPrice();
	}
}
