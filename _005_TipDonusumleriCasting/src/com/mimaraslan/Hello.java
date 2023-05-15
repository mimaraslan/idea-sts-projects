package com.mimaraslan;

public class Hello implements IHello, IDeneme {

	public static void main(String[] args) {

		Hello obj = new Hello();
		obj.selamVer();
		
		obj.kural3("BURAK DELİCE");
	}

	@Override
	public void selamVer() {
		System.out.println("SELAMLAR GÜZEL İNSANLAR.");
	}

	@Override
	public void kural2() {
		System.out.println("Kural 2");
	}

	@Override
	public void kural3(String mesaj) {
		
		System.out.println("KURAL 3: " + mesaj);
	}

	@Override
	public void adiniziYaz() {
		// TODO Auto-generated method stub
		
	}

}
