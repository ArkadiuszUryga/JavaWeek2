package t1_java_podstawy_d1_tablice_wielowymiarowe;
//W pliku `Main2.java` znajduje się tablica o nazwie ```task2Array```. 
//
//1. W pętli wypisz długość tablic składających się na 2gi wymiar.
//2. W pętli wypisz wszystkie elementy tablicy 2 wymiarowej (musisz użyć do tego zagnieżdżonej pętli **for**).
public class Main2 {

	public static void main(String[] args) {
		int[][] task2Array = { 
				{ 2, 3, 4 }, 
				{ 12, 32, 12, 11 }, 
				{ 3, 2, 1, 4, 5 }, 
				{ 5, 1, 6, 7, 8 } 
				};
		for (int i=0;i<task2Array.length;i++) {
			System.out.println(task2Array[i].length);
		}
		for (int i=0;i<task2Array.length;i++) {
			for (int j=0;j<task2Array[i].length;j++) {
				System.out.print(task2Array[i][j]+", ");
			}
		}

	}

}
