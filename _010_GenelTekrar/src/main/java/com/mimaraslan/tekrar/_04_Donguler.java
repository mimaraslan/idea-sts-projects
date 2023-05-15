package com.mimaraslan.tekrar;

import java.util.Scanner;

public class _04_Donguler {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


        int i = 0;
        while (i < 10) {
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        int secim = 0;
/*
        while (secim != 0 ){
            System.out.print ("Çıkış için 0 değerine basınız. :   ");
            secim = scanner.nextInt();
        }
*/


        do {
            System.out.print ("Çıkış için 0 değerine basınız. :   ");
            secim = scanner.nextInt();
        } while (secim != 0);


    }
}
