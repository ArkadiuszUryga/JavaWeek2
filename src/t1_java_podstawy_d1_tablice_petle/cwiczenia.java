package t1_java_podstawy_d1_tablice_petle;

import java.util.Arrays;

public class cwiczenia {

	public static void main(String[] args) {
		int[] org= {9,21,32,42,11};
		int[] copy=new int[7];
		for (int i=0;i<org.length;i++)	{
			copy[i]=org[i];
		}
		copy[5]=55;
		copy[6]=66;
		int[] secondCopy=org.clone();
		int[]copyArray=Arrays.copyOf(org, org.length);
		System.out.println();
		for (int org1:org)	{
			System.out.println(org1+"oryginalna");
		}
		
		for (int org2:copy)	{
			System.out.println(org2+"pierwsza kopia");
		}
		
		for (int org3:secondCopy)	{
			System.out.println(org3+"druga kopia");
		}
		
		for (int org4:copyArray)	{
			System.out.println(org4+"czecia kopia");
		}
		
		
		
	}

}
