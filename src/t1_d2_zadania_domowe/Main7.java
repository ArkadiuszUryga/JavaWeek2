package t1_d2_zadania_domowe;

import java.util.StringTokenizer;

//W pliku `Main7.java` umieść metodę o sygnaturze `static String censor(String str, String[] words)`.
//
//1. Metoda:
//
//* rozbije łańcuch tekstowy na tablicę wyrazów,
//* sprawdzi, czy nie znajdują się w nim słowa niedozwolone zawarte w tablicy `words`,
//* jeśli tak -- zamieni je na cztery gwiazdki (****)
//* ponownie połączy tablicę w string i zwróci wartość.
public class Main7 {
	static String str="Jadąc z Katowic, Lefkada jest do zrobienia w 2 dni.";
	static String[] words= {"Lefkada", "zrobienia"};
	public static void main(String[] args) {
		System.out.println(censor(str, words));

	}
	static String censor(String str, String[] words)	{
		StringTokenizer tok = new StringTokenizer(str);
		String[] table = new String[tok.countTokens()];
		int i=0;
		while (tok.hasMoreTokens()) {
			String check=tok.nextToken();
			for (int j=0;j<words.length;j++) {
				if (check.equals(words[j]))	{
					check="****";
				}
				table[i]=check;
			}
			
			i++;
		}
		StringBuffer sb=new StringBuffer();
		for (int k=0;k<table.length;k++) {
			sb.append(table[k]).append(" ");
		}
		//sb.append(".");
		return sb.toString();
	}

}
