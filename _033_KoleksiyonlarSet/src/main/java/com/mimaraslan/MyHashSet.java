package com.mimaraslan;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet {
    public static void main(String[] args) {

        /*
        *  SET lerde tekrarlı kayıt yok!
        *
        * */

        Set<String> ogrenciList = new HashSet<>();
        ogrenciList.add("Abdullah");
        ogrenciList.add("Gizem");
        ogrenciList.add("Ali");
        ogrenciList.add("Burak");
        ogrenciList.add("Aysu");
        ogrenciList.add("Aminenur");
        ogrenciList.add("Ali");
        ogrenciList.add("Ali");
        ogrenciList.add("Ali");
        ogrenciList.add(null);
        System.out.println("HashSet  : "+ ogrenciList);
        System.out.println(ogrenciList.size());

        ogrenciList.remove("Gizem");
        System.out.println("HashSet  : "+ ogrenciList);

        ogrenciList.clear();
        System.out.println(ogrenciList);

        ogrenciList.remove("Mehmet");
        System.out.println(ogrenciList);



    }
}
