package com.mimaraslan;

public class MyString {

	public static void main(String[] args) {

		
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}

		System.out.println("\n-----------------------");
		String alfabe = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(alfabe.toUpperCase());
		System.out.println(alfabe.length());
		
		System.out.println("\n-----------------------");
		String alfabe2 = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(alfabe2);
		
		System.out.println("\n-----------------------");
		String duzYazi = """
				abcdefghijklmnopqrstuvwxyz""";
		
		System.out.println(duzYazi);
		
		System.out.println("\n-----------------------");
		System.out.println(alfabe == alfabe2);
		System.out.println(alfabe == duzYazi);
		System.out.println(alfabe.charAt(25));

	}

}
