package com.mimaraslan.veteriner;

public class Kopek extends EvcilHayvan{
    @Override
    void hayvanSesVer() {
        System.out.println("Hav hav");
    }

    @Override
    void yazdir(){
        System.out.println("Köpek sınıfı");
    }

    @Override
    String chipKontrolEt(boolean chipDurumu) {
        return null;
    }

}
