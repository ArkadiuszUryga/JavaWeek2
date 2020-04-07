package tydzien1.dzien4.wprowadzanie_danych;

import java.util.Scanner;

//W pliku `Main1.java` stwórz metodę o sygnaturze `static void getInfo()`.
//
//W ciele metody dodaj kod który:
//
//1. Poprosi Cię o podanie imienia.
//2. Poprosi Cię o podanie wieku.
//3. Wypisze na konsoli informacje w formacie `"{imię} ma {wiek} lat"`.
//4. Wywołaj metodę w metodzie `main`.
public class Main1 {

	public static void main(String[] args) {
		getInfo();

	}
	
	static void getInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Proszę podaj swoje imię");
		String name=scan.nextLine();
		System.out.println("Teraz podaj swój wiek");
		while (!scan.hasNextInt())	{
			scan.next();
			System.out.println("Spróbuj ponownie");
		}
		int age = scan.nextInt();
		System.out.println(name+" ma "+age+" lat.");
	}

}
