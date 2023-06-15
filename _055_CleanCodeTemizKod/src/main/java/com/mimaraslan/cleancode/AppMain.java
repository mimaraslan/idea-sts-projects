package com.mimaraslan.cleancode;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public AppMain() {
    }

    public static void main(String[] args) {

        new AppMain();

        System.out.println("Hello world!");

        String adi = "Ünal";

        /*
        Temiz kod:
        1-  Okunurluk :  Projenin, paketlerin, siniflarin, metotlarin, degişkenlerin isimleri okunduğunda anlaşılmalı.
            Ölçümüz var. İhtiyacimiz olmadikca ekleme yapmiyoruz!!!

        2- Kodun son kullanma tarihi?
        Kodun sürümleri olur. Kodun bakımı yapılmalı.

        3- Siniflar birini kullaniyor. Aralarindaki bag zayif olmali. Esnek olmalı.

        4- Siniflar, metotlar, degiskenler olabildiğince kucuk parcalara ayrilmali. Kontrol yonetimi kolay olur.
            Siniflar ortalama 500 satiri gecmemeye bak.
            Metotlarda 15-20 satir gecmese iyi olur. (Tekrar eden kodlar metot icinde yar almalidir.)
            Metotlarin parametre sayilari ortalama 5 taneyi gecmemeli. Ideali 2 tanedir.

        5- paketler icin hiyerasini duzgun kurmak

        6- If-else / Switch-Case karar mekanizmalari
           En fazla 7-8 kademede isi bitirmelisiniz.

        */


        // TEK SADECE 1 TANE ISIM ICIN BU DOGRU
        String ogrenciAdi;
        ogrenciAdi = "Aysu";

        // SADECE 1 ISIM ICIN BOYLE KULLANMAK ISRAFTIR VE GERKSIZDIR!
        List<String> ogrenciAdi2 = new ArrayList<>();
        ogrenciAdi2.add("Aysu");


        String OgrenciSoyadi = "Çağışlar";

        int c = 15;

        String person;
        String satanKisi;

        int number = 30;

        double _double;

        // Dogru olani budur.
        ekranaYaz();

        // OLMAZ!!! YAPMAYIN!
        EkranaBaski();

        ekranayaz();

        
        // Parametrelerde ENUM kullanilmali.
        koluKaldir(1, "LEFT");

      sagaHareket();
      solaHareket();
      daireselHareket();
      
      kafayiSoldanSagaCevir();
      
    }

    private static void kafayiSoldanSagaCevir() {
    }

    private static void daireselHareket() {
    }

    private static void solaHareket() {
    }

    private static void sagaHareket() {
    }

    private static void koluKaldir(int i, String yon) {

        solaHareket();
        
    }

    private static void ekranayaz() {
    }

    private static void EkranaBaski() {
    }

    private static void ekranaYaz() {
        System.out.println("Selam ekrana mesaj verildi.");
    }
}