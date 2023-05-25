package com.mimaraslan;

import java.util.ArrayList;
import java.util.Iterator;

public class AppMain {

    public static void main(String[] args) {

        ArrayList <String> personList = new ArrayList<>();
        personList.add("Gizem");
        personList.add("Aminenur");
        personList.add("Engin");
        personList.add("Ali");
        personList.add("Caner");
        personList.add("Aysu");
        personList.add("Serkan");

        System.out.println(personList);

        Iterator <String> iterator = personList.iterator();
      //  System.out.println(iterator.next());

        String arananIsim;
        while (iterator.hasNext()){
            arananIsim = iterator.next();
         //   System.out.println("ARANAN ISIM: " + arananIsim + " ");

            if((arananIsim == "Ali") || (arananIsim == "Serkan")){
            //    System.out.println("\nAli ya da Serkan bulundu.");
                iterator.remove();
            }
        }

        System.out.println(personList);

    }
}
