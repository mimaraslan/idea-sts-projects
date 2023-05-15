package com.mimaraslan.ders1;

public class Ornek2 {
    enum HaftaninGunleri {
        PAZARTESİ(), SALI() , ÇARŞAMBA(), PERŞEMBE(), CUMA(5), CUMARTESİ ("Spor"), PAZAR ("Tatil");

        String mesaj;
        HaftaninGunleri() {
         //   System.out.println("Varsayılan -  parametresiz");
        }

        HaftaninGunleri(String mesaj) {
            this.mesaj = mesaj;
         //   System.out.println("Parametreli : " + mesaj);
        }


        HaftaninGunleri(int mesaj) {
            this.mesaj = Integer.toString(mesaj);
        }
    }

    public static void main(String[] args) {

        for ( HaftaninGunleri gun : HaftaninGunleri.values() ) {
            if(gun.mesaj != null) {
                System.out.println(  gun + " " + gun.mesaj);
            }
        }



    }
}
