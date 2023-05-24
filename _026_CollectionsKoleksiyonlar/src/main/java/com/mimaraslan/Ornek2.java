package com.mimaraslan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Ornek2 {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(15);
        list1.add(32);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(40);

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);

        //  0    1   2   3
        // [15, 32, 10, 40]
        System.out.println(list3.get(2));
        list3.set(2, 99);
        System.out.println(list3.get(2));



    }
}
