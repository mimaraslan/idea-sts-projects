package com.mimaraslan.ders2;

public class Ornek4 {

    enum Boyut {
        KUCUK, ORTA, BUYUK, EKSTRA_BUYUK
    }

    String pizzaBoyutu;

    public static void main(String[] args) {
      Ornek4 siparis = new Ornek4();
      siparis.pizzaBoyutu = Boyut.ORTA.toString();
        System.out.println(siparis.pizzaBoyutu); // ORTA

      siparis.pizzaBoyutu = Boyut.BUYUK.toString();
        System.out.println(siparis.pizzaBoyutu); // BUYUK
    }
}
