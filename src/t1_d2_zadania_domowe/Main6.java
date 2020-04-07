package t1_d2_zadania_domowe;

import java.util.StringTokenizer;

//W pliku `Main6.java` umieść metodę o sygnaturze `static String replaceStr(String str, String forReplace, String replacement)`.
//
//1. Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie `str`
// wszystkich wystąpień napisu `forReplace` przez napis `replacement`.
public class Main6 {
	static String str="Jestem zdumiony, że ten refren jest cudowny i wygodny";
	static String forReplace="refren";
	static String replacement="chór";
	public static void main(String[] args) {
		System.out.println(replaceStr(str, forReplace, replacement));

	}
	static String replaceStr(String str, String forReplace, String replacement)	{
		StringBuffer buf=new StringBuffer();
		StringTokenizer tok = new StringTokenizer(str);
		while (tok.hasMoreTokens()) {
			String s=tok.nextToken();
			if (s.equals(forReplace)) {
				s=replacement;
			}
			buf.append(s).append(" ");
			
		}
		return buf.toString();
		
	}

}
