package tydzien2.dzien1.zadania_domowe;
//#### Zadanie 4.
//
//Stwórz klasę `User`, która ma spełniać następujące wymogi:

public class User {
	//1. Mieć prywatne atrybuty:
	// * `id` - atrybut ten powinien trzymać numer identyfikacyjny,
	private int id;
	// * `firstName` - atrybut określający imię autora,
	private String firstName;
	// * `lastName` - atrybut określający nazwisko autora,
	private String lastName;
	// * `books` - tablica referencji do klasy Book.
	private Book[] books;
	//2. Posiadać konstruktor przyjmujący id, imię, nazwisko.
	public User(int id,String firstName, String lastName) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
}
