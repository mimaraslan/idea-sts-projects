package com.mimaraslan.v1;

import java.util.ArrayList;
import java.util.List;

public class AppMain {


    public static void main(String[] args) {

        //   nongeneric
        List         listNonGeneric = new ArrayList  ();
        listNonGeneric.add(1);
        listNonGeneric.add(true);
        listNonGeneric.add(3.2);
        listNonGeneric.add(null);
        System.out.println(listNonGeneric);
        System.out.println(listNonGeneric.get(0));

        //   generic
        List<String> listGeneric = new ArrayList<>();
        listGeneric.add("Burak");
        listGeneric.add("Salih");
        listGeneric.add("Abdullah");
        listGeneric.add(null);
        System.out.println(listGeneric);
        System.out.println(listGeneric.get(0));

    }


}