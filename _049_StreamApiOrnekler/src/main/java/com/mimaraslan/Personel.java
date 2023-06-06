package com.mimaraslan;

import java.util.Random;

public class Personel {
    private long id;
    private String ad;
    private String soyad;

    public Personel(String ad, String soyad) {
       // this.id = id;
        this.id = new Random().nextLong();
        this.ad = ad;
        this.soyad = soyad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
