package t1_d2_podzial_napisow;

import java.util.Arrays;
import java.util.StringTokenizer;

//W pliku `Main4.java` umieść metodę o sygnaturze `static String[] onlyTwoElements(String str, char separator)`.
//
//1. Uzupełnij ciało metody tak aby, zwracała tablicę dokładnie 2 elementów, podzielonych wg pierwszego napotkanego znaku 
//podziału.
//Przykład" dla napisu `Java-zadania-podzial-napisow` oraz separatora `-` otrzymamy 1 element tablicy `Java` oraz 2 element 
//`zadania-podzial-napisow`.

public class Main4 {
	static String str="Co innego auta japońskie, które są tworzone według nieco innej filozofii, a francuzy to zupełnie "
			+ "odrębny temat.";
	static char separator=',';
	public static void main(String[] args) {
	System.out.println(Arrays.toString(onlyTwoElements(str, separator)));

	}
	
	static String[] onlyTwoElements(String str, char separator)	{
		
		StringTokenizer strTok = new StringTokenizer(str, ""+separator);
		String first = strTok.nextToken();
		StringBuffer buf = new StringBuffer();
		while (strTok.hasMoreTokens()) {
			buf.append(strTok.nextToken());
			buf.append(separator);
		}
		String[] result= {first, buf.toString().substring(0,buf.length()-1)};
		return result;
		
	}
}
