package com.mimaraslan.v4IciceIstisnalar;

public class AppMain {

    public static void main(String[] args) {

        int myArr[] = new int[6];

        try {

            myArr[2] = 10;
            myArr[4] = 5;
            myArr[0] = myArr[2] / myArr[4];
            //   myArr[13] = 200;

            try {
                myArr[13] = 200;
            } catch (NullPointerException e) {
                System.out.println("İcteki catch 1: " + e);
            } catch (Exception e) {
                System.out.println("İcteki catch 2: " + e);
            } finally {
                System.out.println("İcteki finally");
            }

        } catch (ArithmeticException e) {
            System.out.println("Dıştaki catch 1: " + e);
        } catch (Exception e) {
            System.out.println("Dıştaki catch 2: " + e);
        } finally {
            System.out.println("Dıştaki finally");
        }

        System.out.println(myArr);


    }
}
