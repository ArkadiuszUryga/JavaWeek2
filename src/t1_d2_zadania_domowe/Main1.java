package t1_d2_zadania_domowe;
//Szyfr Cezara jest to szyfr za pomocą, którego Juliusz Cezar szyfrował swoje listy do Cycerona.
//
//W pliku `Main1.java` umieść metodę o sygnaturze `static String encode(String str)`.
// 
//1. Uzupełnij ciało metody tak, by zwracała napis zaszyfrowany szyfrem Cezara   

public class Main1 {
	static String str="Choć wygląda zupełnie zwyczajnie, to jest takim modelem, którego zakup należy koniecznie poprzedzić "
			+ "dłuższymi oględzinami i jazdą próbną. ";
	
	public static void main(String[] args) {
		System.out.println(encode(str));

	}
	static String encode(String str) {
		StringBuilder sb = new StringBuilder(str);
		int length=sb.length();
		for (int i=0;i<length;i++) {
			int a=(int)sb.charAt(i);
			if (a+3>122)	{
				a=((a+3)-122)+31;
			}
			else a+=3;
			sb.setCharAt(i, (char)a);
		}
		
		
		return sb.toString();
		
	}

}
