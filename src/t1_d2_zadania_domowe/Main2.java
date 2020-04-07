package t1_d2_zadania_domowe;
//W pliku `Main2.java` umieść zmodyfikowaną metodę z zadania domowego 1 o sygnaturze `static String encode(String str, 
//int shift)`.
//
//1. `shift` - oznacza przesunięcie znaków
//2. Dodaj metodę deszyfrującą `static String decode(String str, int shift)` .
public class Main2 {
	static String str="Nie każdemu będzie odpowiadał jego charakter.";
	static String str1="Snj pfĦijrz gÃi$nj tiut!nfifì ojlt hmfwfpyjw3";
	static int shift=5;
	public static void main(String[] args) {
		System.out.println(encode(str, shift));
		System.out.println(decode(str1,shift));

	}
	static String encode(String str,int shift)	{
		StringBuilder sb = new StringBuilder(str);
		for (int i=0;i<sb.length();i++) {
			int a=(int)sb.charAt(i);
			if (a == 32 || a == 45) {
				a = a;
			}
			else	{
			if (a+shift>122)	{
				a=((a+shift)-122)+31;
			}
			else a+=shift;
			sb.setCharAt(i, (char)a);
		}
		}
		return sb.toString();
		
	}
	static String decode(String sta, int shift)	{
		
		StringBuilder sbi = new StringBuilder(sta);
		for (int i=0;i<sbi.length();i++) {
			int a=(int)sbi.charAt(i);
			if (a == 32 || a == 45) {
				a = a;
			}
			else	{
				if(a-shift<0) {
					a=((a-shift)+122)+31;
				}
				else a+=shift;
			}
		}
		return sbi.toString();
		
	}
}
