package com.mimaraslan;

public class _003_ForDongusu_Virgullu {

	public static void main(String[] args) {
		/*
		 * for (char i = 0; i < 255; i++)
		 *  { 
		 *  System.out.print(i + " ");
		 *   }
		 */

		for (double i = 0.3; i < 10.1; i = i + 0.5) {
			System.out.println(i);
		}

		System.out.println("--------------------");
		for (double i = 0.3; i < 10.1; i += 0.5) {
			System.out.println(i);
		}

		System.out.println("--------------------");
		for (float i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

}
