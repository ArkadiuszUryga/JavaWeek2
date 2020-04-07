package tydzien1.egzamin;

import java.util.Arrays;
import java.util.Scanner;

//W pliku `Main4.java` umieść metodę o sygnaturze `static int[] returnTab()`.
//
//1. Uzupełnij ciało metody tak by pobierała z konsoli parametr `n`, tworzyła tablicę o ilości elementów `n`.
//2. Elementy tablicy mają być kolejnymi liczbami naturalnymi zaczynając od 1.
public class Main4 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(returnTab()));

	}
	static int[] returnTab()	{
		
		int a = podajLiczbe("Podaj liczbę całkowitą");
		int[] result= new int[a];
		for (int i=1;i<=a;i++)	{
			result[i-1]=i;
		}
		return result;
		
	}
	static int podajLiczbe(String message) {
		Scanner scan= new Scanner(System.in);
		System.out.println(message);
		while (!scan.hasNextInt())	{
    		System.out.println("miała być liczba \n"+message);
    		scan.next();
    		
    	}
    		
    	return scan.nextInt();
	}

}
