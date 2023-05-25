package com.mimaraslan;

import java.util.*;

public class AppMain {

    public static void main(String[] args) {

        List<String> ogrenciList = new ArrayList<>();
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
        System.out.println("ArrayList: " + ogrenciList);

        Set <String> ogrenciList2 = new HashSet<>();
        ogrenciList2.add("Abdullah");
        ogrenciList2.add("Gizem");
        ogrenciList2.add("Ali");
        ogrenciList2.add("Burak");
        ogrenciList2.add("Aysu");
        ogrenciList2.add("Aminenur");
        ogrenciList2.add("Ali");
        ogrenciList2.add("Ali");
        ogrenciList2.add("Ali");
        ogrenciList2.add(null);
        System.out.println("HashSet  : "+ ogrenciList2);

        Set <String> ogrenciList3 = new TreeSet<>();
        ogrenciList3.add("Abdullah");
        ogrenciList3.add("Gizem");
        ogrenciList3.add("Ali");
        ogrenciList3.add("Burak");
        ogrenciList3.add("Aysu");
        ogrenciList3.add("Aminenur");
        ogrenciList3.add("Ali");
        ogrenciList3.add("Ali");
        ogrenciList3.add("Ali");
       // ogrenciList3.add(null);  // null KABUL ETMEZ!!!!
        System.out.println("TreeSet  : "+  ogrenciList3);


        Set <String> ogrenciList4 = new LinkedHashSet<>();
        ogrenciList4.add("Abdullah");
        ogrenciList4.add("Gizem");
        ogrenciList4.add("Ali");
        ogrenciList4.add("Burak");
        ogrenciList4.add("Aysu");
        ogrenciList4.add("Aminenur");
        ogrenciList4.add("Ali");
        ogrenciList4.add("Ali");
        ogrenciList4.add("Ali");
        ogrenciList4.add(null);
        System.out.println("LinkedHashSet  : "+ ogrenciList4);



    }
}
