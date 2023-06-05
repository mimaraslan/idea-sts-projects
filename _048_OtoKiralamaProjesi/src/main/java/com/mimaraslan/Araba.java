package com.mimaraslan;

public class Araba {

    private int id;
    private String isim;

    private EDurum durum;

    public Araba() {
    }

    public Araba(int id, String isim) {
        this.id = id;
        this.isim = isim;
        this.durum = EDurum.GALERIDE;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public EDurum getDurum() {
        return durum;
    }

    public void setDurum(EDurum durum) {
        this.durum = durum;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", durum=" + durum +
                '}';
    }
}
