package t1_d2_napisy;
//W pliku `Main7.java` została umieszczona metoda o sygnaturze `static boolean containsStr(String str, String search)`.
//
//1. Uzupełnij ciało metody tak aby zwracała informacje czy zmienna `str` zawiera w sobie element napisu ze zmiennej `search`.


public class Main7 {
	static String str="A voz da Tarja e perfeita";
	static String search="Sleeping";
	public static void main(String[] args) {
		System.out.println(containsStr(str, search));

	}
	static boolean containsStr(String str, String search)	{
		
		if(str.contains(search)) {
			return true;
		}
		return false;
		
	}

}
