package t1_d2_napisy;
//W pliku `Main4.java` została umieszczona metoda o sygnaturze `static String toogleChar(String str) `.
//
//1. Uzupełnij ciało metody tak, aby zamieniała duże litery na małe i odwrotnie a następnie zwracała wynik. 
//Przykład: dla napisu `TaK` wyświetli `tAk`. 


public class Main4 {
	
	static String[] test= {"pRzykaładowe Teksty", "Ala. oLa", "KOtEk"};

	public static void main(String[] args) {
		for (String str:test) {
		System.out.println(toogleChar(str));
		}
	}
	static String toogleChar(String str) {
		char[] strArray=str.toCharArray();
		for (int i=0;i<strArray.length;i++)	{
			if (Character.isUpperCase(strArray[i]))	{
				strArray[i]=Character.toLowerCase(strArray[i]);
			}
			else {
				strArray[i]=Character.toUpperCase(strArray[i]);
			}
		}
		
		
		
		return new String(strArray);
		
	}

}
