package com.mimaraslan;
public class AppMain { // SCOPE - BODY (GOVDE)

    static int b = 25;

    public static void main(String[] args) {  // SCOPE - BODY (GOVDE)
        // 35
        int a = 10 + b;
                          //35      25
        System.out.println(a + " " + b);
    }


    void selamVer() { // SCOPE - BODY (GOVDE)

        int a = 0;
        int b = 1;
                        // 0      1
        System.out.println(a + " " + b);
    }



}