package t1_d2_napisy;
//W pliku `Main5.java` została umieszczona metoda o sygnaturze `static int charPos(String str, char c) `.
//
//1. Uzupełnij ciało metody tak aby zwracała pozycje na której w ciągu `str` znajduje się znak `c`.
public class Main5 {
	static String[] test= {"symphonic metal collection", "no nightwish ", "Hello from... Texas? (why are we all stating our locations)﻿"};
	static char c='c';
	public static void main(String[] args) {
		for(String str:test) {
			if ((charPos(str, c))<0){
				System.out.println("Litera "+c+" nie została odnaleziona w ciągu znaków: "+str);
			}
			else	{
			System.out.println ("Litera "+c+" została odnaleziona w ciągu znaków: "+str+" na pozycji: "+(charPos(str, c)+1));
		}
		}

	}
	static int charPos(String str, char c)	{
		
		int newC=str.indexOf(c);
		
		return newC;
		
	}

}
