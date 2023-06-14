package com.mimaraslan.ornek05interrupt;

public class AppMain {

    public static long sayac = 0;

    public static void main(String[] args) {

        long baslangic = System.currentTimeMillis();
        //-------------------------------------------------

        final var mainThread = Thread.currentThread();
        // mainThread.setName("benimIsParcam");

        new Thread(() -> {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            for (int i = 0; i < 100; i++) {
                sayac++;

                System.out.println("Sayac : " + sayac);
                System.out.println("-----------------------");

                mainThread.interrupt();
            }
        }).start();

        //-------------------------------------------------

        for (int i = 100; i > 15; i--) {
            System.out.println("*******************");
            System.out.println("***for döngüsü***** : " + i);
            System.out.println("*******************");
            try {
                Thread.sleep(1);

                System.out.println("Uyuduk sleep. :" + System.currentTimeMillis());

            } catch (InterruptedException e) {
                // throw new RuntimeException(e);
            }
        }
/*
        while (sayac < 50){
            System.out.println("while döngüsü sayac : "+ sayac);
        }
        */
        //-------------------------------------------------
        long bitis = System.currentTimeMillis();

        // 5016   // 3196   // 2811
        System.out.println("Geçen ms : " + (bitis - baslangic));
        System.out.println("Sayac    : " + sayac);

    }
}
