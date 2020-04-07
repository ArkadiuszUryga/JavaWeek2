package t1_d2_napisy;
//Palindrom to słowo lub zdanie, które czytane wspak brzmi tak samo, jak od początku, np. "kajak", "radar", czy "Kobyła ma mały bok".
//W pliku `Main2.java` napisz program, który:
//
//1. Dla znajdującej się w pliku zmiennej `str` sprawdzi czy jest on palindromem
//2. Podczas sprawdzania palindromu, zignoruj spacje.
public class Main2 {

	public static void main(String[] args) {
		String str1="pierwsze";
		String str2="kajak";
		String str3="trzecie słowo";
		String str4="radar";
		String str5="ciąg znaków zupełnie przypadkowy";
		String str6="Kobyła ma mały bok";
		if (palindrom(str1)==true) {
			System.out.println("Fraza \""+str1+"\" jest palindromem");
		}
		else	{
			System.out.println("Fraza \""+str1+"\" nie jest palindromem");
		}
		if (palindrom(str2)==true) {
			System.out.println("Fraza \""+str2+"\" jest palindromem");
		}
		else	{
			System.out.println("Fraza \""+str2+"\" nie jest palindromem");
		}
		if (palindrom(str3)==true) {
			System.out.println("Fraza \""+str3+"\" jest palindromem");
		}
		else	{
			System.out.println("Fraza \""+str3+"\" nie jest palindromem");
		}
		if (palindrom(str4)==true) {
			System.out.println("Fraza \""+str4+"\" jest palindromem");
		}
		else	{
			System.out.println("Fraza \""+str4+"\" nie jest palindromem");
		}
		if (palindrom(str5)==true) {
			System.out.println("Fraza \""+str5+"\" jest palindromem");
		}
		else	{
			System.out.println("Fraza \""+str5+"\" nie jest palindromem");
		}
		if (palindrom(str6)==true) {
			System.out.println("Fraza \""+str6+"\" jest palindromem");
		}
		else	{
			System.out.println("Fraza \""+str6+"\" nie jest palindromem");
		}

	}
	private static boolean palindrom(String str)	{
		String newStr=str.trim();
		String	newText	=	newStr.toLowerCase();
		newText	=	newText.replaceAll(" ",	"");
		int textLength=newText.length();
		//System.out.println(textLength);
		if (textLength%2!=0)	{
			int count=textLength/2;
			for (int i=0;i<count;i++) {
				if (newText.charAt(i)!=newText.charAt(textLength-i-1)) {
					return false;
				}
			}
			return true;
		}
		
		return false;
	}

}
