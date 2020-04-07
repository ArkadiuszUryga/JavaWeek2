package t1_d2_zadania_domowe;
//W pliku `Main3.java` umieść  metodę  o sygnaturze `static String upperCase(String str, int index)` .
//
//1. Metoda zwraca napis `str`, w którym znaki zostały zamienione na duże z pozycji podzielnych przez `index`
public class Main3 {
	static String str="Na tej stronie banknotu umieszczono Polską flagę, a po lewej orzeł legionowy (strzelecki), a wokół niego umieszczono napis RZECZPOSPOLITA POLSKA. ";
	static int index=3;
	public static void main(String[] args) {
		System.out.println(upperCase(str, index));

	}
	static String upperCase(String str, int index)	{
		str=str.toLowerCase();
		char[] strArray = str.toCharArray();
		for (int i=0;i<str.length();i++)	{
			if (i%index==0) {
				strArray[i]=Character.toUpperCase(strArray[i]);
			}
		}
		return new String(strArray);
		
	}

}
