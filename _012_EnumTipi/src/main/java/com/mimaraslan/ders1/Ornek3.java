package com.mimaraslan.ders1;

public class Ornek3 {

    enum Meslek {
        MUHENDIS,

        DOKTOR,

        OGRETMEN,

        HALK_OZANI
    }

    public static void main(String[] args) {

        String unvan = "Dr."; // Dr DR Dr. DR.
        System.out.println(unvan); // Dr.
/*
        Meslek meslek = Meslek.DOKTOR;
        System.out.println(meslek);

        System.out.println(Meslek.MUHENDIS + " " + Meslek.OGRETMEN);
*/

        unvan = Meslek.DOKTOR.toString();
        System.out.println(unvan); // DOKTOR

        unvan = "Müh.";
        System.out.println(unvan);

        unvan = Meslek.MUHENDIS.toString();
        System.out.println(unvan);


    }

}
