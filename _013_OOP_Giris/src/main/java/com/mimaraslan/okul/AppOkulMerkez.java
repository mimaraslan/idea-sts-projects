package com.mimaraslan.okul;

public class AppOkulMerkez {

    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.numarasi = 100;
        ogrenci.adi = "Ali";
        ogrenci.soyadi = "Güneş";

        System.out.println("Öğrenci NO: " + ogrenci.numarasi);
        System.out.println(ogrenci.adi);
        System.out.println(ogrenci.soyadi);

        Ogrenci ogrenci2 = new Ogrenci();
        ogrenci2.numarasi = 200;
        ogrenci2.adi = "Gizem";
        ogrenci2.soyadi = "Kuşçuoğlu";

        System.out.println(ogrenci2.numarasi
                + " " + ogrenci2.adi
                + " "  + ogrenci2.soyadi);

    }
}
