package com.mimaraslan.ornek02;

import java.util.Scanner;

public class AppMainTryCatchFinally {

    public static void main(String[] args) {

        System.out.println("*******************************************");
        System.out.println("************** OKUL OTOMASYONU ************");
        System.out.println("*******************************************");
        System.out.println();
        System.out.println("1 - Ders olustur.");
        System.out.println("2 - Ogrenci olustur.");
        System.out.println("3 - Ogrenciye ders ekle.");
        System.out.println("0 - Cikis.");


        // FAZLADAN KOD YAZMISIZ....
        // v1
      /*
       try {
            int secim = secimYap();
            System.out.println("SEÇİLEN DEĞER: " + secim);
        }catch (Exception e){
            System.err.println("Istisna: " + e);
        }
        System.out.println("PROGRAM KAPATILDI.");
        */


      //v2
  /*
        int secim = secimYap();
        System.out.println("SEÇİLEN DEĞER: " + secim);
        System.out.println("PROGRAM KAPATILDI.");
*/

        // v3
        System.out.println("SEÇİLEN DEĞER: " + secimYap());
        System.out.println("PROGRAM KAPATILDI.");
    }

    private static int secimYap() {

        Scanner scanner = new Scanner(System.in);;
        int secim = 0;
        boolean tekrarDurumu = false;

        do {

            System.out.println("Seçiminizi yapınız.");

            try {
                secim = scanner.nextInt();

                if (secim < 0 || secim > 3){
                    System.out.println("Lütfen 0   1   2 ya da 3  bu değerlerden birini giriniz.");
                    tekrarDurumu = true;
                } else {
                    tekrarDurumu = false;
                }

            } catch (Exception e){
                System.err.println("Istisna....: " + e);
            } finally {
                scanner.nextLine();
            }

        } while (tekrarDurumu);

        return secim;
    }




}

