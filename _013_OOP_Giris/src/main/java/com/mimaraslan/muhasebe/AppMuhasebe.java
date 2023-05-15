package com.mimaraslan.muhasebe;

public class AppMuhasebe {

    public static void main(String[] args) {
       MusteriHesap musteriHesap = new MusteriHesap();
      // musteriHesap.setMusteriNo(100);
       System.out.println(musteriHesap.getMusteriNo());

       // musteriHesap.maas = 20000;
        musteriHesap.setMaas(20000);
        System.out.println(musteriHesap.getMaas());


     //   musteriHesap.setEmail("abc");
        System.out.println(musteriHesap.getEmail());

        A aObj = new A();
        aObj.setMusteriNo(888);
        System.out.println(aObj.getMusteriNo());

        B bObj = new B();
        System.out.println(bObj.getMusteriNo());




    }
}
