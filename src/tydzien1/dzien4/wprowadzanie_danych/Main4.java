package tydzien1.dzien4.wprowadzanie_danych;

import java.util.Scanner;
import java.util.stream.IntStream;

//W pliku `Main4.java` stwórz metodę o sygnaturze `static void rowsColumns()`, która:
//
//1. Wczyta z konsoli 2 liczby całkowite i przypisze je do zmiennych `rows` i `columns`.
//2. Stworzy tablicę o podanej liczbie rzędów i kolumn.
//3. Wypełni tablicę kolejnymi liczbami całkowitymi.
//4. Obliczy sumę wszystkich elementów oraz wyświetli na konsoli.
//5. Obliczy średnią wszystkich elementów oraz wyświetli na konsoli.
//6. Wywołaj metodę w metodzie `main`.
public class Main4 {

	public static void main(String[] args) {
		rowsColumns();

	}
	static void rowsColumns()	{
		System.out.println("Wprowadź liczbę wierszy tabeli");
		int rows=scaner();
		System.out.println("Wprowadź liczbę kolumn tabeli");
		int columns=scaner();
		System.out.println("Stworzono nową tabelę o "+rows+" wierszach i "+columns+" kolumnach");
		int[][] table = new int[rows][columns];
		int count=1;
		int sum=0;
		for (int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				table[i][j]=count;
				sum+=count;
				count++;
				
			}
		}
		System.out.println("Suma to:"+sum);
    	System.out.println("Średnia to:"+(double)sum/(double)(rows*columns));
		
	}
	static int scaner() {
		Scanner scan = new Scanner(System.in);
		while(!scan.hasNextInt())	{
			scan.next();
			System.out.println("Miała być liczba");
		}
		
		return scan.nextInt();
		
	}

}
