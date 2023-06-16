package com.mimaraslan.model.factory.v1pojo;

public class Ucak extends Tasima{

    public Ucak() {
        super(TasimaTipi.HAVA);
        hazirlikIslemleriniYap();
    }

    @Override
    protected void hazirlikIslemleriniYap() {
        System.out.println("Gemi hazir.");
    }

}
