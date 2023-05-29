package com.mimaraslan.v4;

public class AppMain {


    public static void main(String[] args) {

        Ucak ucak1 = new Ucak();
        System.out.println(ucak1);
        ucak1.bilgiVer("Ucak tanmirde");

        Ucak ucak2 = new Ucak(1.0f, 2.0f, 3, 4.0f, true, 5.0f );
        System.out.println(ucak2);
        ucak2.bilgiVer("Hangardan çıktı");

        Helikopter helikopter1 = new Helikopter();
        System.out.println("helikopter1: " + helikopter1);
        helikopter1.manevra();
        helikopter1.inisKontrol();
        helikopter1.bilgiVer("Pervane tamiri tamamlandı");

        Helikopter helikopter2 = new Helikopter(10.0f, 20.0f, 30, 40.f, false,
                50.0f, 6.0f);
        System.out.println("helikopter2: "+ helikopter2);


        System.out.println("\nToplam hava acracı sayısı: " + HavaAraci.toplamUcakSayisi);
        System.out.println("Pilot sayisi : " + HavaAraci.pilotSayi);


        adiYaz();

    }

    private static void adiYaz() {
        System.out.println("selam");
    }


}