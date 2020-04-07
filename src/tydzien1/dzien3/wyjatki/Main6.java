package tydzien1.dzien3.wyjatki;

public class Main6 {

	public static void main(String[] args) {
		
        try	{
        	String str = null;
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
        	e.getStackTrace();
        	System.out.println(e.getMessage());
        }

	}

}
