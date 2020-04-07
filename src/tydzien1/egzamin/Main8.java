package tydzien1.egzamin;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
import tydzien1.dzien4.wprowadzanie_danych.ScannerValidation;
public class Main8 {

	public static void main(String[] args) {
		
		
		create(100);

	}
	static void create(int max)	{
		String message="Podaj liczbę osób w grupie";
		String messageLogin="Podaj login kursanta";
		String messagePoints="Podaj zdobytą liczbę punktów";
		int n=ScannerValidation.getInt(message);
		
		
		for (int i=0;i<n;i++)	{
			System.out.println("Kursant nr "+(i+1));
			String login=ScannerValidation.getString(messageLogin);
			int numberOfPoints=ScannerValidation.getInt(messagePoints);
			if (i==0)	{
				
					try {
						FileWriter out = new FileWriter("exam.txt", false);
						out.append(messageLogin);
						out.append(messagePoints);
						
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					
					
			}
			else	{
				try {
					FileWriter out = new FileWriter("exam.txt", true);
					out.append(messageLogin);
					out.append(messagePoints);
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
			
			
			
		}
		File exam = new File("exam.txt");
		StringBuilder builder=new StringBuilder();
		try {
			Scanner scan=new Scanner(exam);
			while (scan.hasNextLine()) {
				builder.append(scan.nextLine()+"\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("brak	pliku");
		}
		System.out.println(builder.toString());
	}

}
