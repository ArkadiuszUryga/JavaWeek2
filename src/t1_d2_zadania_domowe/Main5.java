package t1_d2_zadania_domowe;
//W pliku `Main5.java` umieść metodę o sygnaturze `static String replaceChar(String str, char forReplace, char replacement)`.
//
//1. Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie `str`
// wszystkich zmaków `forReplace` przez znaki `replacement`.
public class Main5 {
	static String str="Aby ułatwić dotarcie do różnych części";
	static char forReplace='a';
	static char replacement='b';
	public static void main(String[] args) {
		System.out.println(repalceChar(str, forReplace, replacement));

	}
	
	static String repalceChar(String str, char forReplace, char replacement) {
		String a=Character.toString(forReplace);
		String b=Character.toString(replacement);
		String result=str.replaceAll(a, b);
		
		return result;
		
	}

}
