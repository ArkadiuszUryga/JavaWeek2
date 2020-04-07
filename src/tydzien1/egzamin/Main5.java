package tydzien1.egzamin;

import javax.annotation.Generated;

import tydzien1.dzien4.wprowadzanie_danych.ScannerValidation;
//W pliku `Main5.java` umieść metodę o sygnaturze `static double ball()`.
//
//1. Uzupełnij ciało metody tab by pobierała z konsoli promień `r`.
//2. Zwracała obliczoną objętość kuli.
public class Main5 {

	public static void main(String[] args) {
		System.out.printf("%.2f", ball());

	}
	
	static double ball()	{
		double radius=ScannerValidation.getDouble("Wprowadź liczbę zmienoprzecinkową");
		System.out.println("Wybrałeś "+radius+" Objętość kuli o takim promieniu wynosi: ");
		double result=(4*Math.pow(radius, 3)*Math.PI)/3;
		return result;
	}

}
