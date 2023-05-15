package com.mimaraslan.ders1;

public class MerhabaDiziler {

	public static void main(String args) {
		
		int sayi1 = 10;
		int sayi2 = 14;
		int sayi3 = 15;
		int sayi4 = 22;
		
		System.out.println(sayi1 + " " + sayi2 + " " + sayi3 + " " + sayi4);
		
		
		// Array  
	//	int sayi[] = null; // NullPointerException
	//	int sayi[] = new int[4];
		/*
		int sayi[];
		sayi = new int[4];
		*/
		/*
		int a;
		a = 10;
		*/
		
		int[] sayi = new int[4];
		
		sayi[0] = 10;
		sayi[1] = 14;
		sayi[2] = 15;
		sayi[3] = 22;
		
		System.out.println(sayi[0] + " " + sayi[1] 
				   + " " + sayi[2] + " " + sayi[3]);
/*	
		sayi[55] = 33;
		System.out.println(sayi[55]); // ArrayIndexOutOfBoundsException
*/
	
		for (int index = 0; index <= sayi.length; index++) {
			System.out.println(sayi[index]);
		}
		
	}

}
