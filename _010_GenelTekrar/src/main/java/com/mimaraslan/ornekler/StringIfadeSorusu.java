package com.mimaraslan.ornekler;

public class StringIfadeSorusu {
    public static void main(String[] args) {

        String ifade1 = "SELAM";
            int sayi1 = 10;

        System.out.println( 2 + sayi1 + ifade1 ); // 12SELAM
        System.out.println( ifade1 + 2 + sayi1); // SELAM210
        System.out.println( ifade1 + (2 + sayi1)); // SELAM12



    }
}
