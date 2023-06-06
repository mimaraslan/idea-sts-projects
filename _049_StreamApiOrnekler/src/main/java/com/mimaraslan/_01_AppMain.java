package com.mimaraslan;

import java.util.List;
import java.util.stream.Stream;

public class _01_AppMain {

    public static void main(String[] args) {


        Stream <String> bosKayit = Stream.empty();
        Stream <String> tekKayit = Stream.of("Serkan");
        Stream <String> cokluKayit = Stream.of("Aysu", "Gizem", "Aminenur");

        List<String> ogrencilerListesi = List.of("Burak", "Yiğitcan", "Abdullah", "Ahmet");

        System.out.println("-------------------------------------------------");

        Stream <String> orgencilerStreami =  ogrencilerListesi.stream();
        orgencilerStreami.forEach(System.out::println);

        System.out.println("-------------------------------------------------");
        Stream <String> orgencilerStreami2 =  ogrencilerListesi.stream();

        // parametre   return            sonuc
        orgencilerStreami2.forEach(ogenci        ->      System.out.println(ogenci));

        System.out.println("-------------------------------------------------");

        adiYaz("Osman");

        System.out.println("-------------------------------------------------");
        Stream <String> orgencilerStreami3 =  ogrencilerListesi.stream();
        orgencilerStreami3.forEach(ogenci        ->   {
            System.out.println("Ogrencilerin Bilgisi");
            System.out.println(ogenci);
            System.out.println("Teşekkürler.");
        });


    }

    private static void adiYaz(String ogrenci) {
        System.out.println(ogrenci.toUpperCase());
    }

}