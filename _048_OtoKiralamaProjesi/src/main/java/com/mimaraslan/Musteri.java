package com.mimaraslan;


import java.util.ArrayList;
import java.util.List;

public class Musteri extends Kisi {

private List<Araba> kiralananArabalar;

    public Musteri(int id, String isim) {
        super(id, isim);
        this.kiralananArabalar = new ArrayList<>();
    }

    public List<Araba> getKiralananArabalar() {
        return kiralananArabalar;
    }

    public void setKiralananArabalar(List<Araba> kiralananArabalar) {
        this.kiralananArabalar = kiralananArabalar;
    }

    @Override
    public String toString() {
        return "Musteri{ " +
                " id : " + super.getId() +
                " isim : "  + super.getIsim() +
                " kiralananArabalar: " + kiralananArabalar +
                "} ";
    }
}
