package com.mimaraslan.model.singleton.v1pojo;

public class Urun {

    private Long id;
    private String adi;
    private Double fiyati;


    public Urun() {
    }

    public Urun(Long id, String adi, Double fiyati) {
        this.id = id;
        this.adi = adi;
        this.fiyati = fiyati;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Double getFiyati() {
        return fiyati;
    }

    public void setFiyati(Double fiyati) {
        this.fiyati = fiyati;
    }
}
