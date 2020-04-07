package tydzien2.dzien1.metody;
//Utwórz klasę `Person` dodaj w niej atrybuty:
//
//- name
//- surname
//- age
//- gender
//
//Wszystkie atrybuty mają być prywatne, oraz mają mieć ustawione wartości domyślne.
//
//Dodaj metody `setName` , `setSurname` , `setAge`, `setGender` , które ustawią atrybuty klasy zgodnie z nazwą, na którą wskazują.
//Np. `setName` - ustawia atrybut `name` .

//#### Zadanie 3.
//Do klasy `Person` dopisz metodę `getFullName`, która zwróci imię i nazwisko połączone znakiem spacji.

//#### Zadanie 4.
//Do klasy `Person` napisz metodę `increaseAge`, która inkrementuje zmienną `age` o 1.
public class Person {
	private String name="Arek";
	private String surname="Uryga";
	private int age=48;
	private String gender="male";
	private String fullName;
	private int increaseAge;
	
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	public Person setSurname(String surname) {
		this.surname = surname;
		return this;
	}
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	public Person setGender(String gender) {
		this.gender = gender;
		return this;
	}
	public Person setFullName()	{
		this.fullName=fullName;
		return this;
	}
	public String getFullName() {
		fullName=this.name.concat(" ".concat(surname));
		return this.fullName;
	}
	public int getIncreaseAge() {
		increaseAge=this.age;
		increaseAge++;
		return this.increaseAge;
	}
	
	
}
