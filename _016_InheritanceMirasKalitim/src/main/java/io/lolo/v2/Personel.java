package io.lolo.v2;

public class Personel {

    // ORTAK ALANLAR
    private String adi;
    private String soyadi;
    private String adres;
    private String telefon;
    private String tc;
    private int yas;
    private int maasKatSayi;

    private long gorevTazminati;


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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }


    public int getMaasKatSayi() {
        return maasKatSayi;
    }

    public void setMaasKatSayi(int maasKatSayi) {
        this.maasKatSayi = maasKatSayi;
    }

    public long getGorevTazminati() {
        return gorevTazminati;
    }

    public void setGorevTazminati(long gorevTazminati) {
        this.gorevTazminati = gorevTazminati;
    }
}
