package com.mimaraslan.ornekler;

public class StringSub {
    public static void main(String[] args) {

                    //0123456789
        String str = "Ahmet Mehmet Ali Veli";
        System.out.println("Last 4 char String: " + str.substring(str.length() - 4));
        System.out.println("First 4 char String: " + str.substring(0, 4));
        System.out.println("Secilen: " + str.substring(2, 8));

        "hamburger".substring(4, 8); // returns "urge"
        "smiles".substring(1, 5); //returns "mile"
    }
}
