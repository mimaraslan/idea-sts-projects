package com.mimaraslan.v4;

public class JenerikTipim <T> {

    private T benimNesnem;

    public JenerikTipim(T benimNesnem) {
        this.benimNesnem = benimNesnem;
    }

    public T getBenimNesnem() {
        return benimNesnem;
    }

    public void setBenimNesnem(T benimNesnem) {
        this.benimNesnem = benimNesnem;
    }

    public void sinifinTipiniYazdir(){
        System.out.println("Sınıfın tipi : " + benimNesnem.getClass().getName());
    }
}
