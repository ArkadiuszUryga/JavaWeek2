package t1_d2_napisy;
//W pliku `Main6.java` została umieszczona metoda o sygnaturze `static String firstHalf(String str)`.
//
//1. Uzupełnij ciało metody tak aby zwracała połowę napisu.
//2. Uwzględniamy tylko część całkowitą podziału.
//Przykład: dla napisu `CodersLab` zwróci `Code`.
public class Main6 {
	static String str="Where is Ghost Love Score ?";
	public static void main(String[] args) {
		
		System.out.println(firstHalf(str));
		

	}
	static String firstHalf(String str)	{
		int strLength=str.length();
		strLength=strLength/2;
		String newStr=str.substring(0, strLength);
		
		
		return newStr;
		
	}

}
