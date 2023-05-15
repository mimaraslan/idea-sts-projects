package com.mimaraslan.ornekler;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ConsoleMenu {

    private static void menuyuGetir() {
        System.out.println("Bir seçim yapınız.");
        System.out.println("Secim 1");
        System.out.println("Secim 2");
        System.out.println("Secim 3");
        System.out.println("Cikis için 9");
        akisiGetir();
    }

    private static void akisiGetir() {

        Scanner myInput = new Scanner(System.in);
        String secim = myInput.nextLine();

        switch (secim) {
            case "1":
                System.out.println("Girilen değer 1");
               // selamVer ("Selamlar", -10);
                break;
            case "2":
                System.out.println("Girilen değer 2");
                break;
            case "3":
                System.out.println("Girilen değer 3");
                break;
            case "9":
                System.out.println("Girilen değer 9 ve ÇIKIŞ");
                System.exit(0);
                break;
            default:
                System.out.println("Olumsuz.");
                break;
        }
    }

    private static void selamVer(String selamlar, int i) {

        if(i > 0)
        {
            System.out.println(selamlar + "sayı BÜYÜK");
        }else{
            System.out.println(selamlar + " sayı KÜÇÜK");
        }

    }


    public static void main(String[] args) {
        menuyuGetir();
    }


}
