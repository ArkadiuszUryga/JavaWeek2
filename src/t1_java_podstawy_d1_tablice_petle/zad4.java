package t1_java_podstawy_d1_tablice_petle;

public class zad4 {

	public static void main(String[] args) {
		// napisz program, wktórym zostanie tworzona 100-elementowa tablica 
		//typu int. Komórkom o indeksach 0, 10, 20 itd. przypisz wrtość 0
		//komórkom 1,11,21 itd wartość 1
		//komórkom 2.12.22 itd wartość 2
		//itd
		
		int[] tab = new int[100];
		for (int i=0;i<tab.length;i++) {
			tab[i]=i%10;
			System.out.println(tab[i]);
		}

	}

}
