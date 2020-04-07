package tydzien2.dzien1.zadania_domowe;
//Stwórz klasę `Author`, która ma spełniać następujące wymogi:

public class Author {
	//1. Mieć prywatne atrybuty:
	// * `id` - atrybut ten powinien trzymać numer identyfikacyjny,
	private int id;
	// * `firstName` - atrybut określający imię autora,
	private String firstName;
	// * `lastName` - atrybut określający nazwisko autora,
	private String lastName;
	// * `pseudonim` - atrybut określający pseudonim autora,
	private String pseudonim;
	//2. Posiadać konstruktor przyjmujący id, imię, nazwisko, pseudonim.
	public Author(int id, String firstName, String lastName, String pseudonim)	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.pseudonim=pseudonim;
	}
}
