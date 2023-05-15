package com.mimaraslan;

public class SarmalamaWrapper {

	public static void main(String[] args) {
		
		int intYasi = 10;
		Integer integerYasi = 15;
		
		
		int sonuc1 = intYasi + integerYasi;
		System.out.println(sonuc1);
		
		Integer sonuc2 = intYasi + integerYasi;
		System.out.println(sonuc2);
		
		String sonuc3 = integerYasi.toString();
		System.out.println(sonuc3);
		
		String sonuc4 = Integer.valueOf(intYasi).toString();
		System.out.println(sonuc4);
		
		String sonuc5 = integerYasi+"";
		System.out.println(sonuc5);
		
		Boolean.valueOf(false);
		Byte.valueOf((byte) 0);
		Short.valueOf((short) 0);
		Integer.valueOf(0);
		Long.valueOf(0);
		Float.valueOf(0);
		Double.valueOf(0);
		Character.valueOf('A');
		
		
		String gelenParola = "123456789";
		int intParola =  Integer.parseInt(gelenParola); 
		Integer integerParola = Integer.valueOf(intParola);
		String sonucDeger = integerParola.toString();
	
	}

}
