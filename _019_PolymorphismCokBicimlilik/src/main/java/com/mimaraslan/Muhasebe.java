package com.mimaraslan;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Muhasebe extends Memur {
    private Boolean maliYetki;


    @Override
    public void hesapla(){
        System.out.println("Muhasebe hesapla metodu.");
    }

    @Override
    public void hesapla(int maas) {
        System.out.println("Selamlar maaşım: " +maas);
    }

    public void hesapla(String ortalama){
        System.out.println("Muhasebe ortalama: " + ortalama);
    }

    public void hesapla(int maas, int katSayi){
        System.out.println("Muhasebe maaas: " + maas + katSayi);
    }


    public void hesapla(int katSayi, byte maas){
        System.out.println( maas * katSayi);
    }

    public void hesapla(int katSayi, short maas){
        System.out.println( maas * katSayi);
    }



    public void hesapla(int maas, String katSayi){
        System.out.println("Muhasebe maaas: " + maas);
    }

    public void hesapla(String katSayi, int maas){
        System.out.println("Muhasebe maaas: " + maas);
    }



}
