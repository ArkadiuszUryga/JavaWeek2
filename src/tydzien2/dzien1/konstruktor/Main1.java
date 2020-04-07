package tydzien2.dzien1.konstruktor;

public class Main1 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(2, 3);
		calc.multiply(4, 5);
		calc.subtract(16, 7);
		calc.divide(18, 9);
		calc.printOperations();
		calc.clearOperations();
		calc.printOperations();
	}

}
