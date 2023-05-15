package com.mimaraslan;

public class _001_If {

	public static void main(String[] args) {
		
		if (  1 > 0  ) {
			System.out.println("1. EVET DOĞRU");
		}
		
/*	
		if (  1 > 25  ) {
			System.out.println("2. EVET DOĞRU");
		}
*/
		
		int a = 3;
		
		if (a > 25) {
			System.out.println("3. EVET DOĞRU");
		}
		
		
		int x, y, z;
		x = 10;
		y = 15;
		z = 25;
		
		// Parantez içi
		// Çarpma ya da bölme    ----- soldan sağa
		// Toplama ya da çıkarma ----- soldan sağa
		//     25  >  -10
		if ( (x+y) > (y-z) ) {
			System.out.println("4. EVET DOĞRU");
		} 
		
	}

}
