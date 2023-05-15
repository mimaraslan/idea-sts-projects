package com.mimaraslan;

public class JavaDataType {  // Scope 1

	static int i = 10;
	       int b = 1;
	       int j = 2;
	       int k = 3;
	       
	public static void main(String[] args) { // Scope 2	
		boolean medeniDurumu = false;  
		
		byte yasi = 127;
		short yonetimUyeSayisi = 32767;
		
		char kursSube = 'A';
		int ulkeNufusu = 2_147_483_647;
	
		long bankaToplamHesabi1 = 100l;
		long bankaToplamHesabi2 = 100L;

		float piSayisi1 = (float) 3.14;
		float piSayisi2 =         3.14f;
		float piSayisi3 =         3.14F;
		
		double finansBankaHesabim = 1;
		double finansBankaHesabim2 = 1d;
		double finansBankaHesabim3 = 1_000_000.52D;

		
		String adi = "Mehmet Caner";
		String soyadi = "Öksöz";
		System.out.println(adi + " " + soyadi);	
		
		System.out.println(i); // 10
	
		JavaDataType obj = new JavaDataType();
		
		System.out.println(obj.b); // 1
		obj.b = 40; 
		System.out.println(obj.b); // 40
		
		obj.j = 50; 
		System.out.println(obj.j);
		
		obj.k = 60;
		System.out.println(obj.k);
		
		JavaDataType obj2 = new JavaDataType();
		System.out.println(obj2.b); 	
	}
	
}