package tydzien1.dzien4.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		File file = new File("Main1.txt");
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine())	{
				System.out.println(scan.nextLine());
			}
			scan.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Nie odnaleziono pliku");
		}

	}

}
