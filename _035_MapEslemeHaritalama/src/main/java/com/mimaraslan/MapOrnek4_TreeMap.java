package com.mimaraslan;

import java.util.TreeMap;

public class MapOrnek4_TreeMap {

    public static void main(String[] args) {

       //   Map <String, String> plakaListesi = new TreeMap<>();
        TreeMap <String, String> plakaListesi = new TreeMap<>();
        plakaListesi.put("Ankara", "06");
        plakaListesi.put("İzmir", "35");
        plakaListesi.put("Nevşehir", "50");
        plakaListesi.put("Yozgat", "66");
        plakaListesi.put("Adana", "01");
        plakaListesi.put("Konya", "42");
        plakaListesi.put("Kocaeli", null);
        System.out.println(plakaListesi);


        String sehirAdi = null; //"Gaziantep";
        String plakasi = "27";

        if(sehirAdi != null) plakaListesi.put(sehirAdi, plakasi);

        System.out.println(plakaListesi);



        for (  String anahtar : plakaListesi.keySet()) {
            System.out.println( "Şehirlerin plaka numaları :  " + anahtar + "  " + plakaListesi.get(anahtar));
        }



    }
}
