package t1_d2_napisy;
//napisz program który:
//
//1. Dla znajdującej się w pliku zmiennej `str` wyświetli na konsoli odwrócony napis.
//Przykład: dla napisu `Tak` wyświetli `kaT`.
public class Main3 {

	public static void main(String[] args) {
		String str="Josef";
		String reverse=new StringBuffer(str).reverse().toString();
		System.out.println(reverse);

	}
	

}
