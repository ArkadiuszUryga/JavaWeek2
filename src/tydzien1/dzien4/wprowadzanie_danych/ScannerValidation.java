package tydzien1.dzien4.wprowadzanie_danych;

import java.util.Scanner;

public class ScannerValidation {
	
	//pobiera ze skanera liczbę całkowitą
	public static int getInt(String message) {
		Scanner scan= new Scanner(System.in);
		System.out.println(message);
		while (!scan.hasNextInt())	{
    		System.out.println("miała być liczba \n"+message);
    		scan.next();
    		
    	}
    		
    	return scan.nextInt();
    	
    	
		
	}
	
	//pobiera ze skanera double
	
	public static double getDouble(String message) {
		Scanner scan= new Scanner(System.in);
		System.out.println(message);
		
		while (!scan.hasNextDouble())	{
    		System.out.println("miała być liczba (double) \n"+message);
    		scan.next();
    		
    	}
    	
    	return scan.nextDouble();
	}
	
	//pobiera ze skanera stringa o zadanej długości
	public static String getStringLength(String message, int length) {
		Scanner scan= new Scanner(System.in);
		System.out.println(message);
		
		while(scan.next().length()<length) {
			System.out.println("Minimum 3 znaki \n"+message);
    		scan.next();
		}
		
		
		return scan.next();
		
	}
	
	//pobiera ze skanera stringa
	public static String getString(String message)	{
		Scanner scan=new Scanner(System.in);
		System.out.println(message);
		
		return scan.next();
	}
	
	
	
}
