package t1_java_podstawy_d1_tablice_petle;

public class zad3 {

	public static void main(String[] args) {
		// Napisz program, w którym zostanie utworzona 20-elementowa tablica typu boolean
		//Komórkom o parzystym indeksie przypisz wartość true, nieparzystym false
		//przyjmij,  że zero jest parzyste
		//zawartość tablicy wyświetl na ekranie
		
		boolean[] tab = new boolean[20];
		for (int i=0;i<tab.length;i++)	{
			tab[i]=false;
			if (i%2==0)	{
				tab[i]=true;
			}
			System.out.println(tab[i]);
		}

	}

}
