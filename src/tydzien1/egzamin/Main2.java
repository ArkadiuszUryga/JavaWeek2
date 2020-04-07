package tydzien1.egzamin;
//W pliku `Main2.java` umieść metodę o sygnaturze `static String shorten(String str, int length)`.
//
//1. Uzupełnij ciało metody tak, by dla otrzymanego napisu zwracała jego skrót o ilości znaków podanych w parametrze `length`.
//
//Przykład dla napisu `Naucz się programować od podstaw` oraz ilości znaków 2 otrzymamy `Na`. 
public class Main2 {
	static String str="Naucz się programować od podstaw";
	static int length=2;
	public static void main(String[] args) {
		System.out.println(shorten(str, length));

	}
	static String shorten(String str, int length)	{
		
		str=str.substring(0, length);
		return str;
		
	}

}
