package tydzien1.dzien4.pliki;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//W pliku `Main1.java` napisz program który:
//
//1. Będzie wczytywał kolejne linie tekstu z konsoli, a następnie je zapisywał je do pliku o nazwie `Main1.txt`, 
//   program ma zakończyć działanie po wpisaniu `quit`.
public class Main1 {

	public static void main(String[] args) { 
		System.out.println("Wpisz cokolwiek, zostanie to zapisane do pliku. Wpisanie słowa quit zakończy działanie programu");
		String line;
		try {
			FileWriter out = new FileWriter("Main1.txt", true);
			Scanner scan = new Scanner(System.in);
			
			while (scan.hasNextLine()) {
				line=scan.nextLine();
				if (line.equals("quit")) {
					scan.close();
					out.close();
					break;
				}
				out.append(line+"\n");
			}
		} catch (IOException e) {
			System.out.println("Błąd tworzenia");
		}
		

	}

}
