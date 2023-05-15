package com.mimaraslan.day2;

public class MyApp {

	public static void main(String[] args) {

		int sayi1, sayi2;
		sayi1 = 8;
		sayi2 = 3;

		int toplam = sayi1 + sayi2;
		System.out.println(toplam);
		
		int cikarma = sayi1 - sayi2;
		System.out.println(cikarma);
		
		int carpma = sayi1 * sayi2;
		System.out.println(carpma);
		
		int bolme = sayi1 / sayi2;
		System.out.println(bolme);
		
		System.out.println("---------------"); 
		
		int sonuc = sayi1 + sayi2;
		System.out.println(sonuc);
		
		sonuc = sayi1 - sayi2;
		System.out.println(sonuc);
		
		sonuc = sayi1 * sayi2;
		System.out.println(sonuc);
		
		sonuc = sayi1 / sayi2;
		System.out.println(sonuc);
		
		System.out.println("---------------"); 

		float  a = 10.3f;
		double b = 27.8;
		
		double result = a + b; 
		System.out.println(result);
		
		float result2 = (float) (a + b); 
		System.out.println(result2);
		
	
		System.out.println(String.format("%.2f", result2));
		
		System.out.println("---------------"); 

		long zaman = 60 * 60 * 24 * 365;
		System.out.println(zaman);
		
	}

}
