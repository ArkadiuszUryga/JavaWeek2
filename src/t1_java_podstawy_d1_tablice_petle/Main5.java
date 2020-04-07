package t1_java_podstawy_d1_tablice_petle;

import java.util.Arrays;

//1. Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij `numbers`.
//2. Posortuj rosnąco tablicę wykorzystując metody klasy Arrays.
//3. Wyświetl w konsoli posortowaną tablicę - również wykorzystaj metodę klasy Arrays.
public class Main5 {

	public static void main(String[] args) {
		int[] numbers= {21,56,32,44,5,2,89,98,14};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

	}

}
