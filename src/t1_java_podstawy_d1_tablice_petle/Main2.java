package t1_java_podstawy_d1_tablice_petle;

import java.util.Arrays;
import java.util.Random;

//Stwórz tablicę z 20 losowymi liczbami z zakresu `0-100`, zmienną z tablicą nazwij `randNumbers`
//2. Użyj do tego pętli `for` - do otrzymania losowej wartości użyj sposobu opisanego w snippetach.
//3. Wypisz w konsoli minimalną wartość z tablicy.
public class Main2 {

	public static void main(String[] args) {
		int[] randNumbers=new int[20];
		Random rand = new Random();
		for (int i=0;i<randNumbers.length;i++) {
			int randNumber=rand.nextInt(100)+1;
			randNumbers[i]=randNumber;
		}
		System.out.println(Arrays.toString(randNumbers));

	}

}
