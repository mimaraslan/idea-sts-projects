package com.mimaraslan.methods;

import java.util.Arrays;

public class StreamMetotRandomSayi {

    public static void main(String[] args) {


        int [] sayiDizisi = {10, 85, 22, 44, 33};
 //       int [] sayiDizisi = new int[5];
 //       Arrays.fill(sayiDizisi, 10);
        System.out.println(Arrays.toString(sayiDizisi));
        Arrays.parallelSort(sayiDizisi);
        System.out.println(Arrays.toString(sayiDizisi));

        Arrays.stream(sayiDizisi)
                .forEach( eleman -> System.out.print (eleman + " ") );


        /*
        for ( int eleman: sayiDizisi) {
            System.out.print(eleman + " ");
        }
        */

        System.out.println("\n------------------------");
        int toplam = Arrays.stream(sayiDizisi)
                .map(i -> (int) (Math.random()*10))
                .sum();
        System.out.println("TOPLAM:"+ toplam);




    }
}
