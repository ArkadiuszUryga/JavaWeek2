package tydzien1.dzien4.wprowadzanie_danych;

import java.util.Scanner;

//W pliku `Main5.java` stwórz metodę o sygnaturze `static void textLines()`, która:
//
//1. Wczyta kolejne linie tekstu z konsoli, a następnie je wyświetlał, program ma zakończyć działanie po wpisaniu `quit`.
//2. Wywołaj metodę w metodzie `main`.
public class Main5 {

	public static void main(String[] args) {
		textLines();

	}
	static void textLines()	{
		System.out.println("Wpisz coś. Komenda quit kończy działanie scannera!");
		Scanner scan=new Scanner(System.in);
    	String line=scan.nextLine();
    	System.out.println(line);
    	while (!line.equals("quit"))	{
    		line=scan.nextLine();
    		System.out.println(line);
    		scan.next();
    		break;
    	}
    	scan.close();
	}
	

}
