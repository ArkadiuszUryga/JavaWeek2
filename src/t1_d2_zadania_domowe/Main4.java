package t1_d2_zadania_domowe;
//W pliku `Main4.java` umieść  metodę  o sygnaturze `static int tripple(String str)` 
//1. Metoda zwraca ilość potrójnych wystąpień znaków w napisie
//Przykład dla qazbbbwsx -> 1, dla aaawsxbbb ->2
public class Main4 {
	static String str1="qazbbbwsx";
	static String str2="aaawsxbbb";
	public static void main(String[] args) {
		System.out.println(tripple(str1));
		System.out.println(tripple(str2));

	}
	static int tripple(String str) {
		int count =str.length();
		int repeats=0;
		char [] array=str.toCharArray();
		for (int i=0;i<count-2;i++) {
			if (array[i]==array[i+1]&&array[i+1]==array[i+2])	{
				repeats++;
			}
		}
		
		return repeats;
		
	}

}
