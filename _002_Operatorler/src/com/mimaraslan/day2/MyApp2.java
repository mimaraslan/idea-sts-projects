package com.mimaraslan.day2;

import java.util.Scanner;

public class MyApp2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    System.out.print("Lütfen bir sayı giriniz. : ");
		int i = sc.nextInt();
	     
		System.out.println("SONUÇ: " + i*5);
		
		
		System.out.println("----------------------------------");
		
		System.out.print("LÜTFEN YAŞINIZI GİRİNİZ. : ");
		int secmenYasi= sc.nextInt() , yasiSiniri=18;
		
		
		
		System.out.println(secmenYasi >= yasiSiniri);
		
		
		// Karar kontrol mekanizmasi
		
		if (secmenYasi >= yasiSiniri) {
			System.out.println("EVET oy kullanabilirsiniz.");
		} else {
			System.out.println("HAYIR oy kullanamazsınız!");
			System.out.println(yasiSiniri-secmenYasi + " yıl sonra kullanabilirsiniz.");
		}
		
		System.out.println("----------------------------------");

		System.out.print("Lütfen virgüllü bir sayı giriniz. : ");
		float myValue = sc.nextFloat();
	     
		System.out.println("SONUÇ VİRGÜLÜ : " + myValue* 1.5);
		
	
	}

}
