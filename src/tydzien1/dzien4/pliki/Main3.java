package tydzien1.dzien4.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

//W pliku `Main3.java` napisz program który:
//
//1. Będzie wczytywał kolejne linie tekstu z pliku tekstowego wypełnionego poniższą zawartością:
//
//````
//1.1, 1.2, 1.3, 2.0, 1.8
//1.3, aa, 4.5, 6.7, 2.1
//3.5, 7.7, 9.9, 4.1, 2.1
//Jeżeli dane są poprawnymi danymi liczbowymi program policzy ich sumę i wypisze na konsoli
public class Main3 {
// Dokończyć
	//
	//
	//
	//
	public static void main(String[] args) {
		File file = new File("Main3.txt");
		double sum = 0;
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine())	{
				StringTokenizer st = new StringTokenizer(scan.nextLine(), ", ");
				while(st.hasMoreTokens()) {
					try	{
					sum+=Double.parseDouble(st.nextToken());
					}
					catch (NumberFormatException e)	{
						e.getMessage();
					}
				}
			}
			scan.close();
	    	System.out.println(sum);
		} catch (FileNotFoundException e) {
			System.out.println("Nie odnalziono pliku");
		}

	}

}
