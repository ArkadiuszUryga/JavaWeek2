package t1_java_podstawy_d1_tablice_petle;

import java.util.Arrays;

//1. Stwórz 10 elementową tablicę wypełnioną pojedynczą wartością 2. Tablica powinna wyglądać następująco:
//    ````
//    [2. 2. 2. 2. 2. 2 .2 . 2. 2. 2]
//    ````
//2. Zadanie wykonaj bez użycia pętli for.
public class Main3 {

	public static void main(String[] args) {
		int[] filed=new int[10];
		Arrays.fill(filed, 2);
		System.out.println(Arrays.toString(filed));
	}

}
