package com.mimaraslan;

import java.util.Optional;

public class AppMain {
    public static void main(String[] args) {
        
        Ogrenci ogrenci = new Ogrenci("Ali");
        System.out.println("id........: "+ ogrenci.getId());
        System.out.println("ad........: "+ ogrenci.getAd());

        ogrenci = new Ogrenci("Yiğitcan");
        System.out.println("id........: "+ ogrenci.getId());
        System.out.println("ad........: "+ ogrenci.getAd());

        ogrenci = new Ogrenci("Aysu");
        System.out.println("id........: "+ ogrenci.getId());
        System.out.println("ad........: "+ ogrenci.getAd());



        ogrenci = null;
      //  System.out.println(ogrenci.getAd());
       System.out.println(Optional.ofNullable(ogrenci));


        System.out.println("----------------------------------------------");

        Optional<Double> ortalama = ortalamaHespla(100, 85);
        if (ortalama.isPresent()){
            System.out.println("Ortalaması: "+ ortalama.get());
        } else {
            System.out.println("Henüz sınav yapılmadı.");
        }
    }

    private static Optional<Double>  ortalamaHespla(double... notlar) {
       if (notlar.length == 0) return Optional.empty();

       double toplam = 0;
        for (double not :  notlar) {
            // toplam = toplam + not;
            toplam += not;
        }

        double sonuc = toplam/notlar.length;

        return Optional.of(sonuc);
    }
}