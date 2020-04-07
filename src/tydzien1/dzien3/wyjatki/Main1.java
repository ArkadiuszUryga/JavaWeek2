package tydzien1.dzien3.wyjatki;

public class Main1 {

	public static void main(String[] args) {
		int[] tab = {  5, 1, 6, 7, 8 } ;
		try	{
		System.out.println(tab[21]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
