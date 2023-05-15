package com.mimaraslan.ders1;

public class Ornek1 {

    enum HaftaninGunleri {
        PAZARTESİ, SALI, ÇARŞAMBA, PERŞEMBE, CUMA, CUMARTESİ, PAZAR
    }


    public static void main(String[] args) {

     //   final String GUN1 = "Pazartesi";
        // .......
    //    String gun7 = "Pazar";
      //  gun1 = "Pzt.";

        HaftaninGunleri gunDegeri = HaftaninGunleri.SALI;
        System.out.println(gunDegeri);


       // Sl Sal Sali Salı SALI Salli


        for ( HaftaninGunleri gun : HaftaninGunleri.values() ) {
            System.out.print (gun + " ");
        }

    }
}
