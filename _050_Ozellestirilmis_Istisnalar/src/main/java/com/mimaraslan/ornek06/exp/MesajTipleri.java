package com.mimaraslan.ornek06.exp;

public enum MesajTipleri {

    ARANAN_BULUNAMADI (100, "Aranan bulunamadı."),

    EKLEME_YAPILAMADI (200, "Ekleme yapılamadı."),
    EKLEME_YAPILAMADI2 (201, "Dosya bulunamadı."),
    EKLEME_YAPILAMADI3 (202, "Dosya bulunamadı."),
    EKLEME_YAPILAMADI4 (203, "Dosya bulunamadı."),
    EKLEME_YAPILAMADI5 (204, "Dosya bulunamadı."),

    GUNCELLEME_YAPILAMADI (300, "Dosya bulunamadı.");


    int istisnaKodu;
    String mesaj;

    MesajTipleri(int istisnaKodu, String mesaj) {
        System.out.println();
    }

    public int getIstisnaKodu() {
        return istisnaKodu;
    }

    public String getMesaj() {
        return mesaj;
    }
}
