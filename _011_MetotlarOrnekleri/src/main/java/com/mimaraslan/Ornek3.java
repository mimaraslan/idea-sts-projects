package com.mimaraslan;

public class Ornek3 {

    // DEGISKENLER
    // HAZIRLAYIC METOTLAR
    // NORMAL METOTLAR

    public Ornek3() {
        System.out.println("Constructor - Hazırlayıcı, Yapıcı");
    }


    public int selamVer() {
        System.out.println("Sıradan bir metot.");
        return 25;
    }

    public static void main(String[] args) {

        Ornek3 obj = new Ornek3();
        obj.selamVer();

        System.out.println("main metodu");

    }


}
