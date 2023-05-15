package com.mimaraslan.staticmetot;

public class MyApp {

   /*
    private static void ekranaSelamYaz() {
        System.out.println("Selam");
    }

    private static void ekranaSelamYaz(String adi) {
        System.out.println("Selam " + adi);
    }

    private static void ekranaSelamYaz(String adi, String soyadi) {
        System.out.println("Selam " + adi + " " + soyadi);
    }
    */


/*
    public static void ekranaSelamYaz() {
        System.out.println("Selam");
    }

    public static void ekranaSelamYaz(String adi) {
        System.out.println("Selam " + adi);
    }

    public static void ekranaSelamYaz(String adi, String soyadi) {
        System.out.println("Selam " + adi + " " + soyadi);
    }
    */

    public void ekranaSelamYaz() {
        System.out.println("Selam");
    }

    public void ekranaSelamYaz(String adi) {
        System.out.println("Selam " + adi);
    }

    public void ekranaSelamYaz(String adi, String soyadi) {
        System.out.println("Selam " + adi + " " + soyadi);
    }


    public static void main(String[] args) {

        //Overloading
 /*
        ekranaSelamYaz();
        ekranaSelamYaz("Ahmet");
        ekranaSelamYaz("Ahmet", "Akkoyun");
*/

        MyApp obj = new MyApp();
        obj.ekranaSelamYaz();
        obj.ekranaSelamYaz("Ahmet");
        obj.ekranaSelamYaz("Ahmet", "Akkoyun");


    }


}
