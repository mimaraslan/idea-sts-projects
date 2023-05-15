package com.mimaraslan;

public class Ornek9 {


    public Ornek9(String adiSoyadi,     int yasi,     Boolean araclariVarMi ) {
        System.out.println("Yapıcı metot.");
    }

    public Ornek9(String adiSoyadi, int yasi) {
        System.out.println("Yapıcı metot.");
    }

    public Ornek9(String adiSoyadi,     int boyu,    int kilo) {
        System.out.println("Yapıcı metot.");
    }

    public Ornek9(String adiSoyadi) {
        System.out.println("Yapıcı metot.");
    }


    private static String yaz() {
        System.out.println("Baban kalma sıradan bir metot.");
        return "SELAM";
    }

    private static String yaz(int adet) {
        System.out.println("Baban kalma sıradan bir metot.");
        return "SELAM";
    }

    private static String yaz(int ucret, int masraf) {
        System.out.println("BJK");
        return "SELAM";
    }

    private static double yaz(int ucret, Integer masraf) {
        System.out.println("BJK");
        return 1.0;
    }

    private static String yaz(short masraf, int ucret) {
        System.out.println("GS");
        return "SELAM";
    }


    private static boolean yaz(int ucret, short masraf) {
        System.out.println("FB.");
        return true;
    }

    public static void main(String[] args) {


        System.out.println("main metot.");
        String cevap = yaz();
        System.out.println(cevap);

        yaz();
        yaz(1, 1);
        yaz(1,(short) 1);

   //     VARLIK         YOKLUK
    //     new    -----   null
        Ornek9 nesne1 = new Ornek9("Gizem");

        Ornek9 nesne2 = new Ornek9("Gizem");

         short a = 32756;
         short b = 10000;
         int c = a + b ;

        byte a2 = 1;
        byte b2 = 1;
        int c2 = a2 + b2 ;

        int c3 = a + a2;


    }



}
