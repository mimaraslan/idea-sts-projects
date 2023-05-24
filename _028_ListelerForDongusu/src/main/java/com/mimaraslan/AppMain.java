package com.mimaraslan;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {
        List <String> listeOgrenci = new ArrayList<>();
        listeOgrenci.add("Ahmet");
        listeOgrenci.add("Gizem");
        listeOgrenci.add("Ali");
        listeOgrenci.add("Salih");
        listeOgrenci.add("Burak");
        System.out.println(listeOgrenci);

        for (String ogrenci : listeOgrenci) {
            System.out.println(ogrenci);
        }

        System.out.println("------------------------------------------");
        for (int i = 0; i < listeOgrenci.size(); i++) {
            System.out.print(listeOgrenci.get(i) + " ");
        }
        System.out.println("\n------------------------------------------");
        listeOgrenci.forEach(ogrenci-> System.out.print(ogrenci + " "));




    }
}
