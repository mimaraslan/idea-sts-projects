package com.mimaraslan.ornekler;

public class MethotParametreleri {

    private static int kelimeUzunluguSay(String kelime) {
        return kelime.length();
    }

    private static int kelimeUzunluguSay(String kelime, char durum){

        if (durum == 'Z'){
            return 0;
        } else if (durum == 'A'){
            System.out.println(kelime.toUpperCase().trim());
            return kelime.toUpperCase().trim().length();
        } else {
            System.out.println(kelime.trim());
            return kelime.length();
        }
    }

    public static void main(String[] args) {
      int sonuc =  kelimeUzunluguSay(" Ahmet ");
        System.out.println(sonuc); // 7

        sonuc = kelimeUzunluguSay("Ahmet", 'Z');
        System.out.println(sonuc);

    }



}
