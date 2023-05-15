package com.mimaraslan;

/**
 * @author Mehmet Caner Öksüz
 * @author Burak Delice
 * @since 2006
 * @version 1.0.0
 */
public class HelloMethods {

	public HelloMethods() {
		System.out.println("constructor - Hazırlayıcı - Yapıcı");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Ana merkez - main");
		HelloMethods obj = new HelloMethods();

		selamVer();
		obj.selamAl();

		cizgiCiz();
		System.out.println(obj.toplamaYap() * 2);
		cizgiCiz();
		
		int sonuc = obj.toplamaYapModern( 10  , 3 );
		System.out.println(sonuc);
		cizgiCiz();
		System.out.println(obj.toplamaYapModern(45, 2));
		
		
	//	         f(x, y) = 2x+3 +y
	//	x=1 y=2  f(1, 2) = 7   
		

	}

	private static void cizgiCiz() {
		System.out.println("===============");
	}

	int toplamaYap() {
		int sayi1 = 10;
		int sayi2 = 5;
		// int sonuc = sayi1 + sayi2;
		// System.out.println(sonuc);
		// return sonuc;
		return sayi1 + sayi2;
	}
	
	int toplamaYapModern(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static void selamVer() { // SCOPE
		System.out.println("Selamlar nasılsın?");
	}

	public void selamAl() { // SCOPE
		System.out.println("Selamını aldım.");
	}

}
