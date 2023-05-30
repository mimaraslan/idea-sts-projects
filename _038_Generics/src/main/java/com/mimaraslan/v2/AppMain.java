package com.mimaraslan.v2;

import java.util.ArrayList;

public class AppMain {

    public static void main(String[] args) {
        ArrayList <String> listeArrayList = new ArrayList<>();

        ListManager<String> listeBanaOzel = new ListManager<>();
        listeBanaOzel.lisyeEkle("Aminenur");
        listeBanaOzel.lisyeEkle("Aysu");
        listeBanaOzel.lisyeEkle("Gizem");
        System.out.println(listeBanaOzel.listeyiGetir());

        ListManager<Integer> listeBanaOzel2 = new ListManager<>();
        listeBanaOzel2.lisyeEkle(100);
        listeBanaOzel2.lisyeEkle(200);
        listeBanaOzel2.lisyeEkle(300);
        System.out.println(listeBanaOzel2.listeyiGetir());

        for ( ListManager<String>  madde :  listeBanaOzel) {
            System.out.println(madde);
        }


    }
}
