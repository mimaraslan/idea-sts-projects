package com.mimaraslan.v1;

import java.util.concurrent.atomic.AtomicInteger;

public class Ucak {

    float uzunluk;
    float yukseklik;
    int hiz;
    float agirlik;
    boolean ucakKonumDurumu;

    static int toplamUcakSayisi;
    static int pilotSayi;


    static final int MAX_YOLCU_SAYISI = 200;

    static {
        System.out.println("bu static block sadece 1 defa çağırılır.");
    }

      {
        uzunluk = 150;
        ++toplamUcakSayisi;
        pilotSayi += 2;
        System.out.println("static block - Uçak oluşturuldu.");
    }

    public Ucak() {
      //  toplamUcakSayisi = toplamUcakSayisi + 1;
      //  System.out.println("parametresiz hazırlayıcı");
    }



    public boolean inisKontrol(){ // true
           ucakKonumDurumu = true;
            return ucakKonumDurumu;
    }


    public boolean kalkisKontrol(){ // false
        ucakKonumDurumu = false;
        return ucakKonumDurumu;
    }


    public Ucak(float uzunluk, float yukseklik) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
      //  ++toplamUcakSayisi;
    }

    public Ucak(float uzunluk, float yukseklik, int hiz) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.hiz = hiz;
      //  ++toplamUcakSayisi;
    }

    public Ucak(float uzunluk, float yukseklik, int hiz, float agirlik) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.hiz = hiz;
        this.agirlik = agirlik;

     //   ++toplamUcakSayisi;
    //    System.out.println("4 parametreli hazırlayıcı");
    }

    public Ucak(float uzunluk, float yukseklik, int hiz, float agirlik, boolean ucakKonumDurumu) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.hiz = hiz;
        this.agirlik = agirlik;
        this.ucakKonumDurumu = ucakKonumDurumu;
    //    ++toplamUcakSayisi;
    //    System.out.println("5 parametreli hazırlayıcı");
    }


    @Override
    public String toString() {
        return "Ucak{" +
                "uzunluk=" + uzunluk +
                ", yukseklik=" + yukseklik +
                ", hiz=" + hiz +
                ", agirlik=" + agirlik +
                ", ucakKonumDurumu=" + ucakKonumDurumu +
                '}';
    }
}
