package tydzien2.dzien2.dziedziczenie;
//#### Zadanie 1 - rozwiązywane z wykładowcą.
//Stwórz klasę ```AdvancedCalculator```, która dziedziczy po klasie ```Calculator```.
//Klasa powinna implementować następujące metody:
//
//1. ```pow(num1, num2)``` metoda ma zwracać ```num1``` do potęgi ```num2```. Dodatkowo w tablicy operacji ma zapamiętać 
//napis: "```num1```^```num2``` equals ```result```".
//2. ```root(num1, num2)``` &ndash; metoda ma wyliczyć pierwiastek ```num2``` stopnia z ```num1```. Dodatkowo w tablicy operacji 
//ma zapamiętać napis: "root ```num2``` of ```num1``` equals ```result```".
import tydzien2.dzien1.konstruktor.Calculator;

public class AdvancedCalculator extends Calculator {
	public double pow(double pow1, double pow2) {
		double result=Math.pow(pow1,pow2);
		this.addToHistory(pow1+" ^ "+pow2+" got "+result);
		return pow2;
		
	}
	public double root(double num1,double num2) {
		double result=Math.pow(num1, 1/num2);
		this.addToHistory("root "+num1+" of "+num2+" got "+result);
		return result;
		
	}
}
