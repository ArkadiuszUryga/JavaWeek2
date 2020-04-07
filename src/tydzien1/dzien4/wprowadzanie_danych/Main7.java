package tydzien1.dzien4.wprowadzanie_danych;

import java.util.Scanner;
import static tydzien1.dzien4.wprowadzanie_danych.ScannerValidation.getDouble;

//W pliku `Main7.java` stwórz metodę o sygnaturze `static void nettoBrutto()`, która:
//
//1. Wczyta z konsoli typ wyliczenia dostępne wartości to:
//**bn** - zamiana brutto na netto
//**nb** - zamiana netto na brutto
//2. Wczyta z konsoli wartość do zamiany a następnie dokona zamiany wg wcześniej określonego typu.
//W przypadku otrzymania wartości innej niż możliwe **bn**, **nb** - program będzie pytał do skutku.
//3. Wywołaj metodę w metodzie `main`.
public class Main7 {

	public static void main(String[] args) {
		nettoBrutto();

	}
	
	static void nettoBrutto()	{
		System.out.println("Wpisz bn jeżeli chcesz przeliczyć wartość z brutto na netto");
		System.out.println("Wpisz nb, jeżeli chcesz przeliczyć wartość z netto na brutto");
		String enterData=getNbBn("Wpisuj teraz!");
		Double liczba=getDouble("Wpisz liczbę z przecinkiem lub bez");
		Double result;
		if (enterData.equals("bn"))	{
			result=liczba/1.23;
			System.out.println("Brutto: "+liczba+", netto: "+result);
		}
		else	{
			result=liczba*1.23;
			System.out.println("Netto: "+liczba+", brutto: "+result);
		}
		
		
	}
	private static String getNbBn(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		while (!scan.hasNextLine())	{
    		
    		System.out.println("wprowadź jedną z dwóch możliwych kombinacji \n"+message);
    		scan.nextLine();
    		
    	}
		String netBrut=scan.nextLine();
		if (netBrut.equals("nb")||netBrut.equals("bn")) {
		
		
		
		}
		else	{
			getNbBn("jeszcze raz");
		}
		return netBrut;
	}

}
