package tydzien1.dzien3.zadania_domowe;
//W pliku `Main5.java` umieść metodę o sygnaturze `static int elementExist(int[] elements, int value)`.
//
//1. Uzupełnij ciało metody tak, aby sprawdzała czy w tablicy `elements` istnieje element o wartości `value`.
//2. Jeżeli wartość nie istnieje metoda zwróci wyjątek typu `Exception` z komentarzem `Nie ma takiego numeru!`.
//3. Uzupełnij sygnaturę metody informacją że może ona zwracać wyjątek typu `Exception`.
public class Main5 {
	static int[] input = {1,2,3,4,5,6,7};
	static int require = 8;
	public static void main(String[] args) {
		try {
	    	System.out.println(elementExist(input, require));
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    		
	    	}

	}
	
	static int elementExist(int[] elements, int value) 	throws Exception{
		
		int result=0;
		
		for (int i=0;i<elements.length;i++) {
			if (elements[i]==value) {
				result++;
			}
		}
		if (result>0) {
		return result;
		}
		else {throw new Exception("Nie ma takiego numeru");}
		
	}

}
