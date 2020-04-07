package tydzien1.dzien4.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//W pliku `Main4.java` napisz program który:
//
//1. Wczyta zawartość z załączonego pliku text1.txt, następnie wypisze na konsoli wszystkie linie zawierające napis **Javy**
//ignorując wielkość znaków w nazwie.
public class Main4 {

	public static void main(String[] args) {
		
		File file = new File("text1.txt");
		String line;
		String pattern="javy";
		
		try {
			Scanner scan =new Scanner(file);
			while (scan.hasNextLine()) {
				line=scan.nextLine();
				String nLine=line.toLowerCase();
				if (nLine.contains(pattern))	{
					System.out.println(line);
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {
			
			System.out.println("Brak pliku");
		}
		

	}

}
