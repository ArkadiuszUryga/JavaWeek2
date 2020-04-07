package tydzien2.dzien1.pierwsza_klasa;

public class Main1 {

	public static void main(String[] args) {
		Cat cat=new Cat();
		Dog dog=new Dog();
		if (cat.equals(dog)) {
			System.out.println("Cat and dog looks similar");
		}
		else	{
			System.out.println("You can't compare a cat with a dog");
		}

	}

}
