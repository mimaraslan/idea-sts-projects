package com.mimaraslan;

public class _005_Break {

	public static void main(String[] args) {

		System.out.println("-----FOR BREAK---------");

		for (int i = 0; i < 1_000_000; i++) {

			// 20 sayısını bul ve çık
			if (i == 20) { // bul
				System.out.println("20 SAYISINI BULDUM.");
				break; // çık
			} else {
				System.out.println("DEGİL: " + i);
			}
		}

		System.out.println("-----WHILE BREAK---------");

		int i = 0;
		while (i < 25) {
			// System.out.println(i);

			if (i == 20) {
				System.out.println("20 Sayısını buldum");
				break;
			} else {
				System.out.println("Değil " + i);
			}
			i++;

		}

	}

}
