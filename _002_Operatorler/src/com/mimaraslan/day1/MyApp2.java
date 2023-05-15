package com.mimaraslan.day1;

public class MyApp2 { //scope
	
	static int sayi; // 0

	public MyApp2() {
		sayi = 25; // 25
		System.out.println("İLK HAZIRLAYICI: " + sayi);
	}
	
	public static void main(String[] args) { //scope
		// int sayi = 12;
		
		// 0     12    25    calisma zamanı hatası verir
		System.out.println("main metodu 1. DURUM: "+ sayi);
		

		MyApp2 myObj = new MyApp2();
		
		
		System.out.println("main metodu 2. DURUM : "+ sayi);

	}

}
