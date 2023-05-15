package com.mimaraslan;

public class _004_Switch {

	public static void main(String[] args) {

		// A B C D E
		char harf = 'T';

		switch (harf) {

		case 'A':
			System.out.println("Seçilen : " + harf);
			break;

		case 'B':
			System.out.println("Seçilen : " + harf);
			break;

		case 'C':
			System.out.println("Seçilen : " + harf);
			break;

		case 'D':
			System.out.println("Seçilen : " + harf);
			break;

		default:
			System.out.println("Seçiminiz " + harf + " uygun değil.");
			break;
		}

		int haftaninGunu = 43;
		switch (haftaninGunu) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;

		default:
			System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz");
			break;
		}

		System.out.println("---------------------");

		haftaninGunu = 5;
		String haftaninGunuDegeri = null;

		switch (haftaninGunu) {

		default:
			System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz");
			break;

		case 1:
			haftaninGunuDegeri = "Pazartesi";
			break;
		case 2:
			haftaninGunuDegeri = "Salı";
			break;
		case 3:
			haftaninGunuDegeri = "Çarşamba";
			break;
		case 4:
			haftaninGunuDegeri = "Perşembe";
			break;
		case 5:
			haftaninGunuDegeri = "Cuma";
			break;
		case 6:
			haftaninGunuDegeri = "Cumartesi";
			break;
		case 7:
			haftaninGunuDegeri = "Pazar";
			break;

		}

		if (haftaninGunuDegeri == null) {

		} else {
			System.out.println("1. Durum: " + haftaninGunuDegeri);
		}

		if (haftaninGunuDegeri != null) {
			System.out.println("2. Durum: " + haftaninGunuDegeri);
		}

		System.out.println("---------------------");

		// Hafta içi - hafta sonu
		// 1 2 3 4 5 - 6 7

		int gunSirasi = 7;
		switch (gunSirasi) {

		case 1:
			System.out.println("Pts.");
		case 2:
			System.out.println("Sal.");
		case 3:
			System.out.println("Çar.");
		case 4:
			System.out.println("Per.");
		case 5:
			System.out.println("Cum.");
			System.out.println("Hafta içi");
			break;

		case 6:
			System.out.println("Cmt.");
		case 7:
			System.out.println("Paz.");
			System.out.println("Hafta sonu");
			break;

		default:
			System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz.");
			break;
		}

		

	}

}
