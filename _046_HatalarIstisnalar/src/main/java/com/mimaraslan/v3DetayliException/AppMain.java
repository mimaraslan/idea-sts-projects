package com.mimaraslan.v3DetayliException;

import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        try {
            System.out.println("try: HATAYA AÇIK KODLAR.");
            Integer a = read.nextInt();
            Integer b = read.nextInt();
            Integer sonuc = a / b;
            System.out.println(a + " / " + b + " = " + sonuc);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException:........ " + e);
            System.out.println("catch 1: HATAnın açıklaması ve yapılacaklar.");

        } catch (RuntimeException e) {
            System.out.println("RuntimeException:........ " + e);
            System.out.println("catch 2: HATAnın açıklaması ve yapılacaklar.");

        } catch (Exception e) {
            System.out.println("Exception:........ " + e);
            System.out.println("catch 3: HATAnın açıklaması ve yapılacaklar.");

        } finally {
            System.out.println("finally: Sonda ne olmasını istiyorsak onlar yapılır.");
        }


        System.out.println("---------------------------------");

    }

}