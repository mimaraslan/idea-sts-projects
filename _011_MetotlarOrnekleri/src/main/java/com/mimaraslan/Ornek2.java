package com.mimaraslan;

import java.util.Scanner;

public class Ornek2 {

    static int siraNo = 5;
    static String adi = new String("Ali");
    static Scanner scanner = new Scanner(System.in);


    private static void veriAl() {
        System.out.print("Numrayı giriniz. : ");
        siraNo = scanner.nextInt(); // 10

        System.out.print("\nAdi giriniz. : ");
        adi = scanner.next(); // Ahmet
    }

    private static void goster() {
        System.out.println("\ngoster() ----->  ADI: " + adi + "  NO: "+ siraNo);
    }



    public static void main(String[] args) {

        System.out.println("\nmain ÖNCE ----->  ADI: " + adi + "  NO: "+ siraNo);

        veriAl();
        goster();

        System.out.println("\n main SONRA -----> ADI: " + adi + "  NO: "+ siraNo);

    }


}
