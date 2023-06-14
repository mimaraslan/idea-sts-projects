package com.mimaraslan.ornek01miras;

class BasitSinif extends Thread {

    @Override
    public void run() {
        System.out.println("Thread çalışıyor."+ Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("extends : " + i);
        }
    }
}


public class AppMain {

    public static void main(String[] args) {
    BasitSinif basitSinif = new BasitSinif();

    System.out.println("Thread başlıyor.");

    basitSinif.start();

    }
}