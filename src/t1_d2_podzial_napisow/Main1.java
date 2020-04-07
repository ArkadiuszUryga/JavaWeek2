//W pliku `Main1.java` napisz program, który:
//
//1. Dla znajdującej się w pliku zmiennej `str` podzieli napis na wyrazy. 
//2. Wyświetli na konsoli każdy w oddzielnej lini.

package t1_d2_podzial_napisow;

import java.util.StringTokenizer;

public class Main1 {

	public static void main(String[] args) {
		String str = "Starsze roczniki kupisz za grosze, a nowsze są blisko dwa razy tańsze od Volkswagena Passata.";
		StringTokenizer strTok = new StringTokenizer(str);
		while (strTok.hasMoreTokens())	{
			System.out.println(strTok.nextToken());
		}

	}
	

}
