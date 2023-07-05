package com.mimaraslan.model.singleton.v2singleton;

public class AppMain {
    public static void main(String[] args) {

        /*
        Urun urun1 = new Urun();
        urun1.setId(1L);
        urun1.setAdi("Kolonya");
        urun1.setFiyati(10.3);

        Urun urun2 = new Urun(2L, "Patates", 2.7);

        System.out.println(urun1);
        System.out.println(urun2);

        urun1 = new Urun();
        urun1.setId(3L);
        urun1.setAdi("Karpuz");
        urun1.setFiyati(4.2);
        System.out.println(urun1);

        urun2 = new Urun(4L, "Kavun", 3.3);
        System.out.println(urun2);


        Urun urun = new Urun(1L, "Patates", 2.7);
        System.out.println(urun);

        urun = new Urun(2L, "Domates", 3.2);
        System.out.println(urun);

        urun = new Urun(3L, "Kavun", 4.23);
        System.out.println(urun);

        urun = new Urun(4L, "Karpuz", 6.12);
        System.out.println(urun);

        for (long i = 0; i <10_000 ; i++) {
            urun = new Urun(i, "Abc"+i, (double) (8+i));
            System.out.println(urun);
        }
        */

        Urun urun = Urun.getInstance();
        urun.setAdi("Elma");
        System.out.println(urun);


        urun = Urun.getInstance();
        System.out.println(urun);

        for (long i = 0; i <10_000 ; i++) {
            urun =  Urun.getInstance();
            System.out.println(urun);
        }
    }
}