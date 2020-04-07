package tydzien1.dzien3.zadania_domowe;
//W pliku `Main3.java` umieść metodę o sygnaturze `static int getLength(String str)`.
//
//1. Uzupełnij ciało metody tak, aby zwracała długość napisu `str`.
//2. Obsłuż wyjątek wywołania metody `getLength(null)`.
public class Main3 {
	static String str=null;
	public static void main(String[] args) {
		try	{
			System.out.println(getLength(str));
		}
		catch (NullPointerException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}

	}
	static int getLength(String str) throws NullPointerException{
		
		int a=str.length();
		return a;
		
	}

}
