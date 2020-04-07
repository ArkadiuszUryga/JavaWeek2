package tydzien1.dzien3.wyjatki;

public class Main3 {

	public static void main(String[] args) {
		try	{
		showLength(null);
		}
		catch (NullPointerException e) {
			e.getStackTrace();
		}

	}
	 static void showLength(String s) {
	        System.out.println(s.length());
	    }

}
