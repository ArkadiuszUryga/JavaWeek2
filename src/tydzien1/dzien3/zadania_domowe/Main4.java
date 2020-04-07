package tydzien1.dzien3.zadania_domowe;
//W pliku `Main4.java` umieść metodę o sygnaturze `static int toInt(String str)`.
//
//1. Uzupełnij ciało metody tak, aby zwracała zamieniony napis `str` na typ int.
//2. Obsłuż możliwe wyjątki.
public class Main4 {

	public static void main(String[] args) {
		try {
			System.out.println(toInt("12a"));
		}
		catch (NumberFormatException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
		catch(NullPointerException f) {
			f.getStackTrace();
			System.out.println(f.getMessage());
		}

	}
	static int toInt(String str) throws NumberFormatException, NullPointerException	{
		
		int a=Integer.parseInt(str);
		return a;
		
	}

}
