package com.mimaraslan.lambda02;

public class ParametresizGeriDonusTipiOrnegi {

    public static void main(String[] args) {
        Sekil sekil1 = new Sekil() {
            @Override
            public String dikdortgen() {
                return "Selam dikdörtgen metodu";
            }
        };
        System.out.println(sekil1.dikdortgen());



        Sekil sekil2 = () -> "Merhaba dikdörtgen metodu";
        System.out.println(sekil2.dikdortgen());
    }
}
