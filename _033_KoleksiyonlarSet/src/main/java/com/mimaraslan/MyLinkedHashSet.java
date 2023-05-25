package com.mimaraslan;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MyLinkedHashSet {
    public static void main(String[] args) {

        /*
        *  SET lerde tekrarlı kayıt yok!
        *  İçeriye girilen kayıtları sıralı tutar.
        * */

        Set<String> ogrenciList = new LinkedHashSet<>();
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
        System.out.println("LinkedHashSet  : "+ ogrenciList);
        System.out.println(ogrenciList.size());

        if (ogrenciList.isEmpty())
            System.out.println("Liste boştur");
        else
            System.out.println("Liste dolu");

        ogrenciList.remove("Gizem");
        System.out.println("LinkedHashSet  : "+ ogrenciList);

        ogrenciList.clear();
        System.out.println(ogrenciList);

        ogrenciList.remove("Mehmet");
        System.out.println(ogrenciList);

        if (ogrenciList.isEmpty())
            System.out.println("Liste boştur");
        else
            System.out.println("Liste dolu");



    }
}
