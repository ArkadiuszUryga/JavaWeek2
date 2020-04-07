package tydzien2.dzien1.metody;
//W pliku `Main1.java` umieść w metodzie `main` kod, który:
//
//1. Utworzy obiekt klasy `Person` o nazwie `person`, a następnie
//ustawi za pomocą wcześniej utworzonych metod wszystkie atrybuty klasy.
public class Main1 {

	public static void main(String[] args) {
		Person person = new Person();
		Car car=new Car();
		car.setBrand("Simca").setModel("Inka").setPrice(9000);
		person.setAge(48).setGender("Male").setName("Marek").setSurname("Urygas");
		System.out.println(person.getFullName());
		System.out.println(person.getIncreaseAge());
		System.out.println(car.toString());

	}

}
