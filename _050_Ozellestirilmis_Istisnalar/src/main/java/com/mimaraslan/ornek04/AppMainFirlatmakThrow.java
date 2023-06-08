package com.mimaraslan.ornek04;

public class AppMainFirlatmakThrow {

    public static void main(String[] args) {

        System.out.println("Kümesteki yumurta sayisi");

        int kumesId = -15;
   // v1
/*        if (kumesId<0 || kumesId >100){
            System.out.println("..........Geçersiz Id girildi.........");
        } else {
            System.out.println("Girilen Id: "+  kumesId +  "  Yumurta sayisi: "+ yumurtalariSayUnchecked(kumesId));
        }
*/

        //v2
      //  System.out.println("Girilen Id: "+  kumesId +  "  Yumurta sayisi: "+ yumurtalariSayUnchecked(kumesId));


        //v3
        System.out.println("---Unchecked---------------------try catch blogu istege bagli-----------------");
        try {
            System.out.println("Girilen Id: "+  kumesId +  "  Yumurta sayisi: "+ yumurtalariSayUnchecked(kumesId));
        } catch (Exception e){
            System.err.println("Istisna.....: "+ e);
            e.printStackTrace();
        }


        System.out.println("---Checked-------------------------try catch blogu ŞART!!! ----------------");

        try {
            System.out.println("Girilen Id: "+  kumesId +  "  Yumurta sayisi: "+ yumurtalariSayChecked(kumesId));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    private static int yumurtalariSayUnchecked(int kumesId) {

        if (kumesId<0 || kumesId >100){
            throw new ArithmeticException("Geçersiz Id değeri girildi.");
        } else {
            return 50;
        }
    }

    private static int yumurtalariSayChecked(int kumesId) throws Exception {

        if (kumesId<0 || kumesId >100){
            throw new ArithmeticException("Geçersiz Id değeri girildi.");
        } else {
            return 50;
        }
    }



}
