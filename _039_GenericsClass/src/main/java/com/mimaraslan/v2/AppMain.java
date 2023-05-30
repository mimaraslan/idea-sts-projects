package com.mimaraslan.v2;

public class AppMain {

    public static void main(String[] args) {
                       // GelenTip1 , GelenTip2
        JenerikSinifCiftli <Integer, String> obj1 = new JenerikSinifCiftli<>(01, "Adana");
        JenerikSinifCiftli <String, String> obj2 = new JenerikSinifCiftli<>("06", "Ankara");

        obj1.bilgiGoster();
        System.out.println(obj1.getPlaka() + " " + obj1.getSehir());
        System.out.println("------------------------");
        obj2.bilgiGoster();
        System.out.println(obj2.getPlaka() + " " + obj2.getSehir());

    }
}
