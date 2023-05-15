package com.mimaraslan;

public class _001_ForDongusu {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("------------------------");

		for (int sayi = 0; sayi < 10; sayi++) {
			System.out.println(sayi);
		}

		System.out.println("------------------------");

		for (int sayi = 0; sayi < 10; sayi++) { // Scope

			if (sayi == 3) {
				System.out.println("\tÜÇ SAYISINI BULDUM. " + sayi);
				System.out.println("Kralını tanımam.");
			}
			
			System.out.println(sayi);

		}

		System.out.println("------------------------");

		for (int i = 1; i < 5; i++) {
			System.out.println("\ni: " + i);

			for (int j = 1; j <= 7; j++) {
				System.out.println("\tj: " + j);

				//System.out.println("i: " + i   +  "\t" + "j: " + j );

			}
			
		}

	}

}
