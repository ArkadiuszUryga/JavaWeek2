package t1_java_podstawy_d1_tablice_petle;

import java.util.Random;
import java.util.Arrays;

//1. Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij `numbers`.
//2. Stwórz drugą tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij `secondNumbers`.
//3. Stwórz trzecią tablicę zawierającą sumę wszystkich kolejnych elementów. 
//
//Dla przykładowych tablic:
//```java
//int[] numbers = {2, 3};
//int[] secondNumners = {3, 4};
//```
//wynikiem będzie tablica o elementach `5 i 7` .
public class Main6 {

	public static void main(String[] args) {
		int [] numbers=new int[10];
		int[] secondNumbers=new int[numbers.length];
		int[] sum=new int[numbers.length];
		
		Random rand=new Random();
		for (int i=0;i<numbers.length;i++) {
			numbers[i]=rand.nextInt(100)+1;
			secondNumbers[i]=rand.nextInt(100)+1;
			sum[i]=numbers[i]+secondNumbers[i];
		}
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(secondNumbers));
		System.out.println(Arrays.toString(sum));

	}

}
