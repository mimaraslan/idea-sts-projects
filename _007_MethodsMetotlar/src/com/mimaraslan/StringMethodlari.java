package com.mimaraslan;

public class StringMethodlari {

	public static void main(String[] args) {


		String adi1 = "Mehmet Caner";
		
		System.out.println(adi1.length());
		
		String adi2 = "Burak Delice";
		
		if(adi1 == adi2) {
			System.out.println("Aynı");
		} else {
			System.out.println("Değil");
		}
		
		if(adi1.equals(adi2))  {
			System.out.println("Aynı");
		} else {
			System.out.println("Değil");
		}
		
		String str1 = "Adana";
		String str2 = "Merkez";
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));
		
		
		String ogrenci = "Serkan"; // 'S', 'e', 'r', 'k', 'a', 'n'
		char [] karakterler = ogrenci.toCharArray();
		System.out.println(karakterler);
		
		for (int i = 0; i < karakterler.length; i++) {
			System.out.println( karakterler[i]);
		}
		
		System.out.println("--------------------");
		
		                 //0123
		String personel = "Aysu Cansu Peteksu Çağışlar";
		System.out.print(personel.charAt(0));
		System.out.print(personel.charAt(1));
		System.out.print("*");
		System.out.print("*");
		
		System.out.println("--------------------");

		System.out.println(personel.contains("su"));
		
		System.out.println("--------------------");
		
		String [] sonDurum = personel.split("su "); 
		
		for (String item : sonDurum) {
			System.out.println(item);
		}
		
		System.out.println("--------------------");

		System.out.println(personel.replace('u', 'T'));
		
		
		
	}

}
