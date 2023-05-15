package com.mimaraslan.ornekler;

public class Yildizlar {

    public static void main(String[] args) {

        for (int i = 0; i < 4 ; i++) { // sAtir

            for (int j = 0; j < 5; j++) { // sUtun kolon
                System.out.print("* ");
            }

            System.out.println();
        }

       cizgiCek();


        for (int i = 0; i < 4 ; i++) { // sAtir
            for (int j = 0; j < i; j++) { // sUtun kolon
                System.out.print("* ");
            }
            System.out.println();
        }

        cizgiCek();


        for (int i = 4; i > 0 ; i--) { // sAtir
            for (int j = 0; j < i; j++) { // sUtun kolon
                System.out.print("* ");
            }
            System.out.println();
        }

        cizgiCek();

        /*
        SORU

* * * * *
* * * * *
* * * * *
* * * * *
* * * *
* * *
* *
*



         */

        for (int i = 0; i < 4; i++) {
            System.out.println("* * * * *");
        }

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print ("* ");
            }
            System.out.println();
        }



    }

    private static void cizgiCek() {
        System.out.println("------------------------------");
    }
}
