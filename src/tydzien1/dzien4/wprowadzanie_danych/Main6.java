package tydzien1.dzien4.wprowadzanie_danych;
//W pliku `Main6.java` stwórz metodę o sygnaturze `static void equation()`, która:
//
//1. Poprosi o podanie liczb całkowitych `a`, `b`, `c`
//2. Obliczy pierwiastki równania kwadratowego, a następnie je wyświetli.
//3. Wywołaj metodę w metodzie `main`.
import static tydzien1.dzien4.wprowadzanie_danych.ScannerValidation.getInt;
public class Main6 {

	public static void main(String[] args) {
		equation();

	}
	
	static void equation()
	{
		int a=getInt("Proszę podać liczbę A");
		int b =getInt("Proszę podać liczbę B");
		int c=getInt("Proszę podać liczbę C");
		
		
		if (a==0) {
    		System.out.println("To nie jet równanie kwadratowe: A = 0 !!!");
    		}
    	else {
    	//obliczanie delty
    		double delta=b*b-4*a*c;
    		//jeżeli delta jest mniejsza od zera
    		if (delta<0){
        		System.out.println("Delta < 0 \n więc to równanie NIE MA rozwiązań");
        		}
    		else if (delta==0)	{
    			//oblicza wynik
        		double wynik=-b/2*a;
        		System.out.println("Rozwiązanie: x="+wynik);
    		}
    		//jeżeli delta wieksza od zera
    		else	{
    			double wynik;
        		//oblicza wyniki
        		wynik=(-b-Math.sqrt(delta))/2*a;
        		System.out.println("Rozwiązanie x1:"+wynik);
        		wynik=(-b+Math.sqrt(delta))/2*a;
        		System.out.println("Rozwiązanie x2:"+wynik);
    		}
    	}
	}
}
