package com.mimaraslan;

public class _006_Continue {

	public static void main(String[] args) {
	
		
		// continue DONGUNUN BASINA GİT
		for (int i = 0; i < 25; i++) {
			
			
			// 20'yi bul ve dongunun başına git.
		
			if(i == 20) {
				
				System.out.println("20yi buldum.");
				continue; // DEVAM ETTİR BAŞA GİDER.
				
				//break; // KIRAR VE ÇIKAR
			} else {
				System.out.println(i);
			}
	
		}
		// break DONGUNUN SONUNA GİDER.
		
	}

}
