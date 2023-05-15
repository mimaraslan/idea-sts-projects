package com.mimaraslan;

public class _003_If_Else_icice {

	public static void main(String[] args) {

		// Ehliyet alma --- saglikli olacak -  18'den buyuk olacak
		
		
		// if(saglikli olacak  VE 18'den büyük olacak)
				

		
		boolean saglikRaporu = true;
		int yasi = 25;
		
		if(saglikRaporu == true  && yasi > 18 ) {
			System.out.println("EVET ehliyet almaya uygunsunuz.");
		} else {
			System.out.println("HAYIR ehliyet almaya uygun değilsiniz.");
		}
		
		
		System.out.println("-------------------------------------");
			
		 saglikRaporu = false;
		 yasi = 25;
		
		if(saglikRaporu == true  && yasi > 18 ) {
			System.out.println("EVET ehliyet almaya uygunsunuz.");
		} else {
			System.out.println("HAYIR ehliyet almaya uygun değilsiniz.");
		}
		
		System.out.println("-------------------------------------");
		
		 saglikRaporu = false;
		 yasi = 15;
		
		if(saglikRaporu == true  && yasi > 18 ) {
			System.out.println("EVET ehliyet almaya uygunsunuz.");
		} else {
			
			
			if (saglikRaporu == false) {
				System.out.println("Sağlık raporunuz geçersiz.");
			} 
			
			
			if (yasi < 18) {
				System.out.println("Yaşınız henüz 18 değil.");
			}
			
			
			System.out.println("HAYIR ehliyet almaya uygun değilsiniz.");
			
		}
		
		
	}

}
