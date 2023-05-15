package com.mimaraslan.veteriner;

public abstract class EvcilHayvan {

    abstract void hayvanSesVer();

    abstract void yazdir();

    void rapor (){
        System.out.println("RAPOR METODU");
    }

    String chipKontrolEt (boolean chipDurumu){
        return "Mesaj";
    };

}
