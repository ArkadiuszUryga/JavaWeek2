package t1_d2_podzial_napisow;
//W pliku `Main3.java` umieść metodę o sygnaturze `static int countTokent(String str)`.
//
//1. Uzupełnij ciało metody tak, aby zwracała ilość elementów w ciągu znaków.
//2. Metoda powinna pomijać białe znaki.

public class Main3 {
	static String str=" Wystarczy, że wygląd wam odpowiada, auto spełnia oczekiwania pod względem gabarytów oraz silnika, a stan techniczny jest w porządku. ";
		
	public static void main(String[] args) {
		System.out.println(countTokent(str));

	}
	static int countTokent(String str) {
		str.trim();
		
		return str.length();
		
	}

}
