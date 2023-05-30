package com.mimaraslan.v2;

import java.util.ArrayList;

public class ListManager <T> {

    private ArrayList <T>  benimListem = new ArrayList<>();

    public void lisyeEkle(T eklenecekSey){
        this.benimListem.add(eklenecekSey);
    }

    public   ArrayList <T>  listeyiGetir(){
        return this.benimListem;
    }

}
