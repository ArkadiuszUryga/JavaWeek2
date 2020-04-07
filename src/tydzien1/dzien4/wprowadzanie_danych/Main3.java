package tydzien1.dzien4.wprowadzanie_danych;

import java.util.Scanner;

//W pliku `Main3.java` stwórz metodę o sygnaturze `static void getData()`.
//
//1. Uzupełnij ciało metody tak, by wczytywała liczby z konsoli, 
//sumowała ich wartość oraz ilość i wyświetlała na konsoli do momentu wprowadzania 0.
//2. Wywołaj metodę w metodzie `main`.
public class Main3 {

	public static void main(String[] args) {
		getData();

	}
	static void getData()	{
		int count=0;
		int sum=0;
		System.out.println("Wprowadź liczbę, wprowadzenie zera zakończy zabawę");

		while (scaner()!=0)	{
			System.out.println("Wprowadzono "+count+" liczb na łączną sumę "+sum);	
			System.out.println("Wprowadź liczbę, wprowadzenie zera zakończy zabawę");
			count++;
			sum+=scaner();
		}
		
		
		
	}
	static int scaner() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(!scan.hasNextInt()) {
			scan.hasNext();
			System.out.println("Wprowadź liczbę");
		}
		
		return scan.nextInt();
		
	}

}
