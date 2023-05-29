package com.mimaraslan;

import java.util.HashMap;
import java.util.Map;

public class AppMain_Map {
    public static void main(String[] args) {

        Map mapListesi = new HashMap();
                         // key   // value
        mapListesi.put("Ankara", "Türkiye"); // 0
        mapListesi.put("Ottowa", "Kanada"); // 1
        mapListesi.put("Londra", "İngiltere"); // 2
        mapListesi.put("Berlin", "Almanya"); // 3
        mapListesi.put("İstanbul", "Türkiye"); // 4
        System.out.println(mapListesi);

        mapListesi.replace("Londra", "İngiltere", "England");
        System.out.println(mapListesi);

        System.out.println(mapListesi.get("Ankara"));
        System.out.println(mapListesi.get("İstanbul"));

        mapListesi.remove("Londra");
        System.out.println(mapListesi);

        System.out.println(mapListesi.size());
      //  mapListesi.clear();

        System.out.println(mapListesi.size());
        System.out.println(mapListesi);


        // keys
        for (Object sehir  : mapListesi.keySet()) {
            System.out.println(sehir);
        }

        System.out.println("--------------------------");
        //values
        for (Object ulke  : mapListesi.values()) {
            System.out.println(ulke);
        }





    }
}