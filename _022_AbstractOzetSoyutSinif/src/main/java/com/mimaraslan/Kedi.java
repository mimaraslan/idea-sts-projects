package com.mimaraslan;

public class Kedi extends Hayvan {

    @Override
    public void yemekYe(){
        System.out.println("Kedi sınıfındaki yemek yeme normal metodu. EZME");
    }

    @Override
    public void sesVer() {
        System.out.println("Miyav miyav - abstract metod");
    }

    @Override
    public void hareketEt() {

    }

    @Override
    public void bilgisiniGetir() {

    }
}
