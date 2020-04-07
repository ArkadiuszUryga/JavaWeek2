package tydzien1.dzien3.zadania_domowe;
//W pliku `Main2.java` umieść metodę o sygnaturze `static String safeGet(String[] str, int index)`.
//
//1. Uzupełnij ciało metody tak aby zwracała element tablicy `str` zawarty pod indeksem `index`.
//2. Dodaj obsługę odpowiedniego wyjątku.
public class Main2 {
	static String[] str= {"Opublikował kilka tomów wierszy", "wraz z Marcinem Świetlickim i Marcinem Baranem zredagował w 1997 antologię Długie pożegnanie"};
	static int index=3;
	public static void main(String[] args) {
		try {
			
		} 
		catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
	static String safeGet(String[] str, int index) throws IndexOutOfBoundsException	{
		
		
		return str[index];
		
	}

}
