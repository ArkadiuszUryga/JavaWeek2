package tydzien1.dzien3.wyjatki;
//W pliku `Main2.java` została umieszczona metoda o sygnaturze `static int divide (int a, int b)`.
//
//1. Uzupełnij ciało metody tak, aby wykonała dzielenie argumentu `a` prze `b` a następnie zwróci całkowitą cześć wyniku dzielenia.
//2. Obsłuży problem dzielenia przez zero.

public class Main2 {
	static int a=5;
	static int b=0;
	public static void main(String[] args) {
		try	{
		System.out.println(divide(a, b));
		}
		catch (ArithmeticException e) {
			System.out.println("Nie dzielimy przez zero");
			e.printStackTrace();
		}

	}
	static int divide (int a, int b) throws ArithmeticException	{
		
		
		return a/b;
		
	}

}
