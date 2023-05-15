package com.mimaraslan.veteriner;

public class Kedi extends EvcilHayvan {
    @Override
    void hayvanSesVer() {
        System.out.println("Miyav miyav");
    }
    @Override
    void yazdir(){
        System.out.println("Kedi sınıfı");
    }

    @Override
    void rapor() {

    }

    @Override
    String chipKontrolEt(boolean chipDurumu) {
        return null;
    }


}
