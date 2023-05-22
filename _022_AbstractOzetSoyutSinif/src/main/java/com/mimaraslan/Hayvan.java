package com.mimaraslan;

public abstract class Hayvan {

    public          void yemekYe(){
       System.out.println("Hayvan sınıfındaki yemek yeme normal metodudur.");
    }

    public abstract void sesVer();

    public abstract void hareketEt();

    public abstract void bilgisiniGetir();

}
