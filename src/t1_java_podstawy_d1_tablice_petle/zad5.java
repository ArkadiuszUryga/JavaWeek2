package t1_java_podstawy_d1_tablice_petle;

public class zad5 {

	public static void main(String[] args) {
		int a=addTwoValues(4, 6);
		System.out.println(a);
		int four=4;
		four=addFourToValue(four);
		System.out.println(four);
		printSomeValues(5, 6, 7);

	}
	
	static int addTwoValues(int a, int b) {
		
		int result=a+b;
		return result;
		
	}
	
	static int addFourToValue(int a) {
		return a+4;
	}
	
	static void printSomeValues (int a, int b, int c) {
		System.out.println(a+" "+b+" "+c);
	}

}
