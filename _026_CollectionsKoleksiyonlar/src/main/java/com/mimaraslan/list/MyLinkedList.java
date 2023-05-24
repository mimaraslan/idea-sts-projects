package com.mimaraslan.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {

    public static void main(String[] args) {

        ArrayList <String> list1 = new ArrayList<>();
        //  List <String> list1 = new ArrayList<>();
        list1.add("Mehmet"); // 0
        list1.add("Aysun"); // 1
        list1.add("Osman"); // 2
        list1.set(1, "Aysu");
        System.out.println(list1);

        LinkedList <String> list2 = new LinkedList<>();
      //  List <String> list2 = new LinkedList<>();
        list2.add("Mehmet");
        list2.add("Aysun");
        list2.add("Osman");
        list2.set(1, "Aysu");

        System.out.println(list2);

        list2.addFirst("Orhun");
        list2.addLast("Serkan");
        list2.add("Ahmet");

        Collections.sort(list2);
          for(String str: list2)
             System.out.print(" "+str);

        System.out.println(list2);

        System.out.println("Son kayıt: "+ list2.getLast());


    }
}
