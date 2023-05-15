package com.mimaraslan.veteriner;

public class AppVeteriner {

    public static void main(String[] args) {

        Kedi kedi = new Kedi();
        kedi.hayvanSesVer();

        Kopek kopek = new Kopek();
        kopek.hayvanSesVer();

        Kus kus = new Kus();
        kus.hayvanSesVer();
        kus.rapor();

    }
}
