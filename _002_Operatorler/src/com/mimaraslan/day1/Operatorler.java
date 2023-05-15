package com.mimaraslan.day1;

public class Operatorler {

	/*
	 * aritmetik opr. 
	 * iliskisel opr. 
	 * bitwise opr. 
	 * logic mantiksal opr. 
	 * atama opr.
	 * 
	 */

	public static void main(String[] args) {

		/*
		 * int sayi1 = 10; int sayi2 = 3;
		 */

		int sayi1 = 10, sayi2 = 3;

		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1 - sayi2);
		System.out.println(sayi1 * sayi2);
		System.out.println(sayi1 / sayi2);
		System.out.println(sayi1 % sayi2);

		// ++ degiskeni 1 arttir
		System.out.println(sayi1++); // 10
		System.out.println(sayi1); // 11

		System.out.println(++sayi2); // 4
		System.out.println(sayi2); // 4

		// -- degiskeni 1 azaltir
		System.out.println(sayi1--); // 11
		System.out.println(sayi1); // 10

		System.out.println(--sayi2); // 3
		System.out.println(sayi2); // 3

		System.out.println("------------------------------");

		// iliskisel operatorler
		System.out.println(sayi2 == 3);
		System.out.println(sayi2 > sayi1); 
		System.out.println(sayi2 >= 25);
		System.out.println(sayi2 < sayi1); 
		System.out.println(sayi2 <= 25);
		
		System.out.println("------------------------------");
		
		// bitwise opr.
		System.out.println(sayi1 & sayi2);
		System.out.println(sayi1 | sayi2);
		System.out.println(sayi1 ^ sayi2);
		System.out.println(sayi1 >> sayi2);
		System.out.println(sayi1 << sayi2);

		System.out.println("------------------------------");

		// logic mantiksal opr. 
		
		boolean a = true;  // 1
		boolean b = false; // 0
		System.out.println(a && b); // carpma // 0
		System.out.println(a || b); // toplama // 1
		
		System.out.println("------------------------------");
		// atama opr.
		sayi1 = 20;
		
	//	int sonuc = 0;
	//	sonuc = sayi1 + 5; // 20 + 5
		
		//sayi1 = sayi1 + 5   ;
		//System.out.println(sayi1);
		
		System.out.println(sayi1 += 5);

		
		

	}

}
