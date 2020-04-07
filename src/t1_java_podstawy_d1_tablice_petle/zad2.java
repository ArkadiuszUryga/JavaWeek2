package t1_java_podstawy_d1_tablice_petle;

public class zad2 {

	public static void main(String[] args) {
		//Napisz program, w którym zostanie utworzona 10-elementowa tablica elementów typu int
		//Użyj pętli fordo wypełnienia jej danymi w taki sposób, aby w kolejnych komórkach znalazły się liczby od 10 do 100 (10,20,30...)
		//Zawartość tablicy wyświetl na ekranie
		
		int[] tab = new int[10];
		int zmienna=0;
		
		for (int i=0;i<tab.length;i++) {
			zmienna++;
			System.out.println(zmienna*10);
		}

	}

}
