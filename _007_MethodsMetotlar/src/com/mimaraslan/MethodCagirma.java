package com.mimaraslan;

public class MethodCagirma {
    /*
	void selamVer(String adi){
		System.out.println("SELAM VER METODU. Sayın " + adi + " merhaba");
	} 
	*/
	
	String selamVer(String adi){
		return "Sayın " + adi + " merhaba hoşgeldiniz.";
	} 
	
	void selamAl(){
		System.out.println("SELAM AL METODU");
	}
	
	public static void main(String[] args) {

		MethodCagirma obj = new MethodCagirma();
		obj.selamAl();
		
		System.out.println(obj.selamVer("Ali")+ "Ooooo kralsınız.");
		
		String sonuc = obj.selamVer("Aminenur");
		System.out.println(sonuc);
		
		String kampanya = 
				"Size özel indirim kampanyalarımız var.\t" 
						+ obj.selamVer("Orhun");
		
		System.out.println(kampanya);
		

	}

}