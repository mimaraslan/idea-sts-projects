package com.mimaraslan;

public class DortIslem {

	public static void main(String[] args) {

		DortIslem obj = new DortIslem();
		
		int sonuc = obj.toplama(10, 5);
		System.out.println(sonuc);	
		obj.cizgiCiz();
		
		sonuc = obj.cikarma(100, 80);
		System.out.println(sonuc);
		obj.cizgiCiz();
		
		System.out.println(obj.carpma(2, 3));
		obj.cizgiCiz();
		
		System.out.println(obj.bolme(5, 2));
		
		
	}

     void cizgiCiz() {
		System.out.println("-------------------");		
	}

	 int toplama(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	 int cikarma (int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}

	 int carpma (int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}
	
	 double bolme (int sayi1, int sayi2) {
		return  (double) sayi1 / sayi2;
	}
}
