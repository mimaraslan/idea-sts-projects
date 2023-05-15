package com.mimaraslan.day1;

public class MyApp {

	/*
	  

Byte tipi min     : -128
Byte tipi max     : 127
Short tipi min    : -32768
Short tipi max    : 32767
Integer tipi min  : -2147483648
Integer tipi max  : 2147483647
Long tipi min     : -9223372036854775808
Long tipi max     : 9223372036854775807

Float tipi min    : 1.4E-45
Float tipi max    : 3.4028235E38
Double tipi min   : 4.9E-324
Double tipi max   : 1.7976931348623157E308
	  
	 */
	public static void main(String[] args) {
		int    sayi1 =  25; 
		
		float  sayi2 =  (float) 33.1;
		double sayi3 =  33.1;
		
		char myChar1 = 'A';
		
		boolean durum = false; // true;
		
		long sayi4 = 25;
		
		short sayi5 = 10; 
		
		short sonuc = 0;
		
		sonuc = sayi1 + sayi5;
		
		System.out.println(sayi1 + sayi4);
		
	}

}
