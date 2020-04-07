package t1_java_podstawy_d1_tablice_petle;

public class zad1 {

	public static void main(String[] args) {
		// Write a program in which you create a 10-element array of int numbers.
		
		int[] table=new int[10];
		
		//Use the for loop to store numbers 101 to 110 in subsequent cells
		int number=100;
		for (int i=0;i<table.length;i++) {
			number++;
			table[i]=number;
			System.out.println(table[i]);
			
		}
		
		
		
		//Write the contents of the board on the screen
		
	}

}
