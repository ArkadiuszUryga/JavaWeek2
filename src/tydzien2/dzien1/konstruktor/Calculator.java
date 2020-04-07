package tydzien2.dzien1.konstruktor;

import java.util.Arrays;

//#### Zadanie 2.
//
//Stwórz klasę ```Calculator```. Konstruktor ma nie przyjmować żadnych danych.
//Każdy nowo stworzony obiekt powinien mieć tablicę String , w której będzie trzymać historię ostatnich operacji 
//(stwórz ją w konstruktorze - z początkowym rozmiarem 0).
//Następnie dodaj do klasy następujące metody:
//
//1. ```add(num1, num2)``` - metoda ma dodać do siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać 
//napis: "added ```num1``` to ```num2``` got ```result```".
//2. ```multiply(num1, num2)``` - metoda ma pomnożyć przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma 
//zapamiętać napis: "multiplied ```num1``` with ```num2``` got ```result```".
//3. ```subtract(num1, num2)``` - metoda ma odjąć od siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma 
//zapamiętać napis: "subtracted ```num1``` from ```num2``` got ```result```".
//4. ```divide(num1, num2)``` - metoda ma podzielić przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "divided ```num1``` by ```num2``` got ```result```". Pamiętaj, że nie można dzielić przez zero.
//5. ```printOperations()``` - metoda ma wypisać wszystkie zapamiętane operacje.
//6. ```clearOperations()``` - metoda ma wyczyścić wszystkie zapamiętane operacje.
//
//Możesz dopisać metodę pomocniczą która będzie dodawała wpis na liście operacji oraz zwiększała rozmiar tablicy przez kopiowanie.
//
//Pamiętaj o używaniu ```this``` w odpowiednich miejscach.
//Stwórz kilka kalkulatorów i przetestuj ich działanie.
public class Calculator {
		private String[] lastOperations;
		
	public Calculator()	{
		this.lastOperations=new String[0];
	
		
	}
	public Calculator addToHistory(String operationText)	{ //dodajemy tekst do historii
		int elementsToAdd=this.lastOperations.length+1; //zwiększay o 1 dotychczasową wielkość tabeli
		String[] newHistory=new String[elementsToAdd]; //tabela tymczasowa o nowej wielkości
		newHistory=Arrays.copyOf(this.lastOperations, elementsToAdd); //kopiujemy starą tabelę do nowej
		int index=elementsToAdd-1;
		newHistory[index]=operationText;//dopisujemy ostatni wpis na końcu
		this.lastOperations=null;//usuwamy starą tabelę
		this.lastOperations=newHistory;//zastępujemy ją nową
		return this;
	}
	public int add(int num1, int num2)	{
		int result=num1+num2;
		addToHistory("added "+num1+" to "+num2+" got "+result);
		
		return result;
		
	}
	
	public int multiply(int num1, int num2) {
		int result=num1*num2;
		addToHistory("Multipled "+num1+" with "+num2+" got "+result);
		
		return result;
	}
	public int subtract(int num1, int num2)	{
		int result=num1-num2;
		addToHistory("subtracted "+num1+" from "+num2+" got "+result);
		
		return result;
	}
	public int divide(int num1, int num2)	{
		int result=num1/num2;
		addToHistory("divided "+num1+" and "+num2+" got "+result);
		
		return result;
	}
	public Calculator printOperations() {
		for (int i=0;i<this.lastOperations.length;i++)	{
			System.out.println(this.lastOperations[i]);
		}
		
		return this;
		
	}
	public Calculator clearOperations() {
		this.lastOperations=null;
		this.lastOperations=new String[0];
		return this;
	}
	
	
}
