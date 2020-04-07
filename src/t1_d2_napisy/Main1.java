package t1_d2_napisy;
//W pliku `Main1.java` napisz program, który:
//
//1. Dla znajdującej się w pliku zmiennej `str` pobierze przedostatnią literę.
//2. Wyświetli na konsoli ilość jej wystąpień w naszym ciągu znaków.
public class Main1 {

	public static void main(String[] args) {
		String str = "Pozostało jeszcze g7 dni ważności twojej usługi";
		System.out.println("Szukanych znaków w napisie znaleziono: "+penultimate(str));
		

	}
	private static int penultimate (String str) {
		int result=0;
		String newStr=str.trim();
		int textLenfth=newStr.length();
		char seekChar=newStr.charAt(textLenfth-2);
		System.out.println(seekChar);
		for (int i=0;i<textLenfth;i++) {
			if (newStr.charAt(i)==seekChar)	{
				result++;
			}
		}
		return result;
	}

}
