package com.mimaraslan;

import java.util.Date;

public class Kiralama {

    private int id;
    private Kasiyer kasiyer;
    private Musteri musteri;
    private Araba araba;
    private long tarih;

    //   private Float ucret;
/*
* Enum kiralama tipi SAATLIK, GUNLUK, AYLIK, YILLIK
* */


    public Kiralama() {
    }

    public Kiralama(int id, Kasiyer kasiyer, Musteri musteri, Araba araba) {
        this.id = id;
        this.kasiyer = kasiyer;
        this.musteri = musteri;
        this.araba = araba;
        this.tarih = System. currentTimeMillis();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Kasiyer getKasiyer() {
        return kasiyer;
    }

    public void setKasiyer(Kasiyer kasiyer) {
        this.kasiyer = kasiyer;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public Araba getAraba() {
        return araba;
    }

    public void setAraba(Araba araba) {
        this.araba = araba;
    }

    public long getTarih() {
        return tarih;
    }

    public void setTarih(long tarih) {
        this.tarih = tarih;
    }

    @Override
    public String toString() {
        return "Kiralama{" +
                "id=" + id +
                ", kasiyer=" + kasiyer +
                ", musteri=" + musteri +
                ", araba=" + araba +
                ", tarih=" + tarih +
                '}';
    }
}
