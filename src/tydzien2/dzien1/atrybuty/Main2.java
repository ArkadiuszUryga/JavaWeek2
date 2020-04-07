package tydzien2.dzien1.atrybuty;
//#### Zadanie 2.
//
//W pliku `Main2.java` umieść w metodzie `main` kod, który:
//
//1. Utworzy obiekt klasy `Attribute` o nazwie `attr` a następnie ustaw i wyświetl wszystkie wartości które są możliwe do ustawienia. 

public class Main2 {

	public static void main(String[] args) {
		Attribute attr=new Attribute();
		attr.publicAttribute="Atrybut publiczny";
		attr.protectedAttribute="Atrybut chroniony";
		System.out.println(attr.protectedAttribute);
		System.out.println(attr.publicAttribute);
	}

}
