package com.mimaraslan.model.factory.v1pojo;

public class AppMain {

	public static void main(String[] args) {
	
		/**
		 * Factory Design Pattern
		 *  1- TasimaTipi
		 *  2- Tasima
		 *  3- Ucak, Gemi, Kamyon, Kamyonet
		 *  4- TasimaFactory
		 *  5- AppMain
		 */
/*		
		Tasima tasima = new Gemi();
		Tasima tasima = new Kamyon();
		Tasima tasima = new Ucak();
		Tasima tasima = new Kamyonet();
*/
		
		Tasima tasima = null; // Nesne referansi
		System.out.println(tasima);

		tasima = TasimaFactory.builder(TasimaTipi.KARA);  // Nesne
		System.out.println(tasima);

		tasima = TasimaFactory.builder(TasimaTipi.DENIZ); // Nesne
		System.out.println(tasima);

		tasima = TasimaFactory.builder(TasimaTipi.HAVA);  // Nesne
		System.out.println(tasima);


	}
}
