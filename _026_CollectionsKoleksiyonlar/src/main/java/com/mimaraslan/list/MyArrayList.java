package com.mimaraslan.list;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<String>  list2 = new ArrayList<>();

        list1.add(10); // index 0
        list1.add(25); // index 1

        list2.add("Ahmet"); // index 0
        list2.add("Osman"); // index 1
        list2.add("Gizem"); // index 2

        System.out.println("Elemanları liste 1 : " + list1);
        System.out.println("Elemanları liste 2 : " + list2);

        System.out.println("Arama 1 : " + list1.contains(55));
        System.out.println("Arama 2 : " + list2.contains("Osman"));


        List<String>  list3 = new ArrayList<>();
        list3.add("Ahmet"); // index 0
        list3.add("Osman"); // index 1
        list3.add("Gizem"); // index 2
        list3.add("Caner"); // index 3

        System.out.println("Eşitlik liste durumu : " + list2.equals(list3));

        System.out.println("Arama 3 : " + list3.containsAll(list2));

        System.out.println("Liste boyutu: " + list3.size());

        System.out.println("Liste dolu mu?: " + !list3.isEmpty());

      //  list3.clear();
      //  System.out.println("Sıfırlama boşaltma sonrası liste boyutu: " + list3.size());
/*
        System.out.println(list3.get(0));
        list3.remove(0);
        System.out.println(list3.get(0));
*/
        list3.add("Orhun");
        list3.add("Aysu");
        list3.add("Unal");
        list3.add("Serkan");

        System.out.println(list3);

        System.out.println("Liste 2: " + list2);
        System.out.println("Liste 3: " + list3);

        list3.removeAll(list2);
        System.out.println("Liste farkları: " + list3);

        System.out.println("Hash code: "+list3.hashCode());

    }



}
