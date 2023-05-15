package com.mimaraslan.day1;

public class Secim {

	public static void main(String[] args) {

		int secmenYasi=1 , yasiSiniri=18;
		
		System.out.println(secmenYasi >= yasiSiniri);
		
		
		// Karar kontrol mekanizmasi
		
		if (secmenYasi >= yasiSiniri) {
			System.out.println("EVET oy kullanabilirsiniz.");
		} else {
			System.out.println("HAYIR oy kullanamazsınız!");
			System.out.println(yasiSiniri-secmenYasi + " yıl sonra kullanabilirsiniz.");
		}

		System.out.println("---------------------------------");
		
		System.out.println( (secmenYasi >= yasiSiniri) ? "EVET" :"HAYIR");
		
		System.out.println("---------------------------------");

		System.out.println( (secmenYasi >= yasiSiniri) 
				? 
				
						"EVET oy kullanabilirsiniz." 
						
				
				:
				 
					"HAYIR oy kullanamazsınız!\n" + 
					(yasiSiniri-secmenYasi) + " yıl sonra kullanabilirsiniz.");
		
	}
}
