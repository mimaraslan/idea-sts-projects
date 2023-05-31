package com.mimaraslan.lambda03;

public class BirParametreliOrnek {

    public static void main(String[] args) {

        MeyveSuyu meyveSuyu = new MeyveSuyu() {
            @Override
            public String getAroma(String meyveAdi) {
                return "Bilgi:" + meyveAdi;
            }

        };
        System.out.println(meyveSuyu.getAroma("Armut"));

                         // parametreler -> return sonuc
        MeyveSuyu meyveSuyu2 = meyveAdi -> "Bilgi: " + meyveAdi;
        System.out.println(meyveSuyu2.getAroma("Elma"));




    }
}
