package tydzien1.dzien4.pliki_Nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//W pliku `Main1.java` stwórz metodę o sygnaturze `static void createDirectory(String fileName)`.
//
//1. Uzupełnij ciało metody tak, aby tworzyła katalog o zadanej nazwie.
//2. Sprawdzaj czy katalog nie istnieje.
//3. Wykorzystaj metody klas pakietu `java.nio.file` - `Files.exists(directory)` oraz ` Files.createDirectory(directory);`.
public class Main1 {

	public static void main(String[] args) {
		createDirectory("AlaMa");

	}
	static void createDirectory(String fileName)	{
		Path path =Paths.get(fileName);
		
		if (!Files.exists(path))	{
			try {
				Files.createDirectories(path);
			} catch (IOException e) {
				
				System.out.println("Katalog już istnieje");
			}
		}
		else	{
			System.out.println("Katalog "+fileName+" już istnieje");
		}
	}

}
