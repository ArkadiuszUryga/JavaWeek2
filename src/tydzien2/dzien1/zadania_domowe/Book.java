package tydzien2.dzien1.zadania_domowe;
//#### Zadanie 3.
//Stwórz klasę `Book`, która ma spełniać następujące wymogi:
//
//#### Zadanie 5.
//Zmodyfikuj klasę `Book`:
//
//1. Dodaj jej atrybut o nazwie `user` reprezentujący użytkownika, który książkę wypożyczył. Dodaj gettery i settery.

//3. Metoda `borrowTo` dodatkowo doda do tablicy `books` obiektu `User` wypożyczaną książkę.
public class Book {
	//1. Mieć prywatne atrybuty:
	// * `id` - atrybut typu `int` ten powinien trzymać numer identyfikacyjny książki,
	private int id;
	// * `title` - atrybut typu `String` określający imię pracownika,
	private String title;
	// * `available` - atrybut typu `boolean` określający czy książka jest możliwa do wypożyczenia, z domyślną
	//wartością ustawioną na `true`,
	private boolean available=true;
	// * `author` - atrybut określający referencję do klasy `Author`,
	private Author author;
	// * `additionalAuthors`  - tablica referencji do obiektów klasy `Author`.
	private Author[] additionalAuthors;
	private User user;
	
	//2. Posiadać konstruktor przyjmujący id, title.
	public Book(int id, String title) {
		this.id=id;
		this.title=title;
	}
	//3. Posiadać konstruktor przyjmujący id, title, obiekt klasy `Author`.
	public Book(int id, String title, Author author) {
		this.id=id;
		this.title=title;
		this.author=author;
	}
	//4. Posiadać konstruktor przyjmujący id, title, obiekt klasy `Author`, tablicę obiektów klasy `Author`.
	public Book(int id, String title, Author author, Author[] additionalAuthors) {
		this.id=id;
		this.title=title;
		this.author=author;
		this.additionalAuthors=additionalAuthors;
	}
	//5. Posiadać gettery do wszystkich pól.
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public boolean isAvailable() {
		return available;
	}
	public Author getAuthor() {
		return author;
	}
	public Author[] getAdditionalAuthors() {
		return additionalAuthors;
	}
	
	
	public User getUser() {
		return user;
	}
	
	//5. Posiadać settery do wszystkich pól oprócz pola `id`.
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void setAdditionalAuthors(Author[] additionalAuthors) {
		this.additionalAuthors = additionalAuthors;
	}
	public void setUser(User user)	{
		this.user=user;
	}
	//2. Dodaj metodę `void borrowTo(User user)` przyjmującą obiekt klasy `User`, która oznaczy książką jako niedostępną do 
//	wypożyczenia,
// przez zmianę atrybutu `available` na wartość `false`.
	void borrowTo(User user)	{
		this.user=user;
		this.available=false;
	}
}
