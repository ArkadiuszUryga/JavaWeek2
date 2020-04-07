package tydzien1.dzien4.wprowadzanie_danych;

import java.util.Scanner;

//W pliku `Main2.java` stwórz metodę o sygnaturze `static void operations()`.
//
//1. Uzupełnij ciało metody tak, by  wczytała 2 liczby a następnie wyświetliła na konsoli wynik dodawania,
// odejmowania, mnożenia i dzielenia. 
//2. Wywołaj metodę w metodzie `main`.
public class Main2 {

	public static void main(String[] args) {
		operations();

	}
	static void operations()	{
		
		System.out.println("Podaj pierwszą liczbę (A)");
		int a=liczba();
		System.out.println("Podaj drugą liczbę (B)");
		int b=liczba();
		double divide=a/b;
		System.out.println("A+B="+(a+b));
		System.out.println("A-B="+(a-b));
		System.out.println("A*B="+(a*b));
		System.out.println("A/B="+divide);
	}
	static int liczba()	{
		Scanner scan = new Scanner(System.in);
		while (!scan.hasNextInt()) {
			scan.hasNext();
			System.out.println("Spróbuj podać liczbę");
		}
		
		return scan.nextInt();
		
	}

}
