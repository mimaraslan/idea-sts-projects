package com.mimaraslan.ornek06sayac;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AppMain {
  //  static AtomicInteger sayac2 = new AtomicInteger(1);

    public static  int sayac1 = 1;
    public static void main(String[] args) {

        List <String> ogrenciListesi = List.of
        ("Abdullah Aktaş",
        "Ahmet Akkoyun",
        "Ali Güneş",
        "Aminenur Göynük",
        "Aysu Çağışlar",
        "Burak Delice",
        "Engin Ertikmen",
        "Gizem Kuşçuoğlu",
        "Mehmet Caner Öksüz",
        "Orhun Bayındır",
        "Osman Onur Baş",
        "Salih Polat Dönmez",
        "Serkan Şahin Zorlu",
        "Yiğitcan Abay",
        "Ünal Gani Berk");

        // BU CALISMAZ!!!
      //  int sayac1 = 1;

        ogrenciListesi.forEach( ogr ->
        {
            System.out.println( sayac1 +  "  " + ogr);
            sayac1++;
        });

        System.out.println("------------------------------------------");


        AtomicInteger sayac2 = new AtomicInteger(1);

        ogrenciListesi.forEach( ogr ->
        {
            System.out.println( sayac2 +  "  " + ogr);
            sayac2.getAndIncrement();
        });


    }
}
