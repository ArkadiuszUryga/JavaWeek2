package tydzien1.dzien3.zadania_domowe;
//W pliku `Main1.java` umieść metodę o sygnaturze `static void average(String a, String b)`.
//
//1. Uzupełnij ciało metody tak, aby dokonała konwersji zmiennych a i b na typ liczbowy int.
//2. Wykonała dzielenie zmiennej `a` przez zmienną `b`.
//3. Zabezpiecz program przed możliwymi błędami.
public class Main1 {
	static String a="5ss";
	static String b="0";
	public static void main(String[] args) {
		try	{
			average(a, b);
		}
		catch (ArithmeticException e)	{
			e.getStackTrace();
        	System.out.println(e.getMessage());
		}
		catch (NumberFormatException f) {
			f.getStackTrace();
			System.out.println(f.getMessage());
		}

	}
	static void average(String a, String b) throws ArithmeticException, NumberFormatException	{
		int intA=Integer.parseInt(a);
		int intB=Integer.parseInt(b);
		System.out.println(intA/intB);
		
	}

}
