package tydzien1.egzamin;
//W pliku `Main6.java` umieść metodę o sygnaturze `static String replaceStr(String str, String forReplace, String replacement)`.
//1. Uzupełnij ciało metody tak aby zwracała napis powstały z zamiany w napisie `str`
// wszystkich wystąpień napisu `forReplace` przez napis `replacement`.
public class Main6 {
	static String str="ząb zupa zębowa";
	static String forReplace="z";
	static String replacement="d";
	public static void main(String[] args) {
		System.out.println(replaceStr(str, forReplace, replacement));

	}
	static String replaceStr(String str, String forReplace, String replacement)	{
		
		str=str.replace(forReplace, replacement);
		return str;
		
	}

}
