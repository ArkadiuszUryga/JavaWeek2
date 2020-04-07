package t1_java_podstawy_d1_tablice_wielowymiarowe;
//W pliku `Main4.java` znajduje się tablica o nazwie ```task4Array```. 
//
//1. Wypisz na konsoli ślad macierzy (sumę elementów na głównej przekątnej).
public class Main4 {

	public static void main(String[] args) {
		int[][] task4Array = { 
				{ 2, 3, 4, 6 }, 
				{ 12, 32, 12, 11 }, 
				{ 3, 2, 1, 4 }, 
				{ 5, 1, 6, 7 } 
				};
		int sladMacierzy=0;
		for (int i=0;i<task4Array.length;i++) {
			sladMacierzy+=task4Array[i][i];
		}
		System.out.println(sladMacierzy);
	}

}
