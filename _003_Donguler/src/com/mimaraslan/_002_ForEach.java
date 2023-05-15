package com.mimaraslan;

public class _002_ForEach {

	public static void main(String[] args) {

		// Ogrenci Listesi
		String ogenci1 = "Ahmet";
		String ogenci2 = "Mehmet";
		String ogenci3 = "Ali";
		String ogenci4 = "Veli";
		String ogenci5 = "Zeynep";
		String ogenci6 = "Ayşe";
		
		// Array dizi
		String [] ogrenciler = {"Ahmet", "Mehmet", "Ali", "Veli", "Zeynep", "Ayşe"};

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
		System.out.println("-------------");
		
					   //    0    1    2    3   4
		int myNumbers[] = { 100, 250, 300, 75, 45  };

		for (int myNumber : myNumbers) {
		    System.out.print(myNumber*3 + " ");
		}
		
	}

}
