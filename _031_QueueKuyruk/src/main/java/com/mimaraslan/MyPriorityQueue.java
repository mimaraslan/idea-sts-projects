package com.mimaraslan;

import java.util.PriorityQueue;

public class MyPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> sayilarKuyrugu = new PriorityQueue<>(10);
          sayilarKuyrugu.add(Integer.valueOf(10));
          sayilarKuyrugu.add(25);
          sayilarKuyrugu.add(Integer.valueOf("2400"));
        System.out.println(sayilarKuyrugu);

/*
        Integer okunanSayi = sayilarKuyrugu.remove();
        System.out.println("\n1. Durum OKUNAN SAYI: " + okunanSayi);
        System.out.println(sayilarKuyrugu);

        okunanSayi = sayilarKuyrugu.remove();
        System.out.println("\n2. Durum OKUNAN SAYI: " + okunanSayi);
        System.out.println(sayilarKuyrugu);

        okunanSayi = sayilarKuyrugu.remove();
        System.out.println("\n3. Durum OKUNAN SAYI: " + okunanSayi);
        System.out.println(sayilarKuyrugu);
*/
        elemanlariKuruktanCikar(sayilarKuyrugu);
        elemanlariKuruktanCikar(sayilarKuyrugu);
        elemanlariKuruktanCikar(sayilarKuyrugu);
    }

    private static void elemanlariKuruktanCikar(PriorityQueue<Integer> sayilarKuyrugu) {
        System.out.println("\nDurum OKUNAN SAYI: " + sayilarKuyrugu.remove());
        System.out.println(sayilarKuyrugu);
    }
}
