package com.mimaraslan;

public class AppMain {
    public static void main(String[] args) {

       Muhasebe muhasebe = new Muhasebe();

       muhasebe.setAdi("Burak");
       muhasebe.setSoyadi("Delice");
       muhasebe.setMaliYetki(Boolean.TRUE);
       muhasebe.setKidemYili((short) 3);
       muhasebe.setUnvani("Mali Müşavir");

        System.out.println("ADI: "+ muhasebe.getAdi());
        System.out.println("SOYADI:"+muhasebe.getSoyadi());
        System.out.println("Yetki: "+ muhasebe.getMaliYetki());
        System.out.println("Kıdem:"+muhasebe.getKidemYili());
        System.out.println("Ünvan:"+ muhasebe.getUnvani());

        muhasebe.hesapla();
        muhasebe.hesapla(75);
        muhasebe.hesapla(10, 5);
        muhasebe.hesapla(10,  (byte) 5);
        muhasebe.hesapla(10,  (short) 5);

       String gelenCevap = muhasebe.selamVer("Serkan");
        System.out.println(gelenCevap);



    }
}
