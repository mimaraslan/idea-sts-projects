package com.mimaraslan.ders1;

public class CokBoyutluDiziler {

	public static void main(String[] args) {
			
	//	int [] myNumbers = new int [3];
	//	int [] myNumbers = {8, 44, 55};
/*
  		int[] sayi = new int[4];
		
		sayi[0] = 10;
		sayi[1] = 14;
		sayi[2] = 15;
		sayi[3] = 22; 
 */
		
	int [][] myNumbers = new int [3][5];	

	myNumbers[0][0] = 10;
	myNumbers[0][1] = 15;
	myNumbers[0][2] = 20;
	myNumbers[0][3] = 8;
	myNumbers[0][4] = 9;
	
					   //  [0][]     [1][]           [2][]
	int [][] myArray2 = {{10,20,30},  {10, 12, 40}   , {50, 70, 90 } };
	
	for (int i = 0; i < myArray2.length; i++) {
		
		for (int j = 0; j < myArray2.length; j++) {
			
			System.out.print (myArray2[i][j] + " ");
			
		}
		System.out.println();
	}
	
	System.out.println("---------------------");
	
	
	int [][] myArray3 = {
			{10, 20, 30, 11},  
			{80, 12, 40, 65},
			{50, 70, 90, 77}
			};
	
	for (int i = 0; i < myArray3.length; i++) { // satır
		
		for (int j = 0; j < myArray3[i].length; j++) { // sutun
			
			System.out.print (myArray3[i][j] + " ");
			
		}
		System.out.println();
	}
	
	System.out.println("---------------------");
	
	
	Integer [][] myArray4 = {
	// kolon  0   1   2   3    4
			{10, 20, 30,  11, null}, // satır 0
			{ }, 					 // satır 1
			{80, 12, 40, 65, 66},    // satır 2
			{50, 70, 90}             // satır 3
		}; 
	
	System.out.println(myArray4[3][4]);
	 
	

	
	System.out.println("---------------------");

	
	for (int i = 0; i < myArray4.length; i++) { // satır 
		
		for (int j = 0; j < myArray4[i].length; j++) { // sutun kolon
			
			System.out.print (myArray4[i][j] + " ");
			
		}
		System.out.println();
	}
	
	
	
	}

}
