package com.mimaraslan;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        List myList = new ArrayList<>();
        myList.add(10);
        myList.add("Burak");
        System.out.println(myList);


        Set myList2 = new LinkedHashSet();
        myList2.add(10);
        myList2.add("Burak");
        System.out.println(myList2);


    }
}
