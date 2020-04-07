package tydzien2.dzien1.metody;
//Utwórz klasę `Product` dodaj w niej atrybut:
//
//- name 
//
//Dodaj metody `setName` (ustawiającą `name`)  oraz `getName` (zwracającą `name`).
public class Product {
	private String name;

	public String getName() {
		return name;
	}

	public Product setName(String name) {
		this.name = name;
		return this;
	}
	
}
