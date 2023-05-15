package com.mimaraslan.ornekler;

public class MethotCagilariHesap {
    public static void main(String[] args) {
        hesapla();
    }

    private static void hesapla() {
       int cevre = diktortgenCevre(2, 2);
       int alan = diktortgenAlani(2, 8);

        System.out.println("ÇEVRESİ: " + cevre);
        System.out.println("ALANI  : " + alan);
    }

    private static int diktortgenAlani(int kisaKenar, int uzunKenar) {
        return kisaKenar*uzunKenar;
    }

    private static int diktortgenCevre(int kisaKenar, int uzunKenar) {
        return 2*(kisaKenar+uzunKenar);
    }


}
