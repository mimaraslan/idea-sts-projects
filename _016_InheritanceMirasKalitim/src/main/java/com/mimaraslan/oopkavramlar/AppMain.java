package com.mimaraslan.oopkavramlar;

public class AppMain {

    public static void main(String[] args) {

        // Object
        Calisan calisan = new Calisan();

        System.out.println(calisan);

        System.out.println(calisan.getMaasSonDurumu(20000, 5000));


        System.out.println(calisan.getMaasSonDurumu(20000, 5000, 300));


    }
}
