package tydzien1;
import tydzien1.dzien4.wprowadzanie_danych.ScannerValidation;
import java.util.Scanner;
//W pliku `Main8.java` umieść metodę o sygnaturze `static void create(int max)`.
//
//1. Uzupełnij ciało metody tak aby pobrała z konsoli parametr `n` - oznaczający ilość osób w grupie.
//2. Następnie dla podanej ilości osób pobierze z konsoli loginy github oraz ilość punktów z egzaminu 
//,zapisze je do pliku `exam.txt`, każde imię razem z oceną w nowej lini oddzielone znakiem spacji.
//
//    Przykład pobierania dla 2 osób:
//    
// ```
// Podaj login:
// arek-jozwiak-coderslab
// Podaj ilość punktów:
// 11
// Podaj login:
// pawel321a
// Podaj ilość punktów:
// 20
// ```
//    
// Przykład wynikowego pliku:
// ```
// arek-jozwiak-coderslab 11
// pawel321a 20
// ```
//
//3. Następnie wczytamy dane z pliku `exam.txt` i na ich podstawie utworzymy nowy plik `exam_passed.txt` ,
//w którym znajdą się tylko te osoby, których ilość punktów przekracza 60% z maksymalnej ilości punktów określonych w parametrze `max`.
//
//##### Możemy utworzyć dodatkowe metody pomocnicze natomiast całość programu ma się wykonać po wywołaniu metody create()
//##### Pliki `exam.txt` oraz `exam_passed.txt` nie powinny być dodane do repozytorium.
public class Main8 {

	public static void main(String[] args) {
		create(100);

	}
	static void create(int max)	{
		String message="podaj login";
		String message2="Podaj liczbę punktów";
		String login=ScannerValidation.getString(message);
		
		int numberOfPoints=ScannerValidation.getInt(message2);
	}
	

}
