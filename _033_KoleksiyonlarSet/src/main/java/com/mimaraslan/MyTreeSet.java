package com.mimaraslan;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {

        /*
        *  SET lerde tekrarlı kayıt yok!
        *  TreeSet ASLA AMA ASLA null DEĞERİ KABUL ETMEZ!!!!
        * */

        Set<String> ogrenciList = new TreeSet<>();
        ogrenciList.add("Abdullah");
        ogrenciList.add("Gizem");
        ogrenciList.add("Ali");
        ogrenciList.add("Burak");
        ogrenciList.add("Aysu");
        ogrenciList.add("Aminenur");
        ogrenciList.add("Ali");
        ogrenciList.add("Ali");
        ogrenciList.add("Ali");
      //  ogrenciList.add(null);
        System.out.println("TreeSet  : "+ ogrenciList);
        System.out.println(ogrenciList.size());

        ogrenciList.remove("Gizem");
        System.out.println("TreeSet  : "+ ogrenciList);

        ogrenciList.clear();
        System.out.println(ogrenciList);

        ogrenciList.remove("Mehmet");
        System.out.println(ogrenciList);

//---------------------------------------------------------
        TreeSet <Integer> sayiList = new TreeSet<>();

        for (int i = 0; i < 10; i++) {

            // KONTROL
            sayiList.add(i*i);
        }
        System.out.println(sayiList);

      /*
        TreeSet <TreeSet<Integer>> nukleerDenemeList = new TreeSet<>();
        nukleerDenemeList.add(sayiList);
        System.out.println(nukleerDenemeList.toString());
        */


        for ( Integer sayi : sayiList) {
            System.out.print (sayi + " ");
        }



    }
}
