package com.mimaraslan.v4;

public abstract class HavaAraci {

    float uzunluk;
    float yukseklik;
    int hiz;
    float agirlik;
    boolean ucmaDurumu;

    static int toplamUcakSayisi;
    static int pilotSayi;


    static final int MAX_YOLCU_SAYISI = 200;

    static {
        System.out.println("bu static block sadece 1 defa çağırılır.\n");
    }

      {
       // uzunluk = 150;
        ++toplamUcakSayisi;
        pilotSayi += 2;
        System.out.println("static block - Uçak oluşturuldu.\n");
    }

    public HavaAraci() {
      //  toplamUcakSayisi = toplamUcakSayisi + 1;
      //  System.out.println("parametresiz hazırlayıcı");
    }



    public boolean inisKontrol(){ // true
        ucmaDurumu = true;
            return ucmaDurumu;
    }


    public boolean kalkisKontrol(){ // false
        ucmaDurumu = false;
        return ucmaDurumu;
    }

    public abstract String bilgiVer(String mesaj);

    public HavaAraci(float uzunluk, float yukseklik) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
      //  ++toplamUcakSayisi;
    }

    public HavaAraci(float uzunluk, float yukseklik, int hiz) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.hiz = hiz;
      //  ++toplamUcakSayisi;
    }

    public HavaAraci(float uzunluk, float yukseklik, int hiz, float agirlik) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.hiz = hiz;
        this.agirlik = agirlik;

     //   ++toplamUcakSayisi;
    //    System.out.println("4 parametreli hazırlayıcı");
    }

    public HavaAraci(float uzunluk, float yukseklik, int hiz, float agirlik, boolean ucmaDurumu) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.hiz = hiz;
        this.agirlik = agirlik;
        this.ucmaDurumu = ucmaDurumu;
    //    ++toplamUcakSayisi;
    //    System.out.println("5 parametreli hazırlayıcı");
    }

    @Override
    public String toString() {
        return "HavaAraci{" +
                "uzunluk=" + uzunluk +
                ", yukseklik=" + yukseklik +
                ", hiz=" + hiz +
                ", agirlik=" + agirlik +
                ", ucmaDurumu=" + ucmaDurumu +
                '}';
    }
}
