package com.mimaraslan.day1;

public class OperatorlerVeDonguler {

	public static void main(String[] args) {
		
/*		
			int i = 0;
			System.out.println(i); 
			
			i = i + 1;
			System.out.println(i); 
	
			i += 1;
			System.out.println(i); 	
			
			i++;
			System.out.println(i); 
		
		 */

		    // BASLANGIC    SART     ARTTIM
		for (int i = 0;   i < 10;  i++) { //Scope
			System.out.println(i);
		}
	
		System.out.println("-----------------------------");
		for (int i = 0;    i < 10;     i += 2) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------------");
		for (int i = 0;    i < 10;    i = i + 2) {
			System.out.println(i);
		}
		
		
		
	
		
		
		
	}
}
