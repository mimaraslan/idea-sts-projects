package com.mimaraslan.ornek01;

import java.util.Scanner;

public class AppMainTryCatch {

    public static void main(String[] args) {

        int sayi1 = 0;
        int sayi2 = 0;
        int toplam = 0;
        int bolme = 0;
/*   // v1
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Sayıyı giriniz.");
        sayi1 = scanner.nextInt();

        System.out.println("2. Sayıyı giriniz.");
        sayi2 = scanner.nextInt();

        toplam = sayi1 + sayi2;
        System.out.println("TOPLAM.........: " + toplam );

        bolme = sayi1 / sayi2;
        System.out.println("BÖLME.........: " + bolme );

        // InputMismatchException
        // ArithmeticException
 */


        /*
        //v2
         try{
             Scanner scanner = new Scanner(System.in);

             System.out.println("1. Sayıyı giriniz.");
             sayi1 = scanner.nextInt();

             System.out.println("2. Sayıyı giriniz.");
             sayi2 = scanner.nextInt();

             toplam = sayi1 + sayi2;
             System.out.println("TOPLAM.........: " + toplam );

             bolme = sayi1 / sayi2;
             System.out.println("BÖLME.........: " + bolme );
         }catch (Exception e){
             System.out.println("Istisna: "+ e.toString());
         }
*/

         //v3

        boolean exceptionFlagStatus = false;

         do{
             try{
                 Scanner scanner = new Scanner(System.in);

                 System.out.println("1. Sayıyı giriniz.");
                 sayi1 = scanner.nextInt();

                 System.out.println("2. Sayıyı giriniz.");
                 sayi2 = scanner.nextInt();

                 toplam = sayi1 + sayi2;
                 System.out.println("TOPLAM.........: " + toplam );

                 bolme = sayi1 / sayi2;
                 System.out.println("BÖLME.........: " + bolme );

                 exceptionFlagStatus = false;
             }catch (Exception e){
                 System.out.println("Istisna: "+ e.toString());
                 exceptionFlagStatus = true;
             } finally {
                 System.out.println("-------------------------");
             }

         } while (exceptionFlagStatus);

        System.out.println("UYGULAMA SONLANDIRILDI.");

    }

}

