package com.mimaraslan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class AppMain {

    public static void main(String[] args) {
        Vector vectorList = new Vector(2, 50);
        vectorList.add(10);
        vectorList.add("Aysu");
        vectorList.add(12.4);
        vectorList.add(null);
        vectorList.add("Burak");
        System.out.println(vectorList);
        System.out.println(vectorList.size());
        System.out.println(vectorList.get(2));
        System.out.println(vectorList.firstElement());
        System.out.println(vectorList.lastElement());
        System.out.println(vectorList.capacity());
        System.out.println(vectorList.isEmpty());
        System.out.println(vectorList.subList(2,3));



        List arrayList = new ArrayList(100);
        arrayList.add(10);
        arrayList.add("Aysu");
        arrayList.add(12.4);
        arrayList.add(null);
        System.out.println(arrayList);

        List linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add("Aysu");
        linkedList.add(12.4);
        linkedList.add(null);
        System.out.println(linkedList);


    }
}
