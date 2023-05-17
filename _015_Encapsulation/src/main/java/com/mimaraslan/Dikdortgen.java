package com.mimaraslan;

public class Dikdortgen {

    private int uzunKenar ; //10
    private int kisaKenar; // 3

    // Hazırlık
    public Dikdortgen(int uzunKenar, int kisaKenar) {
        this.uzunKenar = uzunKenar; // 10
        this.kisaKenar = kisaKenar; // 3
    }


    public int getHesaplaAlan(){
       /*
         int sonuc = this.uzunKenar*this.kisaKenar;
        return sonuc;
        */

        return uzunKenar*kisaKenar; // 10 * 3
    }

    public int getHesaplaCevre(){
      //  int sonuc = 2*(this.uzunKenar+this.kisaKenar);
      // return sonuc;
        return  2*(uzunKenar+kisaKenar);

    }

}
