package com.mimaraslan.model.singleton.v3singletoneager;

public class Urun {
    private static Urun nesne = new Urun();
    private Long id;
    private String adi;
    private Double fiyati;

    private Urun() {
    }
    private Urun(Long id, String adi, Double fiyati) {
        this.id = id;
        this.adi = adi;
        this.fiyati = fiyati;
    }

     // Urun icin Singleton nesne kontrolu yapilacak.
    public static Urun getInstance(){
      //  if (nesne == null)
      //      nesne = new Urun();
        return nesne;
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
