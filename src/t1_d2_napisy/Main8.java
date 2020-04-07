package t1_d2_napisy;
//W pliku `Main8.java` została umieszczona metoda o sygnaturze `static String stringFromArray(String[] str)`.
//
//1. Uzupełnij ciało metody tak aby zwracała napis powstały z połącznia wszystkich napisów występujących w tablicy `str`.
public class Main8 {
	static String[] str= {"I wish ", "I had ", "an angel ", "is my absolute ", "favorite ", "NW song"};
	public static void main(String[] args) {
		System.out.println(stringFromArray(str));

	}
	static String stringFromArray(String[] str)	{
		StringBuffer result=new StringBuffer();
		for(String nStr:str) {
			result.append(nStr);
		}
		
		return result.toString();
		
	}

}
