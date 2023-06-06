package com.mimaraslan;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _04_StreamdenListeye {

    public static void main(String[] args) {

        Stream <String> myStream = Stream.of("Ünal","Gani","Salih", "Gizem", "Abdullah", "Ali", "Ahmet", "Aysu", "Aysu");
        TreeSet<String> myTreeSet = myStream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(myTreeSet);

        System.out.println("-------------------");

        Stream <String> myStream2 = Stream.of("Ünal","Gani","Salih", "Gizem", "Abdullah", "Ali", "Ahmet", "Aysu", "Aysu");
        TreeSet<String> myTreeSet2 = myStream2.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(myTreeSet2);

        System.out.println("-------------------");

        Stream <String> myStream3 = Stream.of("Ünal","Gani","Salih", "Gizem", "Abdullah", "Ali", "Ahmet", "Aysu", "Aysu");
       // myStream3.sorted().forEach(System.out::println);

        myStream3
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println("-------------------");

        Stream <String> myStream4 = Stream.of("Ünal","Gani","Salih", "Gizem", "Abdullah", "Ali", "Ahmet", "Aysu", "Aysu");
        TreeSet<String> myTreeSet4 = myStream4
                .filter(isim -> isim.startsWith("A") || isim.contains("i"))
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(myTreeSet4);

        System.out.println("-------------------");

    }
}
