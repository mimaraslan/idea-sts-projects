package com.mimaraslan;

public class Ornek5 {

    int siraNo; // 0
    String adiSoyadi; // null


    //Overloading
    public Ornek5() {
        System.out.println("Constructor - Hazırlayıcı, Yapıcı PARAMETRESİZ çağırıldı.");
        this.siraNo = 10;
        this.adiSoyadi = "Osman Onur Baş";
    }

    public Ornek5(String adiSoyadi, int siraNo) {
        System.out.println("Constructor - Hazırlayıcı, Yapıcı PARAMETRELİ çağırıldı.");
        this.siraNo = siraNo;
        this.adiSoyadi = adiSoyadi;
    }

    public Ornek5(int siraNo, String adiSoyadi) {
        System.out.println("Constructor - Hazırlayıcı, Yapıcı PARAMETRELİ çağırıldı.");
        this.siraNo = siraNo;
        this.adiSoyadi = adiSoyadi;
    }

    public Ornek5(String adiSoyadi) {
        System.out.println("Constructor - Hazırlayıcı, Yapıcı 1 PARAMETRELİ adiSoyadi çağırıldı.");
        this.adiSoyadi = adiSoyadi;
    }



    public static void main(String[] args) {

        Ornek5 obj1 = new Ornek5();
        System.out.println(obj1.siraNo + " " + obj1.adiSoyadi);
/*
        obj.siraNo = 10;
        obj.adi = "Osman";
*/
  //      System.out.println(obj.siraNo + " " + obj.adi);

        Ornek5 obj2 = new Ornek5("Burak Delice", 88);
        System.out.println(obj2.siraNo + " " + obj2.adiSoyadi);

        Ornek5 obj3 = new Ornek5( 92, "Ünal Gani Berk");
        System.out.println(obj3.siraNo + " " + obj3.adiSoyadi);

        Ornek5 obj4 = new Ornek5("Gizem Kuşçuoğlu");
        System.out.println(obj4.siraNo + " " + obj4.adiSoyadi);




    }
}
