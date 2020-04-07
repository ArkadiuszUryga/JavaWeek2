package tydzien1.egzamin;

import java.util.Arrays;
import java.util.Random;

//W pliku `Main3.java` umieść metodę o sygnaturze `static int[] div(int size, int interval)`.
//
//1. Uzupełnij ciało metody tak by zwracała tablicę losowych liczb z zakresu `[1 - interval]`.
//2. Elementy tablicy mają być jednocześnie podzielne przez 2 i niepodzielne przez 3.
//3. Ilość elementów w tablicy ma być równa parametrowi `size`.
//4. Tablica nie może zawierać pustych elementów. (pamiętaj że domyślna wartość w tablicy dla typu `int` to 0)
//
//Przykład dla size = 4  oraz interval = 20 
//```
//[8,4,20,16]


////////////////////////////////////////
//robimy tak:
//-losujemy liczbę z zakresu 2-10 = b©die to rozmiar tabeli
//=wylosowaną liczbę mnożymy razy 4 - to będzie nasz interwal
//do powyższych czynności stworzymy ekstra metodę
//w metodzie właściwej:
//-losujemy liczbę z zakresu
//-sprawdzamy, czy spełnia kryteria
//-jeżeli tak, to nkrementujemy licznik pętli i zapisujemy liczbę w tablicy.    
public class Main3 {
	
	public static void main(String[] args) {
		int size=rand(8)+1; //kolejna dodana jedynka (oprócz dodanej w samej metodzie powoduje, że zakres losowanych liczb to 2-10
		int interval=size*4;
		System.out.println("Rozmiar tabeli wynosi: "+size);
		System.out.println("Interwał losowanych liczb wynosi: "+interval);
		String result=Arrays.toString(div(size, interval));
		System.out.println("Wylosowana tabela:");
		System.out.println(result);

	}
	static int[] div(int size, int interval)	{
		int[] rTable=new int[size];
		int checked;
		for (int i=0;i<size;i++) {
			checked=rand(interval);
			if (checked%2==0&&checked%3!=0) {
				rTable[i]=checked;
			}
			else i--;
		}
		return rTable;
		
	}
	static int rand(int interval) { 
		
		Random r =new Random();
		int randomed=r.nextInt(interval)+1; //1 dodajemy, żeby wylosowana liczba była z zakresu np. 1-10, a nie 0-9
		return randomed;
		
	}

}
