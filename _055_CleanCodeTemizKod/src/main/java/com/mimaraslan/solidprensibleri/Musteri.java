package com.mimaraslan.solidprensibleri;

import java.util.ArrayList;

public class Musteri {

    private String adi;

    private String soyadi;

 //v1
 //   private String  adres; // Adana Merkez No:01

/* v2
    private String adresSehir; // Adana
    private String adresSemt; // Merkez
    private String adresNo; // 01
    */

//v3
/*
    private Adres adresEv;
    private Adres adresEv2;
    private Adres adresIs;
    private Adres adresIs2;
    */

//v4
private ArrayList<Adres> adresListesi;

    public Musteri() {
    }

    public Musteri(String adi, String soyadi, ArrayList<Adres> adresListesi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.adresListesi = adresListesi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public ArrayList<Adres> getAdresListesi() {
        return adresListesi;
    }

    public void setAdresListesi(ArrayList<Adres> adresListesi) {
        this.adresListesi = adresListesi;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Musteri{");
        sb.append("adi='").append(adi).append('\'');
        sb.append(", soyadi='").append(soyadi).append('\'');
        sb.append(", adresListesi=").append(adresListesi);
        sb.append('}');
        return sb.toString();
    }
}
