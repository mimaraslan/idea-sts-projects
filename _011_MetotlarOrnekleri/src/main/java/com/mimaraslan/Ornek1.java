package com.mimaraslan;
public class Ornek1 {

    int a = 1;

    public static void main(String[] args) { // scope
        int a = 2;
        System.out.println(a); // 2

        Ornek1 obj = new Ornek1();
        obj.selamVer(); // 3

        System.out.println(obj.a); // 1
    }

    private void selamVer() {
        int a = 3;
        System.out.println(a); // 3
    }

}