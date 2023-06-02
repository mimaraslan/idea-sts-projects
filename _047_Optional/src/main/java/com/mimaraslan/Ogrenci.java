package com.mimaraslan;

public class Ogrenci {

  private static long sayac = 1l;
    long id;
    String ad;

    public Ogrenci(String ad) {
        id = sayac++;
        this.ad = ad;
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
}
