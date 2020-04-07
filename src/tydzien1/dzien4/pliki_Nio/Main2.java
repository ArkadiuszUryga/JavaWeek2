package tydzien1.dzien4.pliki_Nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//W pliku `Main2.java` stwórz metodę o sygnaturze `static void createFile (String fileName)`.
//
//1. Uzupełnij ciało metody tak, aby tworzyła plik o zadanej nazwie.
//2. Sprawdzaj czy plik nie istnieje.
//3. Wykorzystaj metody klas pakietu `java.nio.file` .
public class Main2 {

	public static void main(String[] args) {
		createFile("fila.txt");

	}
	static void createFile (String fileName)	{
		Path path = Paths.get(fileName);
		
		if (!Files.exists(path))	{
			try {
				Files.createFile(path);
				System.out.println("Utworzono plik "+fileName);
				System.out.println("w lokalizacji "+path.getFileName());
			} catch (IOException e) {
				System.out.println("Plik już istnieje");
			}
		}
		else {
			System.out.println("Plik "+fileName+" już istnije");
		}
	}

}
