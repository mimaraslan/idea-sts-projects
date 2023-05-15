package com.mimaraslan.day1;

public class Ev {
	
	static String sifre = "123";
	
	
	public Ev() {
		sifre = "Ankara06";
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(sifre);

	//	System.out.println(new Ev().sifre);
		
		Ev ev = new Ev();
		System.out.println(ev.sifre);
		
		ev.sifre = "Adana01";
		System.out.println(ev.sifre );
		
	}
	
}
