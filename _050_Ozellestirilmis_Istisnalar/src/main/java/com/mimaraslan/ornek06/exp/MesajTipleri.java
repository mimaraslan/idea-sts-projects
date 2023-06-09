package com.mimaraslan.ornek06.exp;

public enum MesajTipleri {

    ARANAN_BULUNAMADI (100, "Aranan bulunamadı."),
    EKLEME_YAPILAMADI (200, "Ekleme yapılamadı."),
    EKLEME_YAPILAMADI2 (201, "Ekleme 2 bulunamadı."),
    EKLEME_YAPILAMADI3 (202, "Ekleme 3  bulunamadı."),
    EKLEME_YAPILAMADI4 (203, "Ekleme 4 bulunamadı."),
    GUNECELLEME_YAPILAMADI (601, "Günecelle yapılamadı."),
    GUNCELLEME_YAPILAMADI2 (602, "Günecelle 2 bulunamadı.");


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
