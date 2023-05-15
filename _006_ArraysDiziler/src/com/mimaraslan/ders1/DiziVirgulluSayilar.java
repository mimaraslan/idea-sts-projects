package com.mimaraslan.ders1;

public class DiziVirgulluSayilar {

	public static void main(String[] args) {
							//   0       1      2
		double [] myCarPrices= {1.9  ,  2.4  , 6.8 };
		double myCarPricesTotal = 0;
		
		
		
		for (int i = 0; i < myCarPrices.length; i++) {
			System.out.println(myCarPrices[i]);
			myCarPricesTotal = myCarPricesTotal + myCarPrices[i];
		}
		
		System.out.println("TOPLAM: " + myCarPricesTotal);
		
		
		System.out.println("--------------------");
		
		myCarPrices[0] = 100.3;
		
		for (int i = 0; i < myCarPrices.length; i++) {
			System.out.println(myCarPrices[i]);
			myCarPricesTotal = myCarPricesTotal + myCarPrices[i];
		}
		
		System.out.println("TOPLAM: " + myCarPricesTotal);
		
		System.out.println("--------------------");

		for (double myCarPrice : myCarPrices) {
			System.out.println(myCarPrice);
		}
		
	}

}
