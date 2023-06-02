package com.mimaraslan.v1;

import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        float sonuc = (float) a/b;

        System.out.println(  a + " / " + b + " = "  + sonuc);

    }

}