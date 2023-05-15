package com.mimaraslan.ders3;

public class Siparis {

    String pizzaBoyutu;
    float pizzaFiyati; // 75.50

    enum Boyut {
        KUCUK,

        ORTA,

        BUYUK,

        EKSTRA_BUYUK
    }



    public Siparis() {
    }

    public Siparis(String pizzaBoyutu) {
        this.pizzaBoyutu = pizzaBoyutu;
    }

    public Siparis(String pizzaBoyutu, float pizzaFiyati) {
        this.pizzaBoyutu = pizzaBoyutu;
        this.pizzaFiyati = pizzaFiyati;
    }

    public static void main(String[] args) {
        Siparis siparis = new Siparis();
        siparis.pizzaBoyutu = Boyut.ORTA.toString();
        System.out.println(siparis.pizzaBoyutu); // ORTA

        siparis.pizzaBoyutu = Boyut.BUYUK.toString();
        System.out.println(siparis.pizzaBoyutu); // BUYUK


        Siparis siparis2 = new Siparis("Buyuk");
        System.out.println(siparis2.pizzaBoyutu);

        Siparis siparis3 = new Siparis(Boyut.BUYUK.toString());
        System.out.println(siparis3.pizzaBoyutu);
    }
}
