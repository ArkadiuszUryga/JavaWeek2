package t1_d2_podzial_napisow;

import java.util.StringTokenizer;

//W pliku `Main2.java` napisz program, który:
//
//1. Dla znajdującej się w pliku zmiennej `str` podzieli napis na zdania. Znakiem podziału jest kropka `(.)` .
//2. Wyświetli na konsoli każde zdanie w oddzielnej lini.
public class Main2 {

	public static void main(String[] args) {
		
		String str="Pod maską dobre, sprawdzone silniki Diesla, a w zawieszeniu technika z wyższej półki, ale niedroga w naprawach. Citroën C5 II to samochód, który warto poznać. Są samochody, które można kupować w ciemno. ";
		str=str.trim();
		StringTokenizer strTok = new StringTokenizer(str, ".");
		while (strTok.hasMoreTokens()) {
			System.out.println(strTok.nextToken()+".");
		}

	}

}
