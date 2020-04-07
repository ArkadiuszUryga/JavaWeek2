package tydzien1.egzamin;

import java.util.StringTokenizer;

//W pliku `Main7.java` umieść metodę o sygnaturze `static int countNumbers(String str) `.
//
//1. Uzupełnij ciało metody tak aby zwracała sumę **cyfr** umieszczonych w napisie
//Przykład: dla napisu `Wynik dodawania 1 i 2 to 3` zwróci `6`. 
//
//Aby zamienić napis na wartość liczbową typu int możesz skorzystać z poniższego przykładu:
//```java
//int num = Integer.parseInt("3");
//```
//Dodaj obsługę możliwego wyjątku.
public class Main7 {
	static String str="1 i 2 to 3";
	public static void main(String[] args) {
		System.out.println("Suma wszystkich liczb w zadniu wynosi "+countNumbers(str));

	}
	static int countNumbers(String str)	{
		int result=0;
		StringTokenizer st = new StringTokenizer(str);
		
		while (st.hasMoreTokens()) {
			String temp=st.nextToken();
			try {
			int num=Integer.parseInt(temp);
			result+=num;
			}
			catch(NumberFormatException e)	{
				
			}
			
		}
		return result;
		
	}

}
