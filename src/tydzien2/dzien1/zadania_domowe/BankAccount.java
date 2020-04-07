package tydzien2.dzien1.zadania_domowe;
//Stwórz klasę `BankAccount`, która ma spełniać następujące wymogi:
//
//1. Mieć prywatne atrybuty:
//* `number` - atrubyt ten powinien trzymać numer identyfikacyjny konta (dla uproszczenia możemy założyć że numerem 
//		 konta może być dowolna liczba całkowita),
//* `cash` - atrybut określający ilość pieniędzy na koncie. Ma to być liczba zmiennoprzecinkowa.  Atrybut `cash` 
//powinien być zawsze nastawiany na 0 dla nowo tworzonego konta.
//2. Posiadać konstruktor przyjmujący tylko numer konta.
//3. Posiadać getery do atrybutów `number` i `cash`, ale NIE posiadać do nich seterów (nie chcemy żeby raz stworzone 
//		konto mogło zmienić swój numer, a do atrybuty `cash` dodamy specjalne funkcje modyfikujące jej wartość).
//4. Posiadać metodę `void depositCash(amount)` której rolą będzie zwiększenie wartości atrybutu `cash` o podaną 
//wartość. Pamiętaj o sprawdzeniu czy 
//podana wartość jest:
//* Większa od 0
//5. Posiadać metodę `double withdrawCash(amount)` której rolą będzie zmniejszenie wartości atrybutu `cash` o podaną 
//wartość. 
//Metoda ta powinna zwracać ilość wypłaconych pieniędzy. Dla uproszczenia zakładamy że ilość pieniędzy na koncie nie 
//może zejść poniżej 0, np.
//jeżeli z konta na którym jest 300zł próbujemy wypłacić 500zł to metoda zwróci nam tylko 300zł. 
//Pamiętaj o sprawdzeniu czy podana wartość jest:
//* Większa od 0
//6. Posiadać metodę `String printInfo()` nie przyjmującą żadnych parametrów. Metoda ta ma wyświetlić informację o 
//numerze konta i jego stanie.
public class BankAccount {
	private int number;
	private double cash=0.0;
	public BankAccount(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public double getCash()	{
		return cash;
	}
	public void depositCash(double amount)	{
		if (amount>0) {
			this.cash+=amount;
			System.out.println("Wpłacasz "+amount+" pieniędzy");
			System.out.println("Twoje konto po wpłacie wynosi "+cash+" pieniędzy");
		}
		else {
			System.out.println("Sprwadź jeszcze raz wpłacaną sumę");
			System.out.println("Sugerujemy, żeby wyniosła więcej niż 0,0 pieniędzy");
		}
	}
	public double withdrawCash(double amount)	{

		if (amount>0) {
			if (this.cash>=amount) {
				this.cash-=amount;
				System.out.println("Wypłaciłeś "+amount+" pieniędzy");
				return amount;
			}
			else	{
				this.cash=0;
				System.out.println("Wypłaciłeś "+this.cash+" pieniędzy");
				System.out.println("Bo więcej nie miałeś");
				return this.cash;
			}
			
		}
		else	{
			System.out.println("Sprwadź jeszcze raz wypłacaną sumę");
			System.out.println("Sugerujemy, żeby wyniosła więcej niż 0,0 pieniędzy");
			return 0;
		}
		
		
	}
	//6. Posiadać metodę `String printInfo()` nie przyjmującą żadnych parametrów. Metoda ta ma wyświetlić informację o 
	//numerze konta i jego stanie.
	public String printInfo() {
		
String accountInfo ="Konto: "+this.number+" Stan konta "+this.cash;
		
		return accountInfo;
		
	}
}
