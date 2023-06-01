package com.mimaraslan.zamaneklemecikarma;

import java.time.LocalDate;

public class ZamanEkleCikar {

    public static void main(String[] args) {


        LocalDate localDate = LocalDate.of(2024, 1, 8);

        System.out.println("Tarih : " + localDate);
        System.out.println("5 gün ekleme yapıldı : " + localDate.plusDays(5));
        System.out.println("3 ay ekleme yapıldı : " + localDate.plusMonths(13));
        System.out.println("2 hafta ekleme yapıldı : " + localDate.plusWeeks(2));

        System.out.println("4 hafta çıkarma yapıldı : " + localDate.minusWeeks(4));

        LocalDate localDate2 = LocalDate.of(2026, 8, 21);

        // ÖDEVİNİZ
        System.out.println("tarih fark"+ farkiniAl(localDate2, localDate));


    }

    private static LocalDate farkiniAl(LocalDate localDate2, LocalDate localDate) {
        return null;
    }
}
